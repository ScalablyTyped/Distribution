package typings.swellJs

import typings.swellJs.typesPaymentCamelMod.PaymentCamel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPaymentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesPaymentCamelMod.InputPaymentElementAppleCamel because var conflicts: classes, element_id, on_blur, on_change, on_click, on_error, on_escape, on_focus, on_ready, on_success, require, style. Inlined  */ trait InputPaymentElementApple
    extends StObject
       with InputPaymentElementAppleSnake
  object InputPaymentElementApple {
    
    inline def apply(): InputPaymentElementApple = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementApple]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesPaymentCamelMod.InputPaymentElementBaseCamel because var conflicts: element_id, on_blur, on_change, on_click, on_error, on_escape, on_focus, on_ready, on_success. Inlined  */ trait InputPaymentElementBase
    extends StObject
       with InputPaymentElementBaseSnake
  object InputPaymentElementBase {
    
    inline def apply(): InputPaymentElementBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementBase]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesPaymentCamelMod.InputPaymentElementCardCamel because var conflicts: card_cvc, card_expiry, card_number, element_id, on_blur, on_change, on_click, on_error, on_escape, on_focus, on_ready, on_success, options, seperate_elements. Inlined  */ trait InputPaymentElementCard
    extends StObject
       with InputPaymentElementCardSnake
  object InputPaymentElementCard {
    
    inline def apply(): InputPaymentElementCard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementCard]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesPaymentCamelMod.InputPaymentElementGoogleCamel because var conflicts: classes, element_id, locale, on_blur, on_change, on_click, on_error, on_escape, on_focus, on_ready, on_success, require, style. Inlined  */ trait InputPaymentElementGoogle
    extends StObject
       with InputPaymentElementGoogleSnake
  object InputPaymentElementGoogle {
    
    inline def apply(): InputPaymentElementGoogle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementGoogle]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesPaymentCamelMod.InputPaymentElementIdealCamel because var conflicts: element_id, on_blur, on_change, on_click, on_error, on_escape, on_focus, on_ready, on_success, options. Inlined  */ trait InputPaymentElementIdeal
    extends StObject
       with InputPaymentElementIdealSnake
  object InputPaymentElementIdeal {
    
    inline def apply(): InputPaymentElementIdeal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementIdeal]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesPaymentCamelMod.InputPaymentElementPaypalCamel because var conflicts: element_id, on_blur, on_change, on_click, on_error, on_escape, on_focus, on_ready, on_success, style. Inlined  */ trait InputPaymentElementPaypal
    extends StObject
       with InputPaymentElementPaypalSnake
  object InputPaymentElementPaypal {
    
    inline def apply(): InputPaymentElementPaypal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementPaypal]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesPaymentCamelMod.InputPaymentRedirectCamel because var conflicts: on_error, on_success. Inlined  */ trait InputPaymentRedirect
    extends StObject
       with InputPaymentRedirectSnake
  object InputPaymentRedirect {
    
    inline def apply(): InputPaymentRedirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentRedirect]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.mod.BaseModel because var conflicts: date_created, date_updated, id. Inlined 
  - typings.swellJs.PaymentSnake because var conflicts: account, account_card, account_card_id, account_id, amazon, amount, amount_refundable, amount_refunded, async, authorized, captured, card, currency, currency_rate, date_async_update, date_created, date_updated, error, gateway, giftcard, giftcard_id, id, intent, invoice, invoice_id, method, number, order, order_id, paypal, refunds, status, subscription, subscription_id, success, test, transaction_id. Inlined  */ trait Payment
    extends StObject
       with PaymentCamel
  object Payment {
    
    inline def apply(amount: Double, method: String): Payment = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payment]
    }
  }
}
