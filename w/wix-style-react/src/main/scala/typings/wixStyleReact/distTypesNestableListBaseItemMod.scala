package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.std.Element
import typings.std.Text
import typings.wixStyleReact.anon.ShouldRenderChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNestableListBaseItemMod {
  
  @JSImport("wix-style-react/dist/types/NestableListBase/Item", JSImport.Default)
  @js.native
  open class default protected () extends ItemWithContext {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  
  @JSImport("wix-style-react/dist/types/NestableListBase/Item", "DragItemSource")
  @js.native
  val DragItemSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof Item, imported_react-dnd.Omit<any, 'connectDragSource' | 'connectDragPreview' | 'isPlaceholder' | 'dragged'>> */ Any = js.native
  
  @JSImport("wix-style-react/dist/types/NestableListBase/Item", "DropItemTarget")
  @js.native
  val DropItemTarget: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<imported_react-dnd.DndComponentClass<typeof Item, imported_react-dnd.Omit<any, 'connectDragSource' | 'connectDragPreview' | 'isPlaceholder' | 'dragged'>>, imported_react-dnd.Omit<imported_react-dnd.Omit<any, 'connectDragSource' | 'connectDragPreview' | 'isPlaceholder' | 'dragged'>, 'connectDropTarget'>> */ Any = js.native
  
  @js.native
  trait Item extends PureComponent[Any, Any, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MItem(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MItem(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MItem(): Unit = js.native
    
    var handleNode: js.UndefOr[Element | Text | Null] = js.native
    
    @JSName("state")
    var state_Item: ShouldRenderChildren = js.native
    
    var unmounted: Boolean = js.native
    
    def updateShouldRenderChildren(): Unit = js.native
  }
  
  @js.native
  trait ItemWithContext extends PureComponent[Any, Any, Any]
}
