package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.anon.AddedIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableMod {
  
  @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DraggableProps, js.Object, Any]
  
  type DragEventFn = js.Function1[/* params */ DragEventParams, Unit]
  
  trait DragEventParams extends StObject {
    
    var containerId: String
    
    var groupName: String
    
    var id: String | Double
    
    var index: Double
    
    var item: js.Object
  }
  object DragEventParams {
    
    inline def apply(containerId: String, groupName: String, id: String | Double, index: Double, item: js.Object): DragEventParams = {
      val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragEventParams]
    }
    
    extension [Self <: DragEventParams](x: Self) {
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type Draggable = Component[DraggableProps, js.Object, Any]
  
  trait DraggableProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var animationTiming: js.UndefOr[String] = js.undefined
    
    var canDrag: js.UndefOr[DragEventFn] = js.undefined
    
    var containerId: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var droppable: js.UndefOr[Boolean] = js.undefined
    
    var groupName: js.UndefOr[String] = js.undefined
    
    var hasDragged: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[Double | String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var item: js.UndefOr[js.Object] = js.undefined
    
    var listOfPropsThatAffectItems: js.UndefOr[js.Array[Any]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventFn] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventFn] = js.undefined
    
    var onDrop: js.UndefOr[js.Function] = js.undefined
    
    var onHover: js.UndefOr[HoverEventFn] = js.undefined
    
    var onMoveOut: js.UndefOr[js.Function1[/* id */ Any, Unit]] = js.undefined
    
    var renderItem: js.UndefOr[js.Function1[/* data */ js.Object, ReactNode]] = js.undefined
    
    var setWrapperNode: js.UndefOr[
        js.Function3[/* node */ HTMLElement, /* index */ Double, /* item */ js.Object, Unit]
      ] = js.undefined
    
    var shift: js.UndefOr[js.Array[Double]] = js.undefined
    
    var withHandle: js.UndefOr[Boolean] = js.undefined
  }
  object DraggableProps {
    
    inline def apply(): DraggableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggableProps]
    }
    
    extension [Self <: DraggableProps](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationTiming(value: String): Self = StObject.set(x, "animationTiming", value.asInstanceOf[js.Any])
      
      inline def setAnimationTimingUndefined: Self = StObject.set(x, "animationTiming", js.undefined)
      
      inline def setCanDrag(value: /* params */ DragEventParams => Unit): Self = StObject.set(x, "canDrag", js.Any.fromFunction1(value))
      
      inline def setCanDragUndefined: Self = StObject.set(x, "canDrag", js.undefined)
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
      
      inline def setHasDragged(value: Boolean): Self = StObject.set(x, "hasDragged", value.asInstanceOf[js.Any])
      
      inline def setHasDraggedUndefined: Self = StObject.set(x, "hasDragged", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setListOfPropsThatAffectItems(value: js.Array[Any]): Self = StObject.set(x, "listOfPropsThatAffectItems", value.asInstanceOf[js.Any])
      
      inline def setListOfPropsThatAffectItemsUndefined: Self = StObject.set(x, "listOfPropsThatAffectItems", js.undefined)
      
      inline def setListOfPropsThatAffectItemsVarargs(value: Any*): Self = StObject.set(x, "listOfPropsThatAffectItems", js.Array(value*))
      
      inline def setOnDragEnd(value: /* params */ DragEventParams => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: /* params */ DragEventParams => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDrop(value: js.Function): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnHover(value: /* params */ AddedIndex => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setOnMoveOut(value: /* id */ Any => Unit): Self = StObject.set(x, "onMoveOut", js.Any.fromFunction1(value))
      
      inline def setOnMoveOutUndefined: Self = StObject.set(x, "onMoveOut", js.undefined)
      
      inline def setRenderItem(value: /* data */ js.Object => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setSetWrapperNode(value: (/* node */ HTMLElement, /* index */ Double, /* item */ js.Object) => Unit): Self = StObject.set(x, "setWrapperNode", js.Any.fromFunction3(value))
      
      inline def setSetWrapperNodeUndefined: Self = StObject.set(x, "setWrapperNode", js.undefined)
      
      inline def setShift(value: js.Array[Double]): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setShiftVarargs(value: Double*): Self = StObject.set(x, "shift", js.Array(value*))
      
      inline def setWithHandle(value: Boolean): Self = StObject.set(x, "withHandle", value.asInstanceOf[js.Any])
      
      inline def setWithHandleUndefined: Self = StObject.set(x, "withHandle", js.undefined)
    }
  }
  
  type HoverEventFn = js.Function1[/* params */ AddedIndex, Unit]
}
