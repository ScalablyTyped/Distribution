package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touch extends StObject {
  
  /**
    * If true, pinch will use touch events on touch-enabled devices.
    */
  var touch: js.UndefOr[Boolean] = js.undefined
}
object Touch {
  
  inline def apply(): Touch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Touch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Touch] (val x: Self) extends AnyVal {
    
    inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
  }
}
