package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeDataProvider[T] extends StObject {
  
  /**
    * Get the children of `element` or root if no element is passed.
    *
    * @param element The element from which the provider gets children. Can be `undefined`.
    * @return Children of `element` or root if no element is passed.
    */
  def getChildren(): ProviderResult[js.Array[T]] = js.native
  def getChildren(element: T): ProviderResult[js.Array[T]] = js.native
  
  /**
    * Optional method to return the parent of `element`.
    * Return `null` or `undefined` if `element` is a child of root.
    *
    * **NOTE:** This method should be implemented in order to access {@link TreeView.reveal reveal} API.
    *
    * @param element The element for which the parent has to be returned.
    * @return Parent of `element`.
    */
  var getParent: js.UndefOr[js.Function1[/* element */ T, ProviderResult[T]]] = js.native
  
  /**
    * Get {@link TreeItem} representation of the `element`
    *
    * @param element The element for which {@link TreeItem} representation is asked for.
    * @return TreeItem representation of the element.
    */
  def getTreeItem(element: T): TreeItem | Thenable[TreeItem] = js.native
  
  /**
    * An optional event to signal that an element or root has changed.
    * This will trigger the view to update the changed element/root and its children recursively (if shown).
    * To signal that root has changed, do not pass any argument or pass `undefined` or `null`.
    */
  var onDidChangeTreeData: js.UndefOr[Event[js.UndefOr[T | js.Array[T] | Null | Unit]]] = js.native
  
  /**
    * Called on hover to resolve the {@link TreeItem.tooltip TreeItem} property if it is undefined.
    * Called on tree item click/open to resolve the {@link TreeItem.command TreeItem} property if it is undefined.
    * Only properties that were undefined can be resolved in `resolveTreeItem`.
    * Functionality may be expanded later to include being called to resolve other missing
    * properties on selection and/or on open.
    *
    * Will only ever be called once per TreeItem.
    *
    * onDidChangeTreeData should not be triggered from within resolveTreeItem.
    *
    * *Note* that this function is called when tree items are already showing in the UI.
    * Because of that, no property that changes the presentation (label, description, etc.)
    * can be changed.
    *
    * @param item Undefined properties of `item` should be set then `item` should be returned.
    * @param element The object associated with the TreeItem.
    * @param token A cancellation token.
    * @return The resolved tree item or a thenable that resolves to such. It is OK to return the given
    * `item`. When no result is returned, the given `item` will be used.
    */
  var resolveTreeItem: js.UndefOr[
    js.Function3[
      /* item */ TreeItem, 
      /* element */ T, 
      /* token */ CancellationToken, 
      ProviderResult[TreeItem]
    ]
  ] = js.native
}
