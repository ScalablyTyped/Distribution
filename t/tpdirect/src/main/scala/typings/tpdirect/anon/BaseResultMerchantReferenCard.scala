package typings.tpdirect.anon

import typings.tpdirect.Card
import typings.tpdirect.CardInfoV1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tpdirect.BaseResult & tpdirect.MerchantReferenceInfo & {  card_info :tpdirect.CardInfoV1,   card :tpdirect.Card,   total_amount :string} */
trait BaseResultMerchantReferenCard extends StObject {
  
  var card: Card
  
  var card_info: CardInfoV1
  
  var client_ip: String
  
  /**
    * ```markdown
    * If the merchant uses the co-branded card management in the TapPay portal,
    * and the transaction card number meets the setting.
    * ```
    */
  var merchant_reference_info: Affiliatecodes
  
  var msg: String
  
  var prime: String
  
  /**
    * 0 is successful.
    */
  var status: Double
  
  var total_amount: String
}
object BaseResultMerchantReferenCard {
  
  inline def apply(
    card: Card,
    card_info: CardInfoV1,
    client_ip: String,
    merchant_reference_info: Affiliatecodes,
    msg: String,
    prime: String,
    status: Double,
    total_amount: String
  ): BaseResultMerchantReferenCard = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], card_info = card_info.asInstanceOf[js.Any], client_ip = client_ip.asInstanceOf[js.Any], merchant_reference_info = merchant_reference_info.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResultMerchantReferenCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseResultMerchantReferenCard] (val x: Self) extends AnyVal {
    
    inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCard_info(value: CardInfoV1): Self = StObject.set(x, "card_info", value.asInstanceOf[js.Any])
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setMerchant_reference_info(value: Affiliatecodes): Self = StObject.set(x, "merchant_reference_info", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setPrime(value: String): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTotal_amount(value: String): Self = StObject.set(x, "total_amount", value.asInstanceOf[js.Any])
  }
}
