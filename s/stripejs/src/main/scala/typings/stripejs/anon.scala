package typings.stripejs

import typings.stripejs.elementMod.PaymentRequestButtonStyle
import typings.stripejs.elementMod.StyleAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Base extends StObject {
    
    var base: js.UndefOr[String] = js.native
    
    /** @default StripeElement */
    var complete: js.UndefOr[String] = js.native
    
    /** @default StripeElement--complete */
    var focus: String = js.native
    
    /** @default StripeElement--focus */
    var invalid: String = js.native
  }
  object Base {
    
    @scala.inline
    def apply(focus: String, invalid: String): Base = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Clientsecret extends StObject {
    
    var client_secret: String = js.native
    
    var id: String = js.native
  }
  object Clientsecret {
    
    @scala.inline
    def apply(client_secret: String, id: String): Clientsecret = {
      val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clientsecret]
    }
    
    @scala.inline
    implicit class ClientsecretMutableBuilder[Self <: Clientsecret] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Complete extends StObject {
    
    var base: js.UndefOr[PaymentRequestButtonStyle] = js.native
    
    var complete: js.UndefOr[PaymentRequestButtonStyle] = js.native
    
    var empty: js.UndefOr[PaymentRequestButtonStyle] = js.native
    
    var invalid: js.UndefOr[PaymentRequestButtonStyle] = js.native
    
    var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyle] = js.native
  }
  object Complete {
    
    @scala.inline
    def apply(): Complete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Complete]
    }
    
    @scala.inline
    implicit class CompleteMutableBuilder[Self <: Complete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: PaymentRequestButtonStyle): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setComplete(value: PaymentRequestButtonStyle): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setEmpty(value: PaymentRequestButtonStyle): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setInvalid(value: PaymentRequestButtonStyle): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setPaymentRequestButton(value: PaymentRequestButtonStyle): Self = StObject.set(x, "paymentRequestButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentRequestButtonUndefined: Self = StObject.set(x, "paymentRequestButton", js.undefined)
    }
  }
  
  @js.native
  trait Empty extends StObject {
    
    var base: js.UndefOr[String] = js.native
    
    /** @default StripeElement */
    var complete: js.UndefOr[String] = js.native
    
    /** @default StripeElement--complete */
    var empty: js.UndefOr[String] = js.native
    
    /** @default StripeElement--empty */
    var focus: js.UndefOr[String] = js.native
    
    /** @default StripeElement--focus */
    var invalid: js.UndefOr[String] = js.native
    
    /** @default StripeElement--invalid */
    var webkitAutofill: js.UndefOr[String] = js.native
  }
  object Empty {
    
    @scala.inline
    def apply(): Empty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Empty]
    }
    
    @scala.inline
    implicit class EmptyMutableBuilder[Self <: Empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setWebkitAutofill(value: String): Self = StObject.set(x, "webkitAutofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAutofillUndefined: Self = StObject.set(x, "webkitAutofill", js.undefined)
    }
  }
  
  @js.native
  trait Invalid extends StObject {
    
    var base: js.UndefOr[StyleAttributes] = js.native
    
    var complete: js.UndefOr[StyleAttributes] = js.native
    
    var empty: js.UndefOr[StyleAttributes] = js.native
    
    var invalid: js.UndefOr[StyleAttributes] = js.native
  }
  object Invalid {
    
    @scala.inline
    def apply(): Invalid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Invalid]
    }
    
    @scala.inline
    implicit class InvalidMutableBuilder[Self <: Invalid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: StyleAttributes): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setComplete(value: StyleAttributes): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setEmpty(value: StyleAttributes): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setInvalid(value: StyleAttributes): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    }
  }
  
  @js.native
  trait PreventDefault extends StObject {
    
    def preventDefault(): Unit = js.native
  }
  object PreventDefault {
    
    @scala.inline
    def apply(preventDefault: () => Unit): PreventDefault = {
      val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[PreventDefault]
    }
    
    @scala.inline
    implicit class PreventDefaultMutableBuilder[Self <: PreventDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
}
