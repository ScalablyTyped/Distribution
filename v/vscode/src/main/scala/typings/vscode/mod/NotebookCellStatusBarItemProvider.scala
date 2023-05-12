package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCellStatusBarItemProvider extends StObject {
  
  /**
  		 * An optional event to signal that statusbar items have changed. The provide method will be called again.
  		 */
  var onDidChangeCellStatusBarItems: js.UndefOr[Event[Unit]] = js.undefined
  
  /**
  		 * The provider will be called when the cell scrolls into view, when its content, outputs, language, or metadata change, and when it changes execution state.
  		 * @param cell The cell for which to return items.
  		 * @param token A token triggered if this request should be cancelled.
  		 * @return One or more {@link NotebookCellStatusBarItem cell statusbar items}
  		 */
  def provideCellStatusBarItems(cell: NotebookCell, token: CancellationToken): ProviderResult[NotebookCellStatusBarItem | js.Array[NotebookCellStatusBarItem]]
}
object NotebookCellStatusBarItemProvider {
  
  inline def apply(
    provideCellStatusBarItems: (NotebookCell, CancellationToken) => ProviderResult[NotebookCellStatusBarItem | js.Array[NotebookCellStatusBarItem]]
  ): NotebookCellStatusBarItemProvider = {
    val __obj = js.Dynamic.literal(provideCellStatusBarItems = js.Any.fromFunction2(provideCellStatusBarItems))
    __obj.asInstanceOf[NotebookCellStatusBarItemProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookCellStatusBarItemProvider] (val x: Self) extends AnyVal {
    
    inline def setOnDidChangeCellStatusBarItems(
      value: (/* listener */ js.Function1[Unit, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidChangeCellStatusBarItems", js.Any.fromFunction3(value))
    
    inline def setOnDidChangeCellStatusBarItemsUndefined: Self = StObject.set(x, "onDidChangeCellStatusBarItems", js.undefined)
    
    inline def setProvideCellStatusBarItems(
      value: (NotebookCell, CancellationToken) => ProviderResult[NotebookCellStatusBarItem | js.Array[NotebookCellStatusBarItem]]
    ): Self = StObject.set(x, "provideCellStatusBarItems", js.Any.fromFunction2(value))
  }
}
