package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBlikMandateOptions extends StObject {
  
  val MandateOptions: TypeofMandateOptions
}
object TypeofBlikMandateOptions {
  
  inline def apply(MandateOptions: TypeofMandateOptions): TypeofBlikMandateOptions = {
    val __obj = js.Dynamic.literal(MandateOptions = MandateOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBlikMandateOptions]
  }
  
  extension [Self <: TypeofBlikMandateOptions](x: Self) {
    
    inline def setMandateOptions(value: TypeofMandateOptions): Self = StObject.set(x, "MandateOptions", value.asInstanceOf[js.Any])
  }
}
