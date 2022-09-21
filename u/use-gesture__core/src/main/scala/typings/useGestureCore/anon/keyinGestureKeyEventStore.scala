package typings.useGestureCore.anon

import typings.useGestureCore.eventStoreMod.EventStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @use-gesture/core.@use-gesture/core/dist/declarations/src/types.GestureKey ]:? @use-gesture/core.@use-gesture/core/dist/declarations/src/EventStore.EventStore} */
trait keyinGestureKeyEventStore extends StObject {
  
  var drag: js.UndefOr[EventStore] = js.undefined
  
  var hover: js.UndefOr[EventStore] = js.undefined
  
  var move: js.UndefOr[EventStore] = js.undefined
  
  var pinch: js.UndefOr[EventStore] = js.undefined
  
  var scroll: js.UndefOr[EventStore] = js.undefined
  
  var wheel: js.UndefOr[EventStore] = js.undefined
}
object keyinGestureKeyEventStore {
  
  inline def apply(): keyinGestureKeyEventStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinGestureKeyEventStore]
  }
  
  extension [Self <: keyinGestureKeyEventStore](x: Self) {
    
    inline def setDrag(value: EventStore): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setHover(value: EventStore): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setMove(value: EventStore): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setPinch(value: EventStore): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    inline def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
    
    inline def setScroll(value: EventStore): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setWheel(value: EventStore): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    
    inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
  }
}
