package typings.tpdirect.anon

import typings.tpdirect.Address
import typings.tpdirect.Card
import typings.tpdirect.CardInfoV1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tpdirect.BaseResult & tpdirect.MerchantReferenceInfo & {  prime_expiry_millis :number,   total_amount :string,   payer :{  name :string,   email :string,   phone :string},   billingAddress :tpdirect.Address,   shippingAddress :tpdirect.Address,   shippingOption :string,   methodName :string,   requestId :string,   card_info :tpdirect.CardInfoV1,   card :tpdirect.Card} */
trait BaseResultMerchantReferen extends StObject {
  
  var billingAddress: Address
  
  /**
    * Real Card Info
    */
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
  
  var methodName: String
  
  var msg: String
  
  var payer: Email
  
  var prime: String
  
  var prime_expiry_millis: Double
  
  var requestId: String
  
  var shippingAddress: Address
  
  var shippingOption: String
  
  /**
    * 0 is successful.
    */
  var status: Double
  
  var total_amount: String
}
object BaseResultMerchantReferen {
  
  inline def apply(
    billingAddress: Address,
    card: Card,
    card_info: CardInfoV1,
    client_ip: String,
    merchant_reference_info: Affiliatecodes,
    methodName: String,
    msg: String,
    payer: Email,
    prime: String,
    prime_expiry_millis: Double,
    requestId: String,
    shippingAddress: Address,
    shippingOption: String,
    status: Double,
    total_amount: String
  ): BaseResultMerchantReferen = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], card_info = card_info.asInstanceOf[js.Any], client_ip = client_ip.asInstanceOf[js.Any], merchant_reference_info = merchant_reference_info.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any], prime_expiry_millis = prime_expiry_millis.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any], shippingOption = shippingOption.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResultMerchantReferen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseResultMerchantReferen] (val x: Self) extends AnyVal {
    
    inline def setBillingAddress(value: Address): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCard_info(value: CardInfoV1): Self = StObject.set(x, "card_info", value.asInstanceOf[js.Any])
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setMerchant_reference_info(value: Affiliatecodes): Self = StObject.set(x, "merchant_reference_info", value.asInstanceOf[js.Any])
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setPayer(value: Email): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setPrime(value: String): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
    
    inline def setPrime_expiry_millis(value: Double): Self = StObject.set(x, "prime_expiry_millis", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingOption(value: String): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTotal_amount(value: String): Self = StObject.set(x, "total_amount", value.asInstanceOf[js.Any])
  }
}
