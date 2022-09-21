package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofConfiguration extends StObject {
  
  val Features: TypeofFeatures
}
object TypeofConfiguration {
  
  inline def apply(Features: TypeofFeatures): TypeofConfiguration = {
    val __obj = js.Dynamic.literal(Features = Features.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofConfiguration]
  }
  
  extension [Self <: TypeofConfiguration](x: Self) {
    
    inline def setFeatures(value: TypeofFeatures): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
  }
}
