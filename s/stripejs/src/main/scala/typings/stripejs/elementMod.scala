package typings.stripejs

import typings.std.HTMLElement
import typings.stripejs.anon.Base
import typings.stripejs.anon.Complete
import typings.stripejs.anon.Empty
import typings.stripejs.anon.Invalid
import typings.stripejs.anon.PreventDefault
import typings.stripejs.mod.StripeError
import typings.stripejs.stripejsStrings.`light-outline`
import typings.stripejs.stripejsStrings.auto
import typings.stripejs.stripejsStrings.blur
import typings.stripejs.stripejsStrings.bold
import typings.stripejs.stripejsStrings.bolder
import typings.stripejs.stripejsStrings.buy
import typings.stripejs.stripejsStrings.change
import typings.stripejs.stripejsStrings.click
import typings.stripejs.stripejsStrings.da
import typings.stripejs.stripejsStrings.dark
import typings.stripejs.stripejsStrings.de
import typings.stripejs.stripejsStrings.default
import typings.stripejs.stripejsStrings.donate
import typings.stripejs.stripejsStrings.en
import typings.stripejs.stripejsStrings.es
import typings.stripejs.stripejsStrings.fi
import typings.stripejs.stripejsStrings.focus
import typings.stripejs.stripejsStrings.fr
import typings.stripejs.stripejsStrings.inherit
import typings.stripejs.stripejsStrings.initial
import typings.stripejs.stripejsStrings.it
import typings.stripejs.stripejsStrings.italic
import typings.stripejs.stripejsStrings.ja
import typings.stripejs.stripejsStrings.light
import typings.stripejs.stripejsStrings.lighter
import typings.stripejs.stripejsStrings.nl
import typings.stripejs.stripejsStrings.no
import typings.stripejs.stripejsStrings.normal
import typings.stripejs.stripejsStrings.oblique
import typings.stripejs.stripejsStrings.ready
import typings.stripejs.stripejsStrings.revert
import typings.stripejs.stripejsStrings.solid
import typings.stripejs.stripejsStrings.sv
import typings.stripejs.stripejsStrings.unset
import typings.stripejs.stripejsStrings.zh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  trait BaseOptions extends StObject {
    
    /**
      * Set custom class names on the container DOM element when the Stripe Element is in a
      * particular state.
      */
    var classes: js.UndefOr[Empty] = js.undefined
    
    /**
      * Whether or not the input is disabled
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the icon should be hidden
      * @default false
      */
    var hideIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customize appearance using CSS properties
      */
    var style: js.UndefOr[Invalid] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setClasses(value: Empty): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHideIcon(value: Boolean): Self = StObject.set(x, "hideIcon", value.asInstanceOf[js.Any])
      
      inline def setHideIconUndefined: Self = StObject.set(x, "hideIcon", js.undefined)
      
      inline def setStyle(value: Invalid): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait CardElementOptions
    extends StObject
       with BaseOptions {
    
    /**
      * Whether or not to hide the postal code
      * NOTE: If you are already collecting a full billing address or postal code elsewhere, set this to `true`
      * @default false
      */
    var hidePostalCode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Appearance of the icon in the Element
      */
    var iconStyle: js.UndefOr[solid | default] = js.undefined
    
    /**
      * A placeholder text
      * NOTE: This is only available for `cardNumber`, `cardExpiry` & `cardCvc` elements
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * A pre-filled value
      * NOTE: Sensitive card information (card number, CVC, and expiration date) cannot be pre-filled
      * @see placeholder
      *
      * @example {postalCode: '94110'}
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object CardElementOptions {
    
    inline def apply(): CardElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardElementOptions]
    }
    
    extension [Self <: CardElementOptions](x: Self) {
      
      inline def setHidePostalCode(value: Boolean): Self = StObject.set(x, "hidePostalCode", value.asInstanceOf[js.Any])
      
      inline def setHidePostalCodeUndefined: Self = StObject.set(x, "hidePostalCode", js.undefined)
      
      inline def setIconStyle(value: solid | default): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ElementCreatorOptions extends StObject {
    
    /**
      * Fonts that should be used for styling the element
      * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
      */
    var fonts: js.UndefOr[js.Array[FontCSSElement | FontConfigElement]] = js.undefined
    
    /**
      * The translation that should be used for the element text
      * `auto` defaults to the browser language
      *
      * @default 'auto'
      */
    var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String] = js.undefined
  }
  object ElementCreatorOptions {
    
    inline def apply(): ElementCreatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementCreatorOptions]
    }
    
    extension [Self <: ElementCreatorOptions](x: Self) {
      
      inline def setFonts(value: js.Array[FontCSSElement | FontConfigElement]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setFontsVarargs(value: (FontCSSElement | FontConfigElement)*): Self = StObject.set(x, "fonts", js.Array(value*))
      
      inline def setLocale(value: auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  @js.native
  trait ElementFactory extends StObject {
    
    /**
      * Creates a new StripeJS element
      * @see https://stripe.com/docs/stripe-js/reference#elements-create
      * @param type - The type of element that should be created
      * @param options - Any options that should be used to con
      *
      * @example ```
      * const style = {
      *    base: {
      *      color: '#303238',
      *      fontSize: '16px',
      *      color: "#32325d",
      *      fontSmoothing: 'antialiased',
      *      '::placeholder': {
      *        color: '#ccc',
      *      },
      *    },
      *    invalid: {
      *      color: '#e5424d',
      *      ':focus': {
      *        color: '#303238',
      *        },
      *    },
      * };
      * const cardElement = elementCreator.create('card', {style: style})
      * ```
      *
      * @return The created element
      */
    def create(`type`: ElementType, options: CardElementOptions): StripeElement = js.native
    def create(`type`: ElementType, options: IBANElementOptions): StripeElement = js.native
    def create(`type`: ElementType, options: IdealBankOptions): StripeElement = js.native
    def create(`type`: ElementType, options: PaymentButtonOptions): StripeElement = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripejs.stripejsStrings.card
    - typings.stripejs.stripejsStrings.cardNumber
    - typings.stripejs.stripejsStrings.cardExpiry
    - typings.stripejs.stripejsStrings.cardCvc
    - typings.stripejs.stripejsStrings.postalCode
    - typings.stripejs.stripejsStrings.paymentRequestButton
  */
  trait ElementType extends StObject
  object ElementType {
    
    inline def card: typings.stripejs.stripejsStrings.card = "card".asInstanceOf[typings.stripejs.stripejsStrings.card]
    
    inline def cardCvc: typings.stripejs.stripejsStrings.cardCvc = "cardCvc".asInstanceOf[typings.stripejs.stripejsStrings.cardCvc]
    
    inline def cardExpiry: typings.stripejs.stripejsStrings.cardExpiry = "cardExpiry".asInstanceOf[typings.stripejs.stripejsStrings.cardExpiry]
    
    inline def cardNumber: typings.stripejs.stripejsStrings.cardNumber = "cardNumber".asInstanceOf[typings.stripejs.stripejsStrings.cardNumber]
    
    inline def paymentRequestButton: typings.stripejs.stripejsStrings.paymentRequestButton = "paymentRequestButton".asInstanceOf[typings.stripejs.stripejsStrings.paymentRequestButton]
    
    inline def postalCode: typings.stripejs.stripejsStrings.postalCode = "postalCode".asInstanceOf[typings.stripejs.stripejsStrings.postalCode]
  }
  
  trait FontCSSElement extends StObject {
    
    /**
      * A relative or absolute URL pointing to a CSS file with `@font-face` definitions
      * @example 'https://fonts.googleapis.com/css?family=Open+Sans'
      */
    var cssSrc: String
  }
  object FontCSSElement {
    
    inline def apply(cssSrc: String): FontCSSElement = {
      val __obj = js.Dynamic.literal(cssSrc = cssSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontCSSElement]
    }
    
    extension [Self <: FontCSSElement](x: Self) {
      
      inline def setCssSrc(value: String): Self = StObject.set(x, "cssSrc", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontConfigElement extends StObject {
    
    /**
      * The name of the font family
      * @example 'Times New Roman'
      */
    var family: js.UndefOr[String] = js.undefined
    
    /**
      * A src value pointing to your custom font file.
      * @example
      * 'url(https://somewebsite.com/path/to/font.woff)'
      * 'url(path/to/font.woff)'
      */
    var src: js.UndefOr[String] = js.undefined
    
    /**
      * The style of the text
      * @default 'normal'
      */
    var style: js.UndefOr[normal | italic | oblique] = js.undefined
    
    /**
      * A unicode range for the font that should be used
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/@font-face/unicode-range
      */
    var unicodeRange: js.UndefOr[String] = js.undefined
    
    /**
      * The weight of the font
      * NOTE: This cannot be a number!
      */
    var weight: js.UndefOr[initial | inherit | bold | bolder | lighter | normal | revert | unset] = js.undefined
  }
  object FontConfigElement {
    
    inline def apply(): FontConfigElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontConfigElement]
    }
    
    extension [Self <: FontConfigElement](x: Self) {
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStyle(value: normal | italic | oblique): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      inline def setWeight(value: initial | inherit | bold | bolder | lighter | normal | revert | unset): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait IBANElementOptions
    extends StObject
       with BaseOptions {
    
    /**
      * Appearance of the icon in the Element
      */
    var iconStyle: js.UndefOr[solid | default] = js.undefined
    
    /**
      * Customize the country and format of the placeholder IBAN
      * @default 'DE"
      */
    var placeholderCountry: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the list of countries or country-groups whose IBANs you want to allow
      */
    var supportedCountries: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IBANElementOptions {
    
    inline def apply(): IBANElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBANElementOptions]
    }
    
    extension [Self <: IBANElementOptions](x: Self) {
      
      inline def setIconStyle(value: solid | default): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setPlaceholderCountry(value: String): Self = StObject.set(x, "placeholderCountry", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCountryUndefined: Self = StObject.set(x, "placeholderCountry", js.undefined)
      
      inline def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
      
      inline def setSupportedCountriesUndefined: Self = StObject.set(x, "supportedCountries", js.undefined)
      
      inline def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value*))
    }
  }
  
  trait IdealBankOptions
    extends StObject
       with BaseOptions {
    
    /**
      * A pre-filled value for the Element. Can be one of the banks listed in the
      * @see https://stripe.com/docs/sources/ideal#optional-specifying-the-customers-bank
      *
      * @example 'abn_amro'
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object IdealBankOptions {
    
    inline def apply(): IdealBankOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdealBankOptions]
    }
    
    extension [Self <: IdealBankOptions](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MSClearAttributes
    extends StObject
       with StyleAttributes {
    
    var display: js.UndefOr[String] = js.undefined
  }
  object MSClearAttributes {
    
    inline def apply(): MSClearAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MSClearAttributes]
    }
    
    extension [Self <: MSClearAttributes](x: Self) {
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    }
  }
  
  trait OnChange extends StObject {
    
    /**
      * The financial institution that services the account whose IBAN was entered into the Element.
      * NOTE: This is only available when the element is of IBAN type
      */
    var bankName: String
    
    /**
      * The type of card that was used
      * @example 'visa'
      * NOTE: This is only available when the element is of Card or Cardnumber type
      */
    var brand: js.UndefOr[String] = js.undefined
    
    /**
      * true if the value is well-formed and potentially complete
      */
    var complete: Boolean
    
    /**
      * The country code of the entered IBAN
      * NOTE: This is only available when the element is of IBAN type
      */
    var country: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the Element that changed.
      */
    var elementType: ElementType
    
    /**
      * true if the value is empty
      */
    var empty: Boolean
    
    /**
      * The current validation error if any
      */
    var error: StripeError
    
    /**
      * The value of the element
      * @see CardElementOptions.value for more information
      * NOTE: This is only filled is the element is of a Card type
      *
      * -----
      *
      * The selected bank. Can be one of the banks listed in the
      * @see https://stripe.com/docs/sources/ideal#optional-specifying-the-customers-bank
      * NOTE: This is also filled when the element is of IdealBank type
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object OnChange {
    
    inline def apply(bankName: String, complete: Boolean, elementType: ElementType, empty: Boolean, error: StripeError): OnChange = {
      val __obj = js.Dynamic.literal(bankName = bankName.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChange]
    }
    
    extension [Self <: OnChange](x: Self) {
      
      inline def setBankName(value: String): Self = StObject.set(x, "bankName", value.asInstanceOf[js.Any])
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setElementType(value: ElementType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setError(value: StripeError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PaymentButtonOptions extends StObject {
    
    /**
      * Set custom class names on the container DOM element when the Stripe Element is in a
      * particular state.
      */
    var classes: js.UndefOr[Base] = js.undefined
    
    var paymentRequest: Any
    
    var style: js.UndefOr[Complete] = js.undefined
  }
  object PaymentButtonOptions {
    
    inline def apply(paymentRequest: Any): PaymentButtonOptions = {
      val __obj = js.Dynamic.literal(paymentRequest = paymentRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentButtonOptions]
    }
    
    extension [Self <: PaymentButtonOptions](x: Self) {
      
      inline def setClasses(value: Base): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setPaymentRequest(value: Any): Self = StObject.set(x, "paymentRequest", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Complete): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait PaymentRequestButtonStyle extends StObject {
    
    /**
      * The height of the button
      * @example '25px'
      */
    var height: js.UndefOr[String] = js.undefined
    
    /**
      * The theme of the button that should be used
      * @default 'dark'
      */
    var theme: js.UndefOr[dark | light | `light-outline`] = js.undefined
    
    /**
      * The type of button that should be shown
      * @default 'default'
      */
    var `type`: js.UndefOr[default | donate | buy] = js.undefined
  }
  object PaymentRequestButtonStyle {
    
    inline def apply(): PaymentRequestButtonStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentRequestButtonStyle]
    }
    
    extension [Self <: PaymentRequestButtonStyle](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setTheme(value: dark | light | `light-outline`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: default | donate | buy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait StripeElement extends StObject {
    
    /**
      * Blur the element
      * @see https://stripe.com/docs/stripe-js/reference#other-methods
      */
    def blur(): Unit = js.native
    
    /**
      * Clear the value of the element
      */
    def clear(): Unit = js.native
    
    /**
      * Removes the Element from the DOM and destroys it
      * NOTE: a destroyed element can not be re-activated or re-mounted to the DOM
      */
    def destroy(): Unit = js.native
    
    /**
      * Give focus to the element
      */
    def focus(): Unit = js.native
    
    def mount(element: String): Unit = js.native
    /**
      * Mount the element to the DOM
      * @see https://stripe.com/docs/stripe-js/reference#element-mount
      *
      * @param element - A HTML DOM element or a CSS selector
      *
      * @example ```
      * <label for="card-element">Card</label>
      * <div id="card-element"></div>
      *
      * cardElement.mount('#card-element');
      * ```
      */
    def mount(element: HTMLElement): Unit = js.native
    
    /**
      * Watch for changes on the element
      * @see https://stripe.com/docs/stripe-js/reference#element-on
      *
      * @param event - What event to listen to
      * @param handler - The handler function that is called when the event fires
      */
    def on(event: blur | focus | ready, handler: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_change(event: change, handler: js.Function1[/* event */ OnChange, Unit]): Unit = js.native
    @JSName("on")
    def on_click(event: click, handler: js.Function1[/* event */ PreventDefault, Unit]): Unit = js.native
    
    /**
      * Unmounts the Element from the DOM
      * Call `element.mount()` to re-attach it to the DOM
      * @see mount
      */
    def unmount(): Unit = js.native
    
    /**
      * Updates the options the Element was initialized with
      * NOTE: Updates are merged into the existing configuration
      * @param options - The options that should be used to update the element
      */
    def update(options: CardElementOptions): Unit = js.native
    def update(options: IBANElementOptions): Unit = js.native
    def update(options: IdealBankOptions): Unit = js.native
    def update(options: PaymentButtonOptions): Unit = js.native
  }
  
  trait StyleAttributes extends StObject {
    
    @JSName(":-webkit-autofill")
    var `Colon-webkit-autofill`: js.UndefOr[StyleAttributes] = js.undefined
    
    @JSName("::-ms-clear")
    var `ColonColon-ms-clear`: js.UndefOr[MSClearAttributes] = js.undefined
    
    @JSName("::placeholder")
    var ColonColonplaceholder: js.UndefOr[StyleAttributes] = js.undefined
    
    @JSName("::selection")
    var ColonColonselection: js.UndefOr[StyleAttributes] = js.undefined
    
    @JSName(":disabled")
    var Colondisabled: js.UndefOr[StyleAttributes] = js.undefined
    
    @JSName(":focus")
    var Colonfocus: js.UndefOr[StyleAttributes] = js.undefined
    
    @JSName(":hover")
    var Colonhover: js.UndefOr[StyleAttributes] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontSmoothing: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontVariant: js.UndefOr[Any] = js.undefined
    
    var iconColor: js.UndefOr[String] = js.undefined
    
    var letterSpacing: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[String] = js.undefined
    
    /**
      * Add padding to the element
      * NOTE: Only available for the `idealBank` Element
      */
    var padding: js.UndefOr[String] = js.undefined
    
    /**
      * Align text inside the element
      * NOTE: Only available for the `cardNumber`, `cardExpiry`, and `cardCvc` Elements
      */
    var textAlign: js.UndefOr[String] = js.undefined
    
    var textDecoration: js.UndefOr[String] = js.undefined
    
    var textShadow: js.UndefOr[String] = js.undefined
    
    var textTransform: js.UndefOr[String] = js.undefined
  }
  object StyleAttributes {
    
    inline def apply(): StyleAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleAttributes]
    }
    
    extension [Self <: StyleAttributes](x: Self) {
      
      inline def `setColon-webkit-autofill`(value: StyleAttributes): Self = StObject.set(x, ":-webkit-autofill", value.asInstanceOf[js.Any])
      
      inline def `setColon-webkit-autofillUndefined`: Self = StObject.set(x, ":-webkit-autofill", js.undefined)
      
      inline def `setColonColon-ms-clear`(value: MSClearAttributes): Self = StObject.set(x, "::-ms-clear", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-clearUndefined`: Self = StObject.set(x, "::-ms-clear", js.undefined)
      
      inline def setColonColonplaceholder(value: StyleAttributes): Self = StObject.set(x, "::placeholder", value.asInstanceOf[js.Any])
      
      inline def setColonColonplaceholderUndefined: Self = StObject.set(x, "::placeholder", js.undefined)
      
      inline def setColonColonselection(value: StyleAttributes): Self = StObject.set(x, "::selection", value.asInstanceOf[js.Any])
      
      inline def setColonColonselectionUndefined: Self = StObject.set(x, "::selection", js.undefined)
      
      inline def setColondisabled(value: StyleAttributes): Self = StObject.set(x, ":disabled", value.asInstanceOf[js.Any])
      
      inline def setColondisabledUndefined: Self = StObject.set(x, ":disabled", js.undefined)
      
      inline def setColonfocus(value: StyleAttributes): Self = StObject.set(x, ":focus", value.asInstanceOf[js.Any])
      
      inline def setColonfocusUndefined: Self = StObject.set(x, ":focus", js.undefined)
      
      inline def setColonhover(value: StyleAttributes): Self = StObject.set(x, ":hover", value.asInstanceOf[js.Any])
      
      inline def setColonhoverUndefined: Self = StObject.set(x, ":hover", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSmoothing(value: String): Self = StObject.set(x, "fontSmoothing", value.asInstanceOf[js.Any])
      
      inline def setFontSmoothingUndefined: Self = StObject.set(x, "fontSmoothing", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: Any): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      inline def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    }
  }
}
