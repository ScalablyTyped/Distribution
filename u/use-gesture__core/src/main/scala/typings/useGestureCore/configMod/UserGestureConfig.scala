package typings.useGestureCore.configMod

import typings.useGestureCore.anon.enabledbooleanundefinedHo
import typings.useGestureCore.useGestureCoreStrings.scroll
import typings.useGestureCore.useGestureCoreStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserGestureConfig
  extends StObject
     with GenericOptions {
  
  var drag: js.UndefOr[DragConfig] = js.undefined
  
  var hover: js.UndefOr[enabledbooleanundefinedHo] = js.undefined
  
  var move: js.UndefOr[MoveConfig] = js.undefined
  
  var pinch: js.UndefOr[PinchConfig] = js.undefined
  
  var scroll: js.UndefOr[CoordinatesConfig[typings.useGestureCore.useGestureCoreStrings.scroll]] = js.undefined
  
  var wheel: js.UndefOr[CoordinatesConfig[typings.useGestureCore.useGestureCoreStrings.wheel]] = js.undefined
}
object UserGestureConfig {
  
  inline def apply(): UserGestureConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGestureConfig]
  }
  
  extension [Self <: UserGestureConfig](x: Self) {
    
    inline def setDrag(value: DragConfig): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setHover(value: enabledbooleanundefinedHo): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setMove(value: MoveConfig): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setPinch(value: PinchConfig): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    inline def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
    
    inline def setScroll(value: CoordinatesConfig[scroll]): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setWheel(value: CoordinatesConfig[wheel]): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    
    inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
  }
}
