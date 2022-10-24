package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.wixStyleReact.anon.ContainerId
import typings.wixStyleReact.anon.Delayed
import typings.wixStyleReact.anon.ListOfPropsThatAffectItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableDraggableMod {
  
  @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", JSImport.Default)
  @js.native
  open class default protected () extends Draggable {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.defaultProps.droppable")
      @js.native
      val droppable: Boolean = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.animationDuration")
      @js.native
      val animationDuration: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.animationTiming")
      @js.native
      val animationTiming: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.canDrag")
      @js.native
      val canDrag: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.containerId")
      @js.native
      val containerId: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.delay")
      @js.native
      val delay: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.droppable_1")
      @js.native
      val droppable1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.groupName")
      @js.native
      val groupName: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.hasDragged")
      @js.native
      val hasDragged: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.id")
      @js.native
      val id: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.index")
      @js.native
      val index: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.item")
      @js.native
      val item: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.listOfPropsThatAffectItems")
      @js.native
      val listOfPropsThatAffectItems: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.onDragEnd")
      @js.native
      val onDragEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.onDragStart")
      @js.native
      val onDragStart: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.onDrop")
      @js.native
      val onDrop: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.onHover")
      @js.native
      val onHover: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.onMoveOut")
      @js.native
      val onMoveOut: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.renderItem")
      @js.native
      val renderItem: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.setWrapperNode")
      @js.native
      val setWrapperNode: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.shift")
      @js.native
      val shift: Requireable[js.Array[js.UndefOr[Double | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "default.propTypes.withHandle")
      @js.native
      val withHandle: Requireable[Boolean] = js.native
    }
  }
  
  @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable")
  @js.native
  open class Draggable protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
    
    def canDrag(param0: ContainerId): Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDraggable(): Unit = js.native
    
    def countDelay(): Unit = js.native
    
    var delayTimer: Null = js.native
    
    def onDragEnd(param0: ContainerId): Unit = js.native
    
    def onDragStart(param0: ContainerId): Unit = js.native
    
    def resetDelayState(): Unit = js.native
    
    def resetDelayTimer(): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MDraggable(param0: ListOfPropsThatAffectItems, nextState: Any): Boolean = js.native
    
    @JSName("state")
    var state_Draggable: Delayed = js.native
  }
  object Draggable {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.defaultProps.droppable")
      @js.native
      val droppable: Boolean = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.animationDuration")
      @js.native
      val animationDuration: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.animationTiming")
      @js.native
      val animationTiming: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.canDrag")
      @js.native
      val canDrag: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.containerId")
      @js.native
      val containerId: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.delay")
      @js.native
      val delay: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.droppable_1")
      @js.native
      val droppable1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.groupName")
      @js.native
      val groupName: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.hasDragged")
      @js.native
      val hasDragged: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.id")
      @js.native
      val id: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.index")
      @js.native
      val index: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.item")
      @js.native
      val item: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.listOfPropsThatAffectItems")
      @js.native
      val listOfPropsThatAffectItems: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.onDragEnd")
      @js.native
      val onDragEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.onDragStart")
      @js.native
      val onDragStart: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.onDrop")
      @js.native
      val onDrop: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.onHover")
      @js.native
      val onHover: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.onMoveOut")
      @js.native
      val onMoveOut: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.renderItem")
      @js.native
      val renderItem: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.setWrapperNode")
      @js.native
      val setWrapperNode: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.shift")
      @js.native
      val shift: Requireable[js.Array[js.UndefOr[Double | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/Draggable", "Draggable.propTypes.withHandle")
      @js.native
      val withHandle: Requireable[Boolean] = js.native
    }
  }
}
