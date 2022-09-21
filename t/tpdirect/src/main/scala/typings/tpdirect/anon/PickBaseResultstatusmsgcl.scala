package typings.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tpdirect.BaseResult, 'status' | 'msg'> & {  clientip :std.Pick<tpdirect.BaseResult, 'client_ip'>,   card_identifier :string,   card :tpdirect.CardInfoV1 & std.Pick<tpdirect.BaseResult, 'prime'>} & tpdirect.MerchantReferenceInfo */
trait PickBaseResultstatusmsgcl extends StObject {
  
  var card: CardInfoV1PickBaseResultp
  
  var card_identifier: String
  
  var clientip: PickBaseResultclientip
  
  /**
    * ```markdown
    * If the merchant uses the co-branded card management in the TapPay portal,
    * and the transaction card number meets the setting.
    * ```
    */
  var merchant_reference_info: Affiliatecodes
  
  var msg: String
  
  var status: Double
}
object PickBaseResultstatusmsgcl {
  
  inline def apply(
    card: CardInfoV1PickBaseResultp,
    card_identifier: String,
    clientip: PickBaseResultclientip,
    merchant_reference_info: Affiliatecodes,
    msg: String,
    status: Double
  ): PickBaseResultstatusmsgcl = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], card_identifier = card_identifier.asInstanceOf[js.Any], clientip = clientip.asInstanceOf[js.Any], merchant_reference_info = merchant_reference_info.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseResultstatusmsgcl]
  }
  
  extension [Self <: PickBaseResultstatusmsgcl](x: Self) {
    
    inline def setCard(value: CardInfoV1PickBaseResultp): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCard_identifier(value: String): Self = StObject.set(x, "card_identifier", value.asInstanceOf[js.Any])
    
    inline def setClientip(value: PickBaseResultclientip): Self = StObject.set(x, "clientip", value.asInstanceOf[js.Any])
    
    inline def setMerchant_reference_info(value: Affiliatecodes): Self = StObject.set(x, "merchant_reference_info", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
