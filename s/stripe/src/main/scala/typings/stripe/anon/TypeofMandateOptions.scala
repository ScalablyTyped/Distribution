package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMandateOptions extends StObject {
  
  val OffSession: Any
}
object TypeofMandateOptions {
  
  inline def apply(OffSession: Any): TypeofMandateOptions = {
    val __obj = js.Dynamic.literal(OffSession = OffSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMandateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMandateOptions] (val x: Self) extends AnyVal {
    
    inline def setOffSession(value: Any): Self = StObject.set(x, "OffSession", value.asInstanceOf[js.Any])
  }
}
