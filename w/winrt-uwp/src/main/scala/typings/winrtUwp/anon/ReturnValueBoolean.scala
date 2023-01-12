package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Capture.PowerlineFrequency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnValueBoolean extends StObject {
  
  /** Returns true if the method succeeded, or false otherwise. */ var returnValue: Boolean
  
  /** The power line frequency. */ var value: PowerlineFrequency
}
object ReturnValueBoolean {
  
  inline def apply(returnValue: Boolean, value: PowerlineFrequency): ReturnValueBoolean = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValueBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnValueBoolean] (val x: Self) extends AnyVal {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PowerlineFrequency): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
