package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeDragAndDropController[T] extends StObject {
  
  /**
    * The mime types that the {@link TreeDragAndDropController.handleDrag `handleDrag`} method of this `TreeDragAndDropController` may add to the tree data transfer.
    * This could be well-defined, existing, mime types, and also mime types defined by the extension.
    *
    * The recommended mime type of the tree (`application/vnd.code.tree.<treeidlowercase>`) will be automatically added.
    */
  val dragMimeTypes: js.Array[String]
  
  /**
    * The mime types that the {@link TreeDragAndDropController.handleDrop `handleDrop`} method of this `DragAndDropController` supports.
    * This could be well-defined, existing, mime types, and also mime types defined by the extension.
    *
    * To support drops from trees, you will need to add the mime type of that tree.
    * This includes drops from within the same tree.
    * The mime type of a tree is recommended to be of the format `application/vnd.code.tree.<treeidlowercase>`.
    *
    * Use the special `files` mime type to support all types of dropped files {@link DataTransferFile files}, regardless of the file's actual mime type.
    *
    * To learn the mime type of a dragged item:
    * 1. Set up your `DragAndDropController`
    * 2. Use the Developer: Set Log Level... command to set the level to "Debug"
    * 3. Open the developer tools and drag the item with unknown mime type over your tree. The mime types will be logged to the developer console
    *
    * Note that mime types that cannot be sent to the extension will be omitted.
    */
  val dropMimeTypes: js.Array[String]
  
  /**
    * When the user starts dragging items from this `DragAndDropController`, `handleDrag` will be called.
    * Extensions can use `handleDrag` to add their {@link DataTransferItem `DataTransferItem`} items to the drag and drop.
    *
    * When the items are dropped on **another tree item** in **the same tree**, your `DataTransferItem` objects
    * will be preserved. Use the recommended mime type for the tree (`application/vnd.code.tree.<treeidlowercase>`) to add
    * tree objects in a data transfer. See the documentation for `DataTransferItem` for how best to take advantage of this.
    *
    * To add a data transfer item that can be dragged into the editor, use the application specific mime type "text/uri-list".
    * The data for "text/uri-list" should be a string with `toString()`ed Uris separated by newlines. To specify a cursor position in the file,
    * set the Uri's fragment to `L3,5`, where 3 is the line number and 5 is the column number.
    *
    * @param source The source items for the drag and drop operation.
    * @param dataTransfer The data transfer associated with this drag.
    * @param token A cancellation token indicating that drag has been cancelled.
    */
  var handleDrag: js.UndefOr[
    js.Function3[
      /* source */ js.Array[T], 
      /* dataTransfer */ DataTransfer, 
      /* token */ CancellationToken, 
      Thenable[Unit] | Unit
    ]
  ] = js.undefined
  
  /**
    * Called when a drag and drop action results in a drop on the tree that this `DragAndDropController` belongs to.
    *
    * Extensions should fire {@link TreeDataProvider.onDidChangeTreeData onDidChangeTreeData} for any elements that need to be refreshed.
    *
    * @param dataTransfer The data transfer items of the source of the drag.
    * @param target The target tree element that the drop is occurring on. When undefined, the target is the root.
    * @param token A cancellation token indicating that the drop has been cancelled.
    */
  var handleDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[T], 
      /* dataTransfer */ DataTransfer, 
      /* token */ CancellationToken, 
      Thenable[Unit] | Unit
    ]
  ] = js.undefined
}
object TreeDragAndDropController {
  
  inline def apply[T](dragMimeTypes: js.Array[String], dropMimeTypes: js.Array[String]): TreeDragAndDropController[T] = {
    val __obj = js.Dynamic.literal(dragMimeTypes = dragMimeTypes.asInstanceOf[js.Any], dropMimeTypes = dropMimeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDragAndDropController[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeDragAndDropController[?], T] (val x: Self & TreeDragAndDropController[T]) extends AnyVal {
    
    inline def setDragMimeTypes(value: js.Array[String]): Self = StObject.set(x, "dragMimeTypes", value.asInstanceOf[js.Any])
    
    inline def setDragMimeTypesVarargs(value: String*): Self = StObject.set(x, "dragMimeTypes", js.Array(value*))
    
    inline def setDropMimeTypes(value: js.Array[String]): Self = StObject.set(x, "dropMimeTypes", value.asInstanceOf[js.Any])
    
    inline def setDropMimeTypesVarargs(value: String*): Self = StObject.set(x, "dropMimeTypes", js.Array(value*))
    
    inline def setHandleDrag(
      value: (/* source */ js.Array[T], /* dataTransfer */ DataTransfer, /* token */ CancellationToken) => Thenable[Unit] | Unit
    ): Self = StObject.set(x, "handleDrag", js.Any.fromFunction3(value))
    
    inline def setHandleDragUndefined: Self = StObject.set(x, "handleDrag", js.undefined)
    
    inline def setHandleDrop(
      value: (/* target */ js.UndefOr[T], /* dataTransfer */ DataTransfer, /* token */ CancellationToken) => Thenable[Unit] | Unit
    ): Self = StObject.set(x, "handleDrop", js.Any.fromFunction3(value))
    
    inline def setHandleDropUndefined: Self = StObject.set(x, "handleDrop", js.undefined)
  }
}
