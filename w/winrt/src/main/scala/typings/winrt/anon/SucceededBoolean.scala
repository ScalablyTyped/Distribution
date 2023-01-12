package typings.winrt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SucceededBoolean extends StObject {
  
  var succeeded: Boolean
  
  var value: Boolean
}
object SucceededBoolean {
  
  inline def apply(succeeded: Boolean, value: Boolean): SucceededBoolean = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SucceededBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SucceededBoolean] (val x: Self) extends AnyVal {
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
