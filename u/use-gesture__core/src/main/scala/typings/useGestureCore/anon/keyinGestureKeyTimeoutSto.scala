package typings.useGestureCore.anon

import typings.useGestureCore.timeoutStoreMod.TimeoutStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @use-gesture/core.@use-gesture/core/dist/declarations/src/types.GestureKey ]:? @use-gesture/core.@use-gesture/core/dist/declarations/src/TimeoutStore.TimeoutStore} */
trait keyinGestureKeyTimeoutSto extends StObject {
  
  var drag: js.UndefOr[TimeoutStore] = js.undefined
  
  var hover: js.UndefOr[TimeoutStore] = js.undefined
  
  var move: js.UndefOr[TimeoutStore] = js.undefined
  
  var pinch: js.UndefOr[TimeoutStore] = js.undefined
  
  var scroll: js.UndefOr[TimeoutStore] = js.undefined
  
  var wheel: js.UndefOr[TimeoutStore] = js.undefined
}
object keyinGestureKeyTimeoutSto {
  
  inline def apply(): keyinGestureKeyTimeoutSto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinGestureKeyTimeoutSto]
  }
  
  extension [Self <: keyinGestureKeyTimeoutSto](x: Self) {
    
    inline def setDrag(value: TimeoutStore): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setHover(value: TimeoutStore): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setMove(value: TimeoutStore): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setPinch(value: TimeoutStore): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    inline def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
    
    inline def setScroll(value: TimeoutStore): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setWheel(value: TimeoutStore): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    
    inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
  }
}
