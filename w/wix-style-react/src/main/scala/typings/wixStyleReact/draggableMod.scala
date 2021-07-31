package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.anon.AddedIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggableMod {
  
  @JSImport("wix-style-react/dist/es/src/DragAndDrop/Draggable", JSImport.Default)
  @js.native
  class default ()
    extends Component[DraggableProps, js.Object, js.Any]
  
  type DragEventFn = js.Function1[/* params */ DragEventParams, Unit]
  
  trait DragEventParams extends StObject {
    
    var containerId: String
    
    var groupName: String
    
    var id: String | Double
    
    var index: Double
    
    var item: js.Object
  }
  object DragEventParams {
    
    @scala.inline
    def apply(containerId: String, groupName: String, id: String | Double, index: Double, item: js.Object): DragEventParams = {
      val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragEventParams]
    }
    
    @scala.inline
    implicit class DragEventParamsMutableBuilder[Self <: DragEventParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type Draggable = Component[DraggableProps, js.Object, js.Any]
  
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
    
    var listOfPropsThatAffectItems: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventFn] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventFn] = js.undefined
    
    var onDrop: js.UndefOr[js.Function] = js.undefined
    
    var onHover: js.UndefOr[HoverEventFn] = js.undefined
    
    var onMoveOut: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.undefined
    
    var renderItem: js.UndefOr[js.Function1[/* data */ js.Object, ReactNode]] = js.undefined
    
    var setWrapperNode: js.UndefOr[
        js.Function3[/* node */ HTMLElement, /* index */ Double, /* item */ js.Object, Unit]
      ] = js.undefined
    
    var shift: js.UndefOr[js.Array[Double]] = js.undefined
    
    var withHandle: js.UndefOr[Boolean] = js.undefined
  }
  object DraggableProps {
    
    @scala.inline
    def apply(): DraggableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggableProps]
    }
    
    @scala.inline
    implicit class DraggablePropsMutableBuilder[Self <: DraggableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationTiming(value: String): Self = StObject.set(x, "animationTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTimingUndefined: Self = StObject.set(x, "animationTiming", js.undefined)
      
      @scala.inline
      def setCanDrag(value: /* params */ DragEventParams => Unit): Self = StObject.set(x, "canDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanDragUndefined: Self = StObject.set(x, "canDrag", js.undefined)
      
      @scala.inline
      def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      @scala.inline
      def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
      
      @scala.inline
      def setHasDragged(value: Boolean): Self = StObject.set(x, "hasDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasDraggedUndefined: Self = StObject.set(x, "hasDragged", js.undefined)
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setListOfPropsThatAffectItems(value: js.Array[js.Any]): Self = StObject.set(x, "listOfPropsThatAffectItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListOfPropsThatAffectItemsUndefined: Self = StObject.set(x, "listOfPropsThatAffectItems", js.undefined)
      
      @scala.inline
      def setListOfPropsThatAffectItemsVarargs(value: js.Any*): Self = StObject.set(x, "listOfPropsThatAffectItems", js.Array(value :_*))
      
      @scala.inline
      def setOnDragEnd(value: /* params */ DragEventParams => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* params */ DragEventParams => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDrop(value: js.Function): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnHover(value: /* params */ AddedIndex => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setOnMoveOut(value: /* id */ js.Any => Unit): Self = StObject.set(x, "onMoveOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveOutUndefined: Self = StObject.set(x, "onMoveOut", js.undefined)
      
      @scala.inline
      def setRenderItem(value: /* data */ js.Object => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      @scala.inline
      def setSetWrapperNode(value: (/* node */ HTMLElement, /* index */ Double, /* item */ js.Object) => Unit): Self = StObject.set(x, "setWrapperNode", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetWrapperNodeUndefined: Self = StObject.set(x, "setWrapperNode", js.undefined)
      
      @scala.inline
      def setShift(value: js.Array[Double]): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      @scala.inline
      def setShiftVarargs(value: Double*): Self = StObject.set(x, "shift", js.Array(value :_*))
      
      @scala.inline
      def setWithHandle(value: Boolean): Self = StObject.set(x, "withHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithHandleUndefined: Self = StObject.set(x, "withHandle", js.undefined)
    }
  }
  
  type HoverEventFn = js.Function1[/* params */ AddedIndex, Unit]
}
