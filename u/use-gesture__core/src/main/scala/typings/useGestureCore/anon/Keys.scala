package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keys extends StObject {
  
  /**
    * The buttons combination that would trigger the drag. Use `-1` to allow
    * for any button combination to start the drag.
    */
  var buttons: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * Doesn't use setPointerCapture when false and delegate drag handling to
    * window
    */
  var capture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false, will disable KeyboardEvents that would otherwise trigger the
    * drag gesture when the element is focused. Defaults to true.
    */
  var keys: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will perform a pointer lock when drag starts, and exit pointer lock when
    * drag ends,
    */
  var lock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, drag will use touch events on touch-enabled devices, and use
    * mouse events on non touch devices.
    */
  var mouse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, drag will use touch events on touch-enabled devices.
    */
  var touch: js.UndefOr[Boolean] = js.undefined
}
object Keys {
  
  inline def apply(): Keys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Keys]
  }
  
  extension [Self <: Keys](x: Self) {
    
    inline def setButtons(value: Double | js.Array[Double]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: Double*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
    
    inline def setMouse(value: Boolean): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
  }
}
