package typings.winrt.anon

import typings.winrt.Windows.Media.Capture.PowerlineFrequency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var succeeded: Boolean
  
  var value: PowerlineFrequency
}
object Value {
  
  inline def apply(succeeded: Boolean, value: PowerlineFrequency): Value = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PowerlineFrequency): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
