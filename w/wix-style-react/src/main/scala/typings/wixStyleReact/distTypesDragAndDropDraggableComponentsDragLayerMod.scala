package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ReadonlychildrenReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableComponentsDragLayerMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/components/DragLayer", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof CustomDragLayer, imported_react-dnd.Omit<any, 'item' | 'itemType' | 'isDragging' | 'offsetOfHandle'>> */ Any = js.native
  
  @js.native
  trait CustomDragLayer extends Component[Any, Any, Any] {
    
    def renderPreview(): Element = js.native
    
    def renderPreviewInPortal(): Element = js.native
    
    def shouldRenderLayer(): Any = js.native
    def shouldRenderLayer(props: Any & ReadonlychildrenReactNode): Any = js.native
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof CustomDragLayer, imported_react-dnd.Omit<any, 'item' | 'itemType' | 'isDragging' | 'offsetOfHandle'>> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distTypesDragAndDropDraggableComponentsDragLayerMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof CustomDragLayer, imported_react-dnd.Omit<any, 'item' | 'itemType' | 'isDragging' | 'offsetOfHandle'>> */ Any = default
}
