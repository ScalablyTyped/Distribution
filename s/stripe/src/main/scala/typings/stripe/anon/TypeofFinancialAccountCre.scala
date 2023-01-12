package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFinancialAccountCre extends StObject {
  
  val Features: TypeofFeaturesFinancialAddresses
  
  val PlatformRestrictions: Any
}
object TypeofFinancialAccountCre {
  
  inline def apply(Features: TypeofFeaturesFinancialAddresses, PlatformRestrictions: Any): TypeofFinancialAccountCre = {
    val __obj = js.Dynamic.literal(Features = Features.asInstanceOf[js.Any], PlatformRestrictions = PlatformRestrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFinancialAccountCre]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFinancialAccountCre] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: TypeofFeaturesFinancialAddresses): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
    
    inline def setPlatformRestrictions(value: Any): Self = StObject.set(x, "PlatformRestrictions", value.asInstanceOf[js.Any])
  }
}
