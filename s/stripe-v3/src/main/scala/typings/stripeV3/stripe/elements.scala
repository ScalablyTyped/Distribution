package typings.stripeV3.stripe

import org.scalablytyped.runtime.StringDictionary
import typings.stripeV3.anon.Base
import typings.stripeV3.anon.Complete
import typings.stripeV3.anon.PostalCode
import typings.stripeV3.anon.PreventDefault
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeV3.stripeV3Strings.`light-outline`
import typings.stripeV3.stripeV3Strings.buy
import typings.stripeV3.stripeV3Strings.click
import typings.stripeV3.stripeV3Strings.dark
import typings.stripeV3.stripeV3Strings.default
import typings.stripeV3.stripeV3Strings.donate
import typings.stripeV3.stripeV3Strings.light
import typings.stripeV3.stripeV3Strings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Container for all elements related types
object elements {
  
  @js.native
  trait Element extends StObject {
    
    def addEventListener(event: eventTypes, handler: handler): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(event: click, handler: js.Function1[/* response */ PreventDefault, Unit]): Unit = js.native
    
    def blur(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def focus(): Unit = js.native
    
    // HTMLElement keeps giving this error for some reason:
    // Cannot find name 'HTMLElement'
    def mount(domElement: js.Any): Unit = js.native
    
    def on(event: eventTypes, handler: handler): Unit = js.native
    @JSName("on")
    def on_click(event: click, handler: js.Function1[/* response */ PreventDefault, Unit]): Unit = js.native
    
    def unmount(): Unit = js.native
    
    def update(options: ElementsOptions): Unit = js.native
  }
  
  trait ElementChangeResponse extends StObject {
    
    var bankName: js.UndefOr[String] = js.undefined
    
    var brand: String
    
    var complete: Boolean
    
    var country: js.UndefOr[String] = js.undefined
    
    var elementType: String
    
    var empty: Boolean
    
    var error: js.UndefOr[Error] = js.undefined
    
    var value: js.UndefOr[PostalCode | String] = js.undefined
  }
  object ElementChangeResponse {
    
    inline def apply(brand: String, complete: Boolean, elementType: String, empty: Boolean): ElementChangeResponse = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementChangeResponse]
    }
    
    extension [Self <: ElementChangeResponse](x: Self) {
      
      inline def setBankName(value: String): Self = StObject.set(x, "bankName", value.asInstanceOf[js.Any])
      
