package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromotionalCodeDetail extends StObject {
  
  var AppliedCouponCount: String
  
  var AppliedCouponList: String
  
  var RegistedBenefitCount: String
  
  var RegistedBenefitList: String
}
object PromotionalCodeDetail {
  
  inline def apply(
    AppliedCouponCount: String,
    AppliedCouponList: String,
    RegistedBenefitCount: String,
    RegistedBenefitList: String
  ): PromotionalCodeDetail = {
    val __obj = js.Dynamic.literal(AppliedCouponCount = AppliedCouponCount.asInstanceOf[js.Any], AppliedCouponList = AppliedCouponList.asInstanceOf[js.Any], RegistedBenefitCount = RegistedBenefitCount.asInstanceOf[js.Any], RegistedBenefitList = RegistedBenefitList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromotionalCodeDetail]
  }
  
  extension [Self <: PromotionalCodeDetail](x: Self) {
    
    inline def setAppliedCouponCount(value: String): Self = StObject.set(x, "AppliedCouponCount", value.asInstanceOf[js.Any])
    
    inline def setAppliedCouponList(value: String): Self = StObject.set(x, "AppliedCouponList", value.asInstanceOf[js.Any])
    
    inline def setRegistedBenefitCount(value: String): Self = StObject.set(x, "RegistedBenefitCount", value.asInstanceOf[js.Any])
    
    inline def setRegistedBenefitList(value: String): Self = StObject.set(x, "RegistedBenefitList", value.asInstanceOf[js.Any])
  }
}
