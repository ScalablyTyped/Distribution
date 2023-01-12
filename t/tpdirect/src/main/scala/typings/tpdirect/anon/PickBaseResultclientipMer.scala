package typings.tpdirect.anon

import typings.tpdirect.CardInfoV1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tpdirect.BaseResult, 'client_ip'> & tpdirect.MerchantReferenceInfo & {  card_info :tpdirect.CardInfoV1} */
trait PickBaseResultclientipMer extends StObject {
  
  var card_info: CardInfoV1
  
  var client_ip: String
  
  /**
    * ```markdown
    * If the merchant uses the co-branded card management in the TapPay portal,
    * and the transaction card number meets the setting.
    * ```
    */
  var merchant_reference_info: Affiliatecodes
}
object PickBaseResultclientipMer {
  
  inline def apply(card_info: CardInfoV1, client_ip: String, merchant_reference_info: Affiliatecodes): PickBaseResultclientipMer = {
    val __obj = js.Dynamic.literal(card_info = card_info.asInstanceOf[js.Any], client_ip = client_ip.asInstanceOf[js.Any], merchant_reference_info = merchant_reference_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseResultclientipMer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickBaseResultclientipMer] (val x: Self) extends AnyVal {
    
    inline def setCard_info(value: CardInfoV1): Self = StObject.set(x, "card_info", value.asInstanceOf[js.Any])
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setMerchant_reference_info(value: Affiliatecodes): Self = StObject.set(x, "merchant_reference_info", value.asInstanceOf[js.Any])
  }
}
