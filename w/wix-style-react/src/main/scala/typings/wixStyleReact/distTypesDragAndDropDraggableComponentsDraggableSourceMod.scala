package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.Text
import typings.wixStyleReact.anon.ItemWidth
import typings.wixStyleReact.anon.PointerEvents
import typings.wixStyleReact.anon.PreviewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableComponentsDraggableSourceMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/components/DraggableSource", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof DraggableSource, imported_react-dnd.Omit<any, 'isDragging' | 'connectDragSource' | 'connectDragPreview'>> */ Any = js.native
  
  @js.native
  trait DraggableSource extends Component[Any, Any, Any] {
    
    def _getWrapperStyles(): PointerEvents = js.native
    
    def _renderDraggableItem(): Element = js.native
    
    def _renderPreview(param0: PreviewStyles): Any = js.native
    
    def _renderPreviewItem(): Element = js.native
    
    def _setRootNode(node: Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDraggableSource(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDraggableSource(prevProps: Any): Unit = js.native
    
    var handleNode: js.UndefOr[typings.std.Element | Text | Null] = js.native
    
    var rootNode: Null = js.native
    
    @JSName("state")
    var state_DraggableSource: ItemWidth = js.native
    
    def updateDiff(): Unit = js.native
    
    def updateItemWidth(): Unit = js.native
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof DraggableSource, imported_react-dnd.Omit<any, 'isDragging' | 'connectDragSource' | 'connectDragPreview'>> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distTypesDragAndDropDraggableComponentsDraggableSourceMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof DraggableSource, imported_react-dnd.Omit<any, 'isDragging' | 'connectDragSource' | 'connectDragPreview'>> */ Any = default
}
