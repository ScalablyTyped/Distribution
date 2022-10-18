package typings.stripejs

import typings.stripejs.elementMod.PaymentRequestButtonStyle
import typings.stripejs.elementMod.StyleAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    /** @default StripeElement */
    var complete: js.UndefOr[String] = js.undefined
    
    /** @default StripeElement--complete */
    var empty: js.UndefOr[String] = js.undefined
    
    /** @default StripeElement--empty */
    var focus: js.UndefOr[String] = js.undefined
    
    /** @default StripeElement--focus */
    var invalid: js.UndefOr[String] = js.undefined
    
    /** @default StripeElement--invalid */
    var webkitAutofill: js.UndefOr[String] = js.undefined
  }
  object Base {
    
    inline def apply(): Base = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setWebkitAutofill(value: String): Self = StObject.set(x, "webkitAutofill", value.asInstanceOf[js.Any])
      
      inline def setWebkitAutofillUndefined: Self = StObject.set(x, "webkitAutofill", js.undefined)
    }
  }
  
  trait Clientsecret extends StObject {
    
    var client_secret: String
    
    var id: String
  }
  object Clientsecret {
    
    inline def apply(client_secret: String, id: String): Clientsecret = {
      val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clientsecret]
    }
    
    extension [Self <: Clientsecret](x: Self) {
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Complete extends StObject {
    
    var base: js.UndefOr[StyleAttributes] = js.undefined
    
    var complete: js.UndefOr[StyleAttributes] = js.undefined
    
    var empty: js.UndefOr[StyleAttributes] = js.undefined
    
    var invalid: js.UndefOr[StyleAttributes] = js.undefined
  }
  object Complete {
    
    inline def apply(): Complete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Complete]
    }
    
    extension [Self <: Complete](x: Self) {
      
      inline def setBase(value: StyleAttributes): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setComplete(value: StyleAttributes): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setEmpty(value: StyleAttributes): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setInvalid(value: StyleAttributes): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    }
  }
  
  trait Empty extends StObject {
    
    var base: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
    
    var complete: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
    
    var empty: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
    
    var invalid: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
    
    var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
  }
  object Empty {
    
    inline def apply(): Empty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Empty]
    }
    
    extension [Self <: Empty](x: Self) {
      
      inline def setBase(value: PaymentRequestButtonStyle): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setComplete(value: PaymentRequestButtonStyle): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setEmpty(value: PaymentRequestButtonStyle): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setInvalid(value: PaymentRequestButtonStyle): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setPaymentRequestButton(value: PaymentRequestButtonStyle): Self = StObject.set(x, "paymentRequestButton", value.asInstanceOf[js.Any])
      
      inline def setPaymentRequestButtonUndefined: Self = StObject.set(x, "paymentRequestButton", js.undefined)
    }
  }
  
  trait Focus extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    /** @default StripeElement */
    var complete: js.UndefOr[String] = js.undefined
    
    /** @default StripeElement--complete */
    var focus: String
    
    /** @default StripeElement--focus */
    var invalid: String
  }
  object Focus {
    
    inline def apply(focus: String, invalid: String): Focus = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focus]
    }
    
    extension [Self <: Focus](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreventDefault extends StObject {
    
    def preventDefault(): Unit
  }
  object PreventDefault {
    
    inline def apply(preventDefault: () => Unit): PreventDefault = {
      val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[PreventDefault]
    }
    
    extension [Self <: PreventDefault](x: Self) {
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
}
