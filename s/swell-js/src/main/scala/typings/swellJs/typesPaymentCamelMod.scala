package typings.swellJs

import typings.swellJs.anon.Base
import typings.swellJs.anon.ElementId
import typings.swellJs.anon.Email
import typings.swellJs.anon.Phone
import typings.swellJs.anon.Style
import typings.swellJs.anon.`0`
import typings.swellJs.anon.`1`
import typings.swellJs.swellJsStrings.authorized
import typings.swellJs.swellJsStrings.error
import typings.swellJs.swellJsStrings.pending
import typings.swellJs.swellJsStrings.success
import typings.swellJs.typesInvoiceMod.Invoice
import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesRefundMod.Refund
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPaymentCamelMod {
  
  /* Inlined {[ K in keyof swell-js.InputPaymentElementAppleSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.InputPaymentElementAppleSnake[K]} */
  trait InputPaymentElementAppleCamel extends StObject {
    
    var classes: js.UndefOr[Base] = js.undefined
    
    var element_id: js.UndefOr[String] = js.undefined
    
    var on_blur: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_change: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_click: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_error: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_escape: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_focus: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_ready: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_success: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var require: js.UndefOr[Email] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object InputPaymentElementAppleCamel {
    
    inline def apply(): InputPaymentElementAppleCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementAppleCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputPaymentElementAppleCamel] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: Base): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setElement_id(value: String): Self = StObject.set(x, "element_id", value.asInstanceOf[js.Any])
      
      inline def setElement_idUndefined: Self = StObject.set(x, "element_id", js.undefined)
      
      inline def setOn_blur(value: /* event */ Any => Unit): Self = StObject.set(x, "on_blur", js.Any.fromFunction1(value))
      
      inline def setOn_blurUndefined: Self = StObject.set(x, "on_blur", js.undefined)
      
      inline def setOn_change(value: /* event */ Any => Unit): Self = StObject.set(x, "on_change", js.Any.fromFunction1(value))
      
      inline def setOn_changeUndefined: Self = StObject.set(x, "on_change", js.undefined)
      
      inline def setOn_click(value: /* event */ Any => Unit): Self = StObject.set(x, "on_click", js.Any.fromFunction1(value))
      
      inline def setOn_clickUndefined: Self = StObject.set(x, "on_click", js.undefined)
      
      inline def setOn_error(value: /* event */ Any => Unit): Self = StObject.set(x, "on_error", js.Any.fromFunction1(value))
      
      inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
      
      inline def setOn_escape(value: /* event */ Any => Unit): Self = StObject.set(x, "on_escape", js.Any.fromFunction1(value))
      
      inline def setOn_escapeUndefined: Self = StObject.set(x, "on_escape", js.undefined)
      
      inline def setOn_focus(value: /* event */ Any => Unit): Self = StObject.set(x, "on_focus", js.Any.fromFunction1(value))
      
      inline def setOn_focusUndefined: Self = StObject.set(x, "on_focus", js.undefined)
      
      inline def setOn_ready(value: /* event */ Any => Unit): Self = StObject.set(x, "on_ready", js.Any.fromFunction1(value))
      
      inline def setOn_readyUndefined: Self = StObject.set(x, "on_ready", js.undefined)
      
      inline def setOn_success(value: /* event */ Any => Unit): Self = StObject.set(x, "on_success", js.Any.fromFunction1(value))
      
      inline def setOn_successUndefined: Self = StObject.set(x, "on_success", js.undefined)
      
      inline def setRequire(value: Email): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.InputPaymentElementBaseSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.InputPaymentElementBaseSnake[K]} */
  trait InputPaymentElementBaseCamel extends StObject {
    
    var element_id: js.UndefOr[String] = js.undefined
    
    var on_blur: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_change: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_click: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_error: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_escape: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_focus: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_ready: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_success: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  }
  object InputPaymentElementBaseCamel {
    
    inline def apply(): InputPaymentElementBaseCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementBaseCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputPaymentElementBaseCamel] (val x: Self) extends AnyVal {
      
      inline def setElement_id(value: String): Self = StObject.set(x, "element_id", value.asInstanceOf[js.Any])
      
      inline def setElement_idUndefined: Self = StObject.set(x, "element_id", js.undefined)
      
      inline def setOn_blur(value: /* event */ Any => Unit): Self = StObject.set(x, "on_blur", js.Any.fromFunction1(value))
      
      inline def setOn_blurUndefined: Self = StObject.set(x, "on_blur", js.undefined)
      
      inline def setOn_change(value: /* event */ Any => Unit): Self = StObject.set(x, "on_change", js.Any.fromFunction1(value))
      
      inline def setOn_changeUndefined: Self = StObject.set(x, "on_change", js.undefined)
      
      inline def setOn_click(value: /* event */ Any => Unit): Self = StObject.set(x, "on_click", js.Any.fromFunction1(value))
      
      inline def setOn_clickUndefined: Self = StObject.set(x, "on_click", js.undefined)
      
      inline def setOn_error(value: /* event */ Any => Unit): Self = StObject.set(x, "on_error", js.Any.fromFunction1(value))
      
      inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
      
      inline def setOn_escape(value: /* event */ Any => Unit): Self = StObject.set(x, "on_escape", js.Any.fromFunction1(value))
      
      inline def setOn_escapeUndefined: Self = StObject.set(x, "on_escape", js.undefined)
      
      inline def setOn_focus(value: /* event */ Any => Unit): Self = StObject.set(x, "on_focus", js.Any.fromFunction1(value))
      
      inline def setOn_focusUndefined: Self = StObject.set(x, "on_focus", js.undefined)
      
      inline def setOn_ready(value: /* event */ Any => Unit): Self = StObject.set(x, "on_ready", js.Any.fromFunction1(value))
      
      inline def setOn_readyUndefined: Self = StObject.set(x, "on_ready", js.undefined)
      
      inline def setOn_success(value: /* event */ Any => Unit): Self = StObject.set(x, "on_success", js.Any.fromFunction1(value))
      
      inline def setOn_successUndefined: Self = StObject.set(x, "on_success", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.InputPaymentElementCardSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.InputPaymentElementCardSnake[K]} */
  trait InputPaymentElementCardCamel extends StObject {
    
    var card_cvc: js.UndefOr[`0`] = js.undefined
    
    var card_expiry: js.UndefOr[`0`] = js.undefined
    
    var card_number: js.UndefOr[ElementId] = js.undefined
    
    var element_id: js.UndefOr[String] = js.undefined
    
    var on_blur: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_change: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_click: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_error: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_escape: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_focus: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_ready: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_success: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var options: js.UndefOr[Any] = js.undefined
    
    var separate_elements: js.UndefOr[Boolean] = js.undefined
  }
  object InputPaymentElementCardCamel {
    
    inline def apply(): InputPaymentElementCardCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementCardCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputPaymentElementCardCamel] (val x: Self) extends AnyVal {
      
      inline def setCard_cvc(value: `0`): Self = StObject.set(x, "card_cvc", value.asInstanceOf[js.Any])
      
      inline def setCard_cvcUndefined: Self = StObject.set(x, "card_cvc", js.undefined)
      
      inline def setCard_expiry(value: `0`): Self = StObject.set(x, "card_expiry", value.asInstanceOf[js.Any])
      
      inline def setCard_expiryUndefined: Self = StObject.set(x, "card_expiry", js.undefined)
      
      inline def setCard_number(value: ElementId): Self = StObject.set(x, "card_number", value.asInstanceOf[js.Any])
      
      inline def setCard_numberUndefined: Self = StObject.set(x, "card_number", js.undefined)
      
      inline def setElement_id(value: String): Self = StObject.set(x, "element_id", value.asInstanceOf[js.Any])
      
      inline def setElement_idUndefined: Self = StObject.set(x, "element_id", js.undefined)
      
      inline def setOn_blur(value: /* event */ Any => Unit): Self = StObject.set(x, "on_blur", js.Any.fromFunction1(value))
      
      inline def setOn_blurUndefined: Self = StObject.set(x, "on_blur", js.undefined)
      
      inline def setOn_change(value: /* event */ Any => Unit): Self = StObject.set(x, "on_change", js.Any.fromFunction1(value))
      
      inline def setOn_changeUndefined: Self = StObject.set(x, "on_change", js.undefined)
      
      inline def setOn_click(value: /* event */ Any => Unit): Self = StObject.set(x, "on_click", js.Any.fromFunction1(value))
      
      inline def setOn_clickUndefined: Self = StObject.set(x, "on_click", js.undefined)
      
      inline def setOn_error(value: /* event */ Any => Unit): Self = StObject.set(x, "on_error", js.Any.fromFunction1(value))
      
      inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
      
      inline def setOn_escape(value: /* event */ Any => Unit): Self = StObject.set(x, "on_escape", js.Any.fromFunction1(value))
      
      inline def setOn_escapeUndefined: Self = StObject.set(x, "on_escape", js.undefined)
      
      inline def setOn_focus(value: /* event */ Any => Unit): Self = StObject.set(x, "on_focus", js.Any.fromFunction1(value))
      
      inline def setOn_focusUndefined: Self = StObject.set(x, "on_focus", js.undefined)
      
      inline def setOn_ready(value: /* event */ Any => Unit): Self = StObject.set(x, "on_ready", js.Any.fromFunction1(value))
      
      inline def setOn_readyUndefined: Self = StObject.set(x, "on_ready", js.undefined)
      
      inline def setOn_success(value: /* event */ Any => Unit): Self = StObject.set(x, "on_success", js.Any.fromFunction1(value))
      
      inline def setOn_successUndefined: Self = StObject.set(x, "on_success", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSeparate_elements(value: Boolean): Self = StObject.set(x, "separate_elements", value.asInstanceOf[js.Any])
      
      inline def setSeparate_elementsUndefined: Self = StObject.set(x, "separate_elements", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.InputPaymentElementGoogleSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.InputPaymentElementGoogleSnake[K]} */
  trait InputPaymentElementGoogleCamel extends StObject {
    
    var classes: js.UndefOr[`1`] = js.undefined
    
    var element_id: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var on_blur: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_change: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_click: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_error: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_escape: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_focus: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_ready: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_success: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var require: js.UndefOr[Phone] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object InputPaymentElementGoogleCamel {
    
    inline def apply(): InputPaymentElementGoogleCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementGoogleCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputPaymentElementGoogleCamel] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: `1`): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setElement_id(value: String): Self = StObject.set(x, "element_id", value.asInstanceOf[js.Any])
      
      inline def setElement_idUndefined: Self = StObject.set(x, "element_id", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOn_blur(value: /* event */ Any => Unit): Self = StObject.set(x, "on_blur", js.Any.fromFunction1(value))
      
      inline def setOn_blurUndefined: Self = StObject.set(x, "on_blur", js.undefined)
      
      inline def setOn_change(value: /* event */ Any => Unit): Self = StObject.set(x, "on_change", js.Any.fromFunction1(value))
      
      inline def setOn_changeUndefined: Self = StObject.set(x, "on_change", js.undefined)
      
      inline def setOn_click(value: /* event */ Any => Unit): Self = StObject.set(x, "on_click", js.Any.fromFunction1(value))
      
      inline def setOn_clickUndefined: Self = StObject.set(x, "on_click", js.undefined)
      
      inline def setOn_error(value: /* event */ Any => Unit): Self = StObject.set(x, "on_error", js.Any.fromFunction1(value))
      
      inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
      
      inline def setOn_escape(value: /* event */ Any => Unit): Self = StObject.set(x, "on_escape", js.Any.fromFunction1(value))
      
      inline def setOn_escapeUndefined: Self = StObject.set(x, "on_escape", js.undefined)
      
      inline def setOn_focus(value: /* event */ Any => Unit): Self = StObject.set(x, "on_focus", js.Any.fromFunction1(value))
      
      inline def setOn_focusUndefined: Self = StObject.set(x, "on_focus", js.undefined)
      
      inline def setOn_ready(value: /* event */ Any => Unit): Self = StObject.set(x, "on_ready", js.Any.fromFunction1(value))
      
      inline def setOn_readyUndefined: Self = StObject.set(x, "on_ready", js.undefined)
      
      inline def setOn_success(value: /* event */ Any => Unit): Self = StObject.set(x, "on_success", js.Any.fromFunction1(value))
      
      inline def setOn_successUndefined: Self = StObject.set(x, "on_success", js.undefined)
      
      inline def setRequire(value: Phone): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.InputPaymentElementIdealSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.InputPaymentElementIdealSnake[K]} */
  trait InputPaymentElementIdealCamel extends StObject {
    
    var element_id: js.UndefOr[String] = js.undefined
    
    var on_blur: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_change: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_click: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_error: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_escape: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_focus: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_ready: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_success: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var options: js.UndefOr[Style] = js.undefined
  }
  object InputPaymentElementIdealCamel {
    
    inline def apply(): InputPaymentElementIdealCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementIdealCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputPaymentElementIdealCamel] (val x: Self) extends AnyVal {
      
      inline def setElement_id(value: String): Self = StObject.set(x, "element_id", value.asInstanceOf[js.Any])
      
      inline def setElement_idUndefined: Self = StObject.set(x, "element_id", js.undefined)
      
      inline def setOn_blur(value: /* event */ Any => Unit): Self = StObject.set(x, "on_blur", js.Any.fromFunction1(value))
      
      inline def setOn_blurUndefined: Self = StObject.set(x, "on_blur", js.undefined)
      
      inline def setOn_change(value: /* event */ Any => Unit): Self = StObject.set(x, "on_change", js.Any.fromFunction1(value))
      
      inline def setOn_changeUndefined: Self = StObject.set(x, "on_change", js.undefined)
      
      inline def setOn_click(value: /* event */ Any => Unit): Self = StObject.set(x, "on_click", js.Any.fromFunction1(value))
      
      inline def setOn_clickUndefined: Self = StObject.set(x, "on_click", js.undefined)
      
      inline def setOn_error(value: /* event */ Any => Unit): Self = StObject.set(x, "on_error", js.Any.fromFunction1(value))
      
      inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
      
      inline def setOn_escape(value: /* event */ Any => Unit): Self = StObject.set(x, "on_escape", js.Any.fromFunction1(value))
      
      inline def setOn_escapeUndefined: Self = StObject.set(x, "on_escape", js.undefined)
      
      inline def setOn_focus(value: /* event */ Any => Unit): Self = StObject.set(x, "on_focus", js.Any.fromFunction1(value))
      
      inline def setOn_focusUndefined: Self = StObject.set(x, "on_focus", js.undefined)
      
      inline def setOn_ready(value: /* event */ Any => Unit): Self = StObject.set(x, "on_ready", js.Any.fromFunction1(value))
      
      inline def setOn_readyUndefined: Self = StObject.set(x, "on_ready", js.undefined)
      
      inline def setOn_success(value: /* event */ Any => Unit): Self = StObject.set(x, "on_success", js.Any.fromFunction1(value))
      
      inline def setOn_successUndefined: Self = StObject.set(x, "on_success", js.undefined)
      
      inline def setOptions(value: Style): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.InputPaymentElementPaypalSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.InputPaymentElementPaypalSnake[K]} */
  trait InputPaymentElementPaypalCamel extends StObject {
    
    var element_id: js.UndefOr[String] = js.undefined
    
    var on_blur: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_change: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_click: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_error: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_escape: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_focus: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_ready: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_success: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object InputPaymentElementPaypalCamel {
    
    inline def apply(): InputPaymentElementPaypalCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentElementPaypalCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputPaymentElementPaypalCamel] (val x: Self) extends AnyVal {
      
      inline def setElement_id(value: String): Self = StObject.set(x, "element_id", value.asInstanceOf[js.Any])
      
      inline def setElement_idUndefined: Self = StObject.set(x, "element_id", js.undefined)
      
      inline def setOn_blur(value: /* event */ Any => Unit): Self = StObject.set(x, "on_blur", js.Any.fromFunction1(value))
      
      inline def setOn_blurUndefined: Self = StObject.set(x, "on_blur", js.undefined)
      
      inline def setOn_change(value: /* event */ Any => Unit): Self = StObject.set(x, "on_change", js.Any.fromFunction1(value))
      
      inline def setOn_changeUndefined: Self = StObject.set(x, "on_change", js.undefined)
      
      inline def setOn_click(value: /* event */ Any => Unit): Self = StObject.set(x, "on_click", js.Any.fromFunction1(value))
      
      inline def setOn_clickUndefined: Self = StObject.set(x, "on_click", js.undefined)
      
      inline def setOn_error(value: /* event */ Any => Unit): Self = StObject.set(x, "on_error", js.Any.fromFunction1(value))
      
      inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
      
      inline def setOn_escape(value: /* event */ Any => Unit): Self = StObject.set(x, "on_escape", js.Any.fromFunction1(value))
      
      inline def setOn_escapeUndefined: Self = StObject.set(x, "on_escape", js.undefined)
      
      inline def setOn_focus(value: /* event */ Any => Unit): Self = StObject.set(x, "on_focus", js.Any.fromFunction1(value))
      
      inline def setOn_focusUndefined: Self = StObject.set(x, "on_focus", js.undefined)
      
      inline def setOn_ready(value: /* event */ Any => Unit): Self = StObject.set(x, "on_ready", js.Any.fromFunction1(value))
      
      inline def setOn_readyUndefined: Self = StObject.set(x, "on_ready", js.undefined)
      
      inline def setOn_success(value: /* event */ Any => Unit): Self = StObject.set(x, "on_success", js.Any.fromFunction1(value))
      
      inline def setOn_successUndefined: Self = StObject.set(x, "on_success", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.InputPaymentRedirectSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.InputPaymentRedirectSnake[K]} */
  trait InputPaymentRedirectCamel extends StObject {
    
    var on_error: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var on_success: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  }
  object InputPaymentRedirectCamel {
    
    inline def apply(): InputPaymentRedirectCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputPaymentRedirectCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputPaymentRedirectCamel] (val x: Self) extends AnyVal {
      
      inline def setOn_error(value: /* event */ Any => Unit): Self = StObject.set(x, "on_error", js.Any.fromFunction1(value))
      
      inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
      
      inline def setOn_success(value: /* event */ Any => Unit): Self = StObject.set(x, "on_success", js.Any.fromFunction1(value))
      
      inline def setOn_successUndefined: Self = StObject.set(x, "on_success", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.PaymentSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.PaymentSnake[K]} */
  trait PaymentCamel extends StObject {
    
    var account: js.UndefOr[Account] = js.undefined
    
    var account_card: js.UndefOr[js.Object] = js.undefined
    
    var account_card_id: js.UndefOr[String] = js.undefined
    
    var account_id: js.UndefOr[String] = js.undefined
    
    var amazon: js.UndefOr[js.Object] = js.undefined
    
    var amount: Double
    
    var amount_refundable: js.UndefOr[Double] = js.undefined
    
    var amount_refunded: js.UndefOr[Double] = js.undefined
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var authorized: js.UndefOr[Boolean] = js.undefined
    
    var captured: js.UndefOr[Boolean] = js.undefined
    
    var card: js.UndefOr[Card] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var currency_rate: js.UndefOr[Double] = js.undefined
    
    var date_async_update: js.UndefOr[String] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[js.Object] = js.undefined
    
    var gateway: js.UndefOr[String] = js.undefined
    
    var giftcard: js.UndefOr[js.Object] = js.undefined
    
    var giftcard_id: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var intent: js.UndefOr[js.Object] = js.undefined
    
    var invoice: js.UndefOr[Invoice] = js.undefined
    
    var invoice_id: js.UndefOr[String] = js.undefined
    
    var method: String
    
    var number: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
    
    var order_id: js.UndefOr[String] = js.undefined
    
    var paypal: js.UndefOr[js.Object] = js.undefined
    
    var refunds: js.UndefOr[js.Array[Refund]] = js.undefined
    
    var status: js.UndefOr[pending | error | success | authorized] = js.undefined
    
    var subscription: js.UndefOr[Subscription] = js.undefined
    
    var subscription_id: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[Boolean] = js.undefined
    
    var test: js.UndefOr[Boolean] = js.undefined
    
    var transaction_id: js.UndefOr[String] = js.undefined
  }
  object PaymentCamel {
    
    inline def apply(amount: Double, method: String): PaymentCamel = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentCamel] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setAccount_card(value: js.Object): Self = StObject.set(x, "account_card", value.asInstanceOf[js.Any])
      
      inline def setAccount_cardUndefined: Self = StObject.set(x, "account_card", js.undefined)
      
      inline def setAccount_card_id(value: String): Self = StObject.set(x, "account_card_id", value.asInstanceOf[js.Any])
      
      inline def setAccount_card_idUndefined: Self = StObject.set(x, "account_card_id", js.undefined)
      
      inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
      
      inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
      
      inline def setAmazon(value: js.Object): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
      
      inline def setAmazonUndefined: Self = StObject.set(x, "amazon", js.undefined)
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmount_refundable(value: Double): Self = StObject.set(x, "amount_refundable", value.asInstanceOf[js.Any])
      
      inline def setAmount_refundableUndefined: Self = StObject.set(x, "amount_refundable", js.undefined)
      
      inline def setAmount_refunded(value: Double): Self = StObject.set(x, "amount_refunded", value.asInstanceOf[js.Any])
      
      inline def setAmount_refundedUndefined: Self = StObject.set(x, "amount_refunded", js.undefined)
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAuthorized(value: Boolean): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
      
      inline def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
      
      inline def setCaptured(value: Boolean): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
      
      inline def setCapturedUndefined: Self = StObject.set(x, "captured", js.undefined)
      
      inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setCurrency_rate(value: Double): Self = StObject.set(x, "currency_rate", value.asInstanceOf[js.Any])
      
      inline def setCurrency_rateUndefined: Self = StObject.set(x, "currency_rate", js.undefined)
      
      inline def setDate_async_update(value: String): Self = StObject.set(x, "date_async_update", value.asInstanceOf[js.Any])
      
      inline def setDate_async_updateUndefined: Self = StObject.set(x, "date_async_update", js.undefined)
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setError(value: js.Object): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setGiftcard(value: js.Object): Self = StObject.set(x, "giftcard", value.asInstanceOf[js.Any])
      
      inline def setGiftcardUndefined: Self = StObject.set(x, "giftcard", js.undefined)
      
      inline def setGiftcard_id(value: String): Self = StObject.set(x, "giftcard_id", value.asInstanceOf[js.Any])
      
      inline def setGiftcard_idUndefined: Self = StObject.set(x, "giftcard_id", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIntent(value: js.Object): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setInvoice(value: Invoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      inline def setInvoiceUndefined: Self = StObject.set(x, "invoice", js.undefined)
      
      inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
      
      inline def setInvoice_idUndefined: Self = StObject.set(x, "invoice_id", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
      
      inline def setOrder_idUndefined: Self = StObject.set(x, "order_id", js.undefined)
      
      inline def setPaypal(value: js.Object): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
      
      inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
      
      inline def setRefunds(value: js.Array[Refund]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
      
      inline def setRefundsUndefined: Self = StObject.set(x, "refunds", js.undefined)
      
      inline def setRefundsVarargs(value: Refund*): Self = StObject.set(x, "refunds", js.Array(value*))
      
      inline def setStatus(value: pending | error | success | authorized): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
      
      inline def setSubscription_id(value: String): Self = StObject.set(x, "subscription_id", value.asInstanceOf[js.Any])
      
      inline def setSubscription_idUndefined: Self = StObject.set(x, "subscription_id", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
      
      inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    }
  }
}
