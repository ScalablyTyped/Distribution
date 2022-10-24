package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableComponentsContainerMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/components/Container", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof Container, imported_react-dnd.Omit<any, 'connectDropTarget'>> */ Any = js.native
  
  @js.native
  trait Container extends PureComponent[Any, Any, Any] {
    
    var childNode: Any = js.native
    
    var rootNode: Any = js.native
    
    def setChildRef(node: Any): Any = js.native
    
    def setRootRef(node: Any): Any = js.native
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof Container, imported_react-dnd.Omit<any, 'connectDropTarget'>> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distTypesDragAndDropDraggableComponentsContainerMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof Container, imported_react-dnd.Omit<any, 'connectDropTarget'>> */ Any = default
}
