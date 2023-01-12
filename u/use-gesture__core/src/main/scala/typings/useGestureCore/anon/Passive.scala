package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Passive extends StObject {
  
  var capture: js.UndefOr[Boolean] = js.undefined
  
  var passive: js.UndefOr[Boolean] = js.undefined
}
object Passive {
  
  inline def apply(): Passive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Passive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Passive] (val x: Self) extends AnyVal {
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
  }
}
