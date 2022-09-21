package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripeV3Strings.ach_credit_transfer
import typings.stripeV3.stripeV3Strings.ach_debit
import typings.stripeV3.stripeV3Strings.alipay
import typings.stripeV3.stripeV3Strings.bancontact
import typings.stripeV3.stripeV3Strings.card
import typings.stripeV3.stripeV3Strings.eps
import typings.stripeV3.stripeV3Strings.giropay
import typings.stripeV3.stripeV3Strings.ideal
import typings.stripeV3.stripeV3Strings.multibanco
import typings.stripeV3.stripeV3Strings.p24
import typings.stripeV3.stripeV3Strings.sepa_debit
import typings.stripeV3.stripeV3Strings.sofort
import typings.stripeV3.stripeV3Strings.stripe_account
import typings.stripeV3.stripeV3Strings.wechat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the payment method at the time of the transaction.
  */
trait PaymentMethodDetails extends StObject {
  
  var ach_credit_transfer: js.UndefOr[AchCreditTransferDetails | Null] = js.undefined
  
  var ach_debit: js.UndefOr[AchDebitDetails | Null] = js.undefined
  
  var alipay: js.UndefOr[Any | Null] = js.undefined
  
  var bancontact: js.UndefOr[BanContactDetails | Null] = js.undefined
  
  var card: js.UndefOr[PaymentMethodCard | Null] = js.undefined
  
  var eps: js.UndefOr[EpsDetails | Null] = js.undefined
  
  var giropay: js.UndefOr[GiropayDetails | Null] = js.undefined
  
  var ideal: js.UndefOr[IdealDetails | Null] = js.undefined
  
  var multibanco: js.UndefOr[MultibancoDetails | Null] = js.undefined
  
  var p24: js.UndefOr[P24Details | Null] = js.undefined
  
  var sepa_debit: js.UndefOr[SepaDebitDetails | Null] = js.undefined
  
  var sofort: js.UndefOr[SofortDetails | Null] = js.undefined
  
  var stripe_account: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * The type of transaction-specific details of the payment method used in the payment
    */
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
  
  var wechat: js.UndefOr[Any | Null] = js.undefined
}
object PaymentMethodDetails {
  
  inline def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
  ): PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodDetails]
  }
  
  extension [Self <: PaymentMethodDetails](x: Self) {
    
    inline def setAch_credit_transfer(value: AchCreditTransferDetails): Self = StObject.set(x, "ach_credit_transfer", value.asInstanceOf[js.Any])
    
    inline def setAch_credit_transferNull: Self = StObject.set(x, "ach_credit_transfer", null)
    
    inline def setAch_credit_transferUndefined: Self = StObject.set(x, "ach_credit_transfer", js.undefined)
    
    inline def setAch_debit(value: AchDebitDetails): Self = StObject.set(x, "ach_debit", value.asInstanceOf[js.Any])
    
    inline def setAch_debitNull: Self = StObject.set(x, "ach_debit", null)
    
    inline def setAch_debitUndefined: Self = StObject.set(x, "ach_debit", js.undefined)
    
    inline def setAlipay(value: Any): Self = StObject.set(x, "alipay", value.asInstanceOf[js.Any])
    
    inline def setAlipayNull: Self = StObject.set(x, "alipay", null)
    
    inline def setAlipayUndefined: Self = StObject.set(x, "alipay", js.undefined)
    
    inline def setBancontact(value: BanContactDetails): Self = StObject.set(x, "bancontact", value.asInstanceOf[js.Any])
    
    inline def setBancontactNull: Self = StObject.set(x, "bancontact", null)
    
    inline def setBancontactUndefined: Self = StObject.set(x, "bancontact", js.undefined)
    
    inline def setCard(value: PaymentMethodCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardNull: Self = StObject.set(x, "card", null)
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setEps(value: EpsDetails): Self = StObject.set(x, "eps", value.asInstanceOf[js.Any])
    
    inline def setEpsNull: Self = StObject.set(x, "eps", null)
    
    inline def setEpsUndefined: Self = StObject.set(x, "eps", js.undefined)
    
    inline def setGiropay(value: GiropayDetails): Self = StObject.set(x, "giropay", value.asInstanceOf[js.Any])
    
    inline def setGiropayNull: Self = StObject.set(x, "giropay", null)
    
    inline def setGiropayUndefined: Self = StObject.set(x, "giropay", js.undefined)
    
    inline def setIdeal(value: IdealDetails): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealNull: Self = StObject.set(x, "ideal", null)
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    inline def setMultibanco(value: MultibancoDetails): Self = StObject.set(x, "multibanco", value.asInstanceOf[js.Any])
    
    inline def setMultibancoNull: Self = StObject.set(x, "multibanco", null)
    
    inline def setMultibancoUndefined: Self = StObject.set(x, "multibanco", js.undefined)
    
    inline def setP24(value: P24Details): Self = StObject.set(x, "p24", value.asInstanceOf[js.Any])
    
    inline def setP24Null: Self = StObject.set(x, "p24", null)
    
    inline def setP24Undefined: Self = StObject.set(x, "p24", js.undefined)
    
    inline def setSepa_debit(value: SepaDebitDetails): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
    
    inline def setSepa_debitNull: Self = StObject.set(x, "sepa_debit", null)
    
    inline def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
    
    inline def setSofort(value: SofortDetails): Self = StObject.set(x, "sofort", value.asInstanceOf[js.Any])
    
    inline def setSofortNull: Self = StObject.set(x, "sofort", null)
    
    inline def setSofortUndefined: Self = StObject.set(x, "sofort", js.undefined)
    
    inline def setStripe_account(value: Any): Self = StObject.set(x, "stripe_account", value.asInstanceOf[js.Any])
    
    inline def setStripe_accountNull: Self = StObject.set(x, "stripe_account", null)
    
    inline def setStripe_accountUndefined: Self = StObject.set(x, "stripe_account", js.undefined)
    
    inline def setType(
      value: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWechat(value: Any): Self = StObject.set(x, "wechat", value.asInstanceOf[js.Any])
    
    inline def setWechatNull: Self = StObject.set(x, "wechat", null)
    
    inline def setWechatUndefined: Self = StObject.set(x, "wechat", js.undefined)
  }
}
