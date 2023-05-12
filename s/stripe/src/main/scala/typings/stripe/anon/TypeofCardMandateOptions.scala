package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardMandateOptions extends StObject {
  
  val MandateOptions: Any
}
object TypeofCardMandateOptions {
  
  inline def apply(MandateOptions: Any): TypeofCardMandateOptions = {
    val __obj = js.Dynamic.literal(MandateOptions = MandateOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardMandateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCardMandateOptions] (val x: Self) extends AnyVal {
    
    inline def setMandateOptions(value: Any): Self = StObject.set(x, "MandateOptions", value.asInstanceOf[js.Any])
  }
}