      inline def setBankNameUndefined: Self = StObject.set(x, "bankName", js.undefined)
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setValue(value: PostalCode | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ElementOptions extends StObject {
    
    var fonts: js.UndefOr[js.Array[Font]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
  }
  object ElementOptions {
    
    inline def apply(): ElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementOptions]
    }
    
    extension [Self <: ElementOptions](x: Self) {
      
      inline def setFonts(value: js.Array[Font]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setFontsVarargs(value: Font*): Self = StObject.set(x, "fonts", js.Array(value :_*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  @js.native
  trait Elements extends StObject {
    
    def create(`type`: elementsType): Element = js.native
    def create(`type`: elementsType, options: ElementsOptions): Element = js.native
    
    def getElement(`type`: elementsType): Element | Null = js.native
  }
  
  trait ElementsCreateOptions extends StObject {
    
    var fonts: js.UndefOr[js.Array[Font]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
  }
  object ElementsCreateOptions {
    
    inline def apply(): ElementsCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementsCreateOptions]
    }
    
    extension [Self <: ElementsCreateOptions](x: Self) {
      
      inline def setFonts(value: js.Array[Font]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setFontsVarargs(value: Font*): Self = StObject.set(x, "fonts", js.Array(value :_*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  trait ElementsOptions extends StObject {
    
    var classes: js.UndefOr[Base] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hideIcon: js.UndefOr[Boolean] = js.undefined
    
    var hidePostalCode: js.UndefOr[Boolean] = js.undefined
    
    var iconStyle: js.UndefOr[solid | default] = js.undefined
    
    var paymentRequest: js.UndefOr[StripePaymentRequest] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var placeholderCountry: js.UndefOr[String] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Complete] = js.undefined
    
    var supportedCountries: js.UndefOr[js.Array[String]] = js.undefined
    
    var value: js.UndefOr[String | StringDictionary[String]] = js.undefined
  }
  object ElementsOptions {
    
    inline def apply(): ElementsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementsOptions]
    }
    
    extension [Self <: ElementsOptions](x: Self) {
      
      inline def setClasses(value: Base): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHideIcon(value: Boolean): Self = StObject.set(x, "hideIcon", value.asInstanceOf[js.Any])
      
      inline def setHideIconUndefined: Self = StObject.set(x, "hideIcon", js.undefined)
      
      inline def setHidePostalCode(value: Boolean): Self = StObject.set(x, "hidePostalCode", value.asInstanceOf[js.Any])
      
      inline def setHidePostalCodeUndefined: Self = StObject.set(x, "hidePostalCode", js.undefined)
      
      inline def setIconStyle(value: solid | default): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setPaymentRequest(value: StripePaymentRequest): Self = StObject.set(x, "paymentRequest", value.asInstanceOf[js.Any])
      
      inline def setPaymentRequestUndefined: Self = StObject.set(x, "paymentRequest", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCountry(value: String): Self = StObject.set(x, "placeholderCountry", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCountryUndefined: Self = StObject.set(x, "placeholderCountry", js.undefined)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setStyle(value: Complete): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
      
      inline def setSupportedCountriesUndefined: Self = StObject.set(x, "supportedCountries", js.undefined)
      
      inline def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value :_*))
      
      inline def setValue(value: String | StringDictionary[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Font extends StObject {
    
    var cssSrc: js.UndefOr[String] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    var family: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var unicodeRange: js.UndefOr[String] = js.undefined
    
    var weight: js.UndefOr[String] = js.undefined
  }
  object Font {
    
    inline def apply(): Font = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Font]
    }
    
    extension [Self <: Font](x: Self) {
      
      inline def setCssSrc(value: String): Self = StObject.set(x, "cssSrc", value.asInstanceOf[js.Any])
      
      inline def setCssSrcUndefined: Self = StObject.set(x, "cssSrc", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait PaymentRequestButtonStyleOptions extends StObject {
    
    var height: String
    
    var theme: dark | light | `light-outline`
    
    var `type`: js.UndefOr[default | donate | buy] = js.undefined
  }
  object PaymentRequestButtonStyleOptions {
    
    inline def apply(height: String, theme: dark | light | `light-outline`): PaymentRequestButtonStyleOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentRequestButtonStyleOptions]
    }
    
    extension [Self <: PaymentRequestButtonStyleOptions](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: dark | light | `light-outline`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setType(value: default | donate | buy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Style
    extends StObject
       with StyleOptions {
    
    @JSName(":-webkit-autofill")
    var `Colon-webkit-autofill`: js.UndefOr[StyleOptions] = js.undefined
    
    @JSName("::-ms-clear")
    var `ColonColon-ms-clear`: js.UndefOr[StyleOptions] = js.undefined
    
    @JSName("::placeholder")
    var ColonColonplaceholder: js.UndefOr[StyleOptions] = js.undefined
    
    @JSName("::selection")
    var ColonColonselection: js.UndefOr[StyleOptions] = js.undefined
    
    @JSName(":disabled")
    var Colondisabled: js.UndefOr[StyleOptions] = js.undefined
    
    @JSName(":focus")
    var Colonfocus: js.UndefOr[StyleOptions] = js.undefined
    
    @JSName(":hover")
    var Colonhover: js.UndefOr[StyleOptions] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def `setColon-webkit-autofill`(value: StyleOptions): Self = StObject.set(x, ":-webkit-autofill", value.asInstanceOf[js.Any])
      
      inline def `setColon-webkit-autofillUndefined`: Self = StObject.set(x, ":-webkit-autofill", js.undefined)
      
      inline def `setColonColon-ms-clear`(value: StyleOptions): Self = StObject.set(x, "::-ms-clear", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-clearUndefined`: Self = StObject.set(x, "::-ms-clear", js.undefined)
      
      inline def setColonColonplaceholder(value: StyleOptions): Self = StObject.set(x, "::placeholder", value.asInstanceOf[js.Any])
      
      inline def setColonColonplaceholderUndefined: Self = StObject.set(x, "::placeholder", js.undefined)
      
      inline def setColonColonselection(value: StyleOptions): Self = StObject.set(x, "::selection", value.asInstanceOf[js.Any])
      
      inline def setColonColonselectionUndefined: Self = StObject.set(x, "::selection", js.undefined)
      
      inline def setColondisabled(value: StyleOptions): Self = StObject.set(x, ":disabled", value.asInstanceOf[js.Any])
      
      inline def setColondisabledUndefined: Self = StObject.set(x, ":disabled", js.undefined)
      
      inline def setColonfocus(value: StyleOptions): Self = StObject.set(x, ":focus", value.asInstanceOf[js.Any])
      
      inline def setColonfocusUndefined: Self = StObject.set(x, ":focus", js.undefined)
      
      inline def setColonhover(value: StyleOptions): Self = StObject.set(x, ":hover", value.asInstanceOf[js.Any])
      
      inline def setColonhoverUndefined: Self = StObject.set(x, ":hover", js.undefined)
    }
  }
  
  trait StyleOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontSmoothing: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontVariant: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String | Double] = js.undefined
    
    var iconColor: js.UndefOr[String] = js.undefined
    
    var letterSpacing: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[String] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var textDecoration: js.UndefOr[String] = js.undefined
    
    var textShadow: js.UndefOr[String] = js.undefined
    
    var textTransform: js.UndefOr[String] = js.undefined
  }
  object StyleOptions {
    
    inline def apply(): StyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleOptions]
    }
    
    extension [Self <: StyleOptions](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
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
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripeV3.stripeV3Strings.card
    - typings.stripeV3.stripeV3Strings.cardNumber
    - typings.stripeV3.stripeV3Strings.cardExpiry
    - typings.stripeV3.stripeV3Strings.cardCvc
    - typings.stripeV3.stripeV3Strings.postalCode
    - typings.stripeV3.stripeV3Strings.paymentRequestButton
    - typings.stripeV3.stripeV3Strings.iban
    - typings.stripeV3.stripeV3Strings.idealBank
  */
  trait elementsType extends StObject
  object elementsType {
    
    inline def card: typings.stripeV3.stripeV3Strings.card = "card".asInstanceOf[typings.stripeV3.stripeV3Strings.card]
    
    inline def cardCvc: typings.stripeV3.stripeV3Strings.cardCvc = "cardCvc".asInstanceOf[typings.stripeV3.stripeV3Strings.cardCvc]
    
    inline def cardExpiry: typings.stripeV3.stripeV3Strings.cardExpiry = "cardExpiry".asInstanceOf[typings.stripeV3.stripeV3Strings.cardExpiry]
    
    inline def cardNumber: typings.stripeV3.stripeV3Strings.cardNumber = "cardNumber".asInstanceOf[typings.stripeV3.stripeV3Strings.cardNumber]
    
    inline def iban: typings.stripeV3.stripeV3Strings.iban = "iban".asInstanceOf[typings.stripeV3.stripeV3Strings.iban]
    
    inline def idealBank: typings.stripeV3.stripeV3Strings.idealBank = "idealBank".asInstanceOf[typings.stripeV3.stripeV3Strings.idealBank]
    
    inline def paymentRequestButton: typings.stripeV3.stripeV3Strings.paymentRequestButton = "paymentRequestButton".asInstanceOf[typings.stripeV3.stripeV3Strings.paymentRequestButton]
    
    inline def postalCode: typings.stripeV3.stripeV3Strings.postalCode = "postalCode".asInstanceOf[typings.stripeV3.stripeV3Strings.postalCode]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripeV3.stripeV3Strings.blur
    - typings.stripeV3.stripeV3Strings.change
    - typings.stripeV3.stripeV3Strings.focus
    - typings.stripeV3.stripeV3Strings.ready
  */
  trait eventTypes extends StObject
  object eventTypes {
    
    inline def blur: typings.stripeV3.stripeV3Strings.blur = "blur".asInstanceOf[typings.stripeV3.stripeV3Strings.blur]
    
    inline def change: typings.stripeV3.stripeV3Strings.change = "change".asInstanceOf[typings.stripeV3.stripeV3Strings.change]
    
    inline def focus: typings.stripeV3.stripeV3Strings.focus = "focus".asInstanceOf[typings.stripeV3.stripeV3Strings.focus]
    
    inline def ready: typings.stripeV3.stripeV3Strings.ready = "ready".asInstanceOf[typings.stripeV3.stripeV3Strings.ready]
  }
  
  type handler = js.Function1[/* response */ js.UndefOr[ElementChangeResponse], Unit]
}
