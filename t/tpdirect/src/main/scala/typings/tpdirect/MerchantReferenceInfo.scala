package typings.tpdirect

import typings.tpdirect.anon.Affiliatecodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantReferenceInfo extends StObject {
  
  /**
    * ```markdown
    * If the merchant uses the co-branded card management in the TapPay portal,
    * and the transaction card number meets the setting.
    * ```
    */
  var merchant_reference_info: Affiliatecodes
}
object MerchantReferenceInfo {
  
  inline def apply(merchant_reference_info: Affiliatecodes): MerchantReferenceInfo = {
    val __obj = js.Dynamic.literal(merchant_reference_info = merchant_reference_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantReferenceInfo]
  }
  
  extension [Self <: MerchantReferenceInfo](x: Self) {
    
    inline def setMerchant_reference_info(value: Affiliatecodes): Self = StObject.set(x, "merchant_reference_info", value.asInstanceOf[js.Any])
  }
}
