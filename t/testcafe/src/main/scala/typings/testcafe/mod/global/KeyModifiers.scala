package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyModifiers extends StObject {
  
  var alt: js.UndefOr[Boolean] = js.undefined
  
  var ctrl: js.UndefOr[Boolean] = js.undefined
  
  var meta: js.UndefOr[Boolean] = js.undefined
  
  var shift: js.UndefOr[Boolean] = js.undefined
}
object KeyModifiers {
  
  inline def apply(): KeyModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyModifiers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyModifiers] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
    
    inline def setCtrlUndefined: Self = StObject.set(x, "ctrl", js.undefined)
    
    inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
  }
}
