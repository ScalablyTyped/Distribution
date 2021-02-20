package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Capture.PowerlineFrequency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValueBoolean extends StObject {
  
  /** Returns true if the method succeeded, or false otherwise. */ var returnValue: Boolean = js.native
  
  /** The power line frequency. */ var value: PowerlineFrequency = js.native
}
object ReturnValueBoolean {
  
  @scala.inline
  def apply(returnValue: Boolean, value: PowerlineFrequency): ReturnValueBoolean = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValueBoolean]
  }
  
  @scala.inline
  implicit class ReturnValueBooleanMutableBuilder[Self <: ReturnValueBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: PowerlineFrequency): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
