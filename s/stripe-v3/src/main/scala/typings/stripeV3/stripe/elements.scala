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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait ElementChangeResponse extends StObject {
    
    var bankName: js.UndefOr[String] = js.native
    
    var brand: String = js.native
    
    var complete: Boolean = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var elementType: String = js.native
    
    var empty: Boolean = js.native
    
    var error: js.UndefOr[Error] = js.native
    
    var value: js.UndefOr[PostalCode | String] = js.native
  }
  object ElementChangeResponse {
    
    @scala.inline
    def apply(brand: String, complete: Boolean, elementType: String, empty: Boolean): ElementChangeResponse = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementChangeResponse]
    }
    
    @scala.inline
    implicit class ElementChangeResponseMutableBuilder[Self <: ElementChangeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBankName(value: String): Self = StObject.set(x, "bankName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBankNameUndefined: Self = StObject.set(x, "bankName", js.undefined)
      
      @scala.inline
      def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setValue(value: PostalCode | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ElementOptions extends StObject {
    
    var fonts: js.UndefOr[js.Array[Font]] = js.native
    
    var locale: js.UndefOr[String] = js.native
  }
  object ElementOptions {
    
    @scala.inline
    def apply(): ElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementOptions]
    }
    
    @scala.inline
    implicit class ElementOptionsMutableBuilder[Self <: ElementOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFonts(value: js.Array[Font]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      @scala.inline
      def setFontsVarargs(value: Font*): Self = StObject.set(x, "fonts", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  @js.native
  trait Elements extends StObject {
    
    def create(`type`: elementsType): Element = js.native
    def create(`type`: elementsType, options: ElementsOptions): Element = js.native
    
    def getElement(`type`: elementsType): Element | Null = js.native
  }
  
  @js.native
  trait ElementsCreateOptions extends StObject {
    
    var fonts: js.UndefOr[js.Array[Font]] = js.native
    
    var locale: js.UndefOr[String] = js.native
  }
  object ElementsCreateOptions {
    
    @scala.inline
    def apply(): ElementsCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementsCreateOptions]
    }
    
    @scala.inline
    implicit class ElementsCreateOptionsMutableBuilder[Self <: ElementsCreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFonts(value: js.Array[Font]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      @scala.inline
      def setFontsVarargs(value: Font*): Self = StObject.set(x, "fonts", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  @js.native
  trait ElementsOptions extends StObject {
    
    var classes: js.UndefOr[Base] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var hideIcon: js.UndefOr[Boolean] = js.native
    
    var hidePostalCode: js.UndefOr[Boolean] = js.native
    
    var iconStyle: js.UndefOr[solid | default] = js.native
    
    var paymentRequest: js.UndefOr[StripePaymentRequest] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var placeholderCountry: js.UndefOr[String] = js.native
    
    var showIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[Complete] = js.native
    
    var supportedCountries: js.UndefOr[js.Array[String]] = js.native
    
    var value: js.UndefOr[String | StringDictionary[String]] = js.native
  }
  object ElementsOptions {
    
    @scala.inline
    def apply(): ElementsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementsOptions]
    }
    
    @scala.inline
    implicit class ElementsOptionsMutableBuilder[Self <: ElementsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Base): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHideIcon(value: Boolean): Self = StObject.set(x, "hideIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideIconUndefined: Self = StObject.set(x, "hideIcon", js.undefined)
      
      @scala.inline
      def setHidePostalCode(value: Boolean): Self = StObject.set(x, "hidePostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidePostalCodeUndefined: Self = StObject.set(x, "hidePostalCode", js.undefined)
      
      @scala.inline
      def setIconStyle(value: solid | default): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setPaymentRequest(value: StripePaymentRequest): Self = StObject.set(x, "paymentRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentRequestUndefined: Self = StObject.set(x, "paymentRequest", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderCountry(value: String): Self = StObject.set(x, "placeholderCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderCountryUndefined: Self = StObject.set(x, "placeholderCountry", js.undefined)
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setStyle(value: Complete): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedCountriesUndefined: Self = StObject.set(x, "supportedCountries", js.undefined)
      
      @scala.inline
      def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String | StringDictionary[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Font extends StObject {
    
    var cssSrc: js.UndefOr[String] = js.native
    
    var display: js.UndefOr[String] = js.native
    
    var family: js.UndefOr[String] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[String] = js.native
    
    var unicodeRange: js.UndefOr[String] = js.native
    
    var weight: js.UndefOr[String] = js.native
  }
  object Font {
    
    @scala.inline
    def apply(): Font = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Font]
    }
    
    @scala.inline
    implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssSrc(value: String): Self = StObject.set(x, "cssSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssSrcUndefined: Self = StObject.set(x, "cssSrc", js.undefined)
      
      @scala.inline
      def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      @scala.inline
      def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  @js.native
  trait PaymentRequestButtonStyleOptions extends StObject {
    
    var height: String = js.native
    
    var theme: dark | light | `light-outline` = js.native
    
    var `type`: js.UndefOr[default | donate | buy] = js.native
  }
  object PaymentRequestButtonStyleOptions {
    
    @scala.inline
    def apply(height: String, theme: dark | light | `light-outline`): PaymentRequestButtonStyleOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentRequestButtonStyleOptions]
    }
    
    @scala.inline
    implicit class PaymentRequestButtonStyleOptionsMutableBuilder[Self <: PaymentRequestButtonStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: dark | light | `light-outline`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: default | donate | buy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Style extends StyleOptions {
    
    @JSName(":-webkit-autofill")
    var `Colon-webkit-autofill`: js.UndefOr[StyleOptions] = js.native
    
    @JSName("::-ms-clear")
    var `ColonColon-ms-clear`: js.UndefOr[StyleOptions] = js.native
    
    @JSName("::placeholder")
    var ColonColonplaceholder: js.UndefOr[StyleOptions] = js.native
    
    @JSName("::selection")
    var ColonColonselection: js.UndefOr[StyleOptions] = js.native
    
    @JSName(":disabled")
    var Colondisabled: js.UndefOr[StyleOptions] = js.native
    
    @JSName(":focus")
    var Colonfocus: js.UndefOr[StyleOptions] = js.native
    
    @JSName(":hover")
    var Colonhover: js.UndefOr[StyleOptions] = js.native
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setColon-webkit-autofill`(value: StyleOptions): Self = StObject.set(x, ":-webkit-autofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-webkit-autofillUndefined`: Self = StObject.set(x, ":-webkit-autofill", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-clear`(value: StyleOptions): Self = StObject.set(x, "::-ms-clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-clearUndefined`: Self = StObject.set(x, "::-ms-clear", js.undefined)
      
      @scala.inline
      def setColonColonplaceholder(value: StyleOptions): Self = StObject.set(x, "::placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonplaceholderUndefined: Self = StObject.set(x, "::placeholder", js.undefined)
      
      @scala.inline
      def setColonColonselection(value: StyleOptions): Self = StObject.set(x, "::selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonselectionUndefined: Self = StObject.set(x, "::selection", js.undefined)
      
      @scala.inline
      def setColondisabled(value: StyleOptions): Self = StObject.set(x, ":disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColondisabledUndefined: Self = StObject.set(x, ":disabled", js.undefined)
      
      @scala.inline
      def setColonfocus(value: StyleOptions): Self = StObject.set(x, ":focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonfocusUndefined: Self = StObject.set(x, ":focus", js.undefined)
      
      @scala.inline
      def setColonhover(value: StyleOptions): Self = StObject.set(x, ":hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonhoverUndefined: Self = StObject.set(x, ":hover", js.undefined)
    }
  }
  
  @js.native
  trait StyleOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[String] = js.native
    
    var fontSmoothing: js.UndefOr[String] = js.native
    
    var fontStyle: js.UndefOr[String] = js.native
    
    var fontVariant: js.UndefOr[String] = js.native
    
    var fontWeight: js.UndefOr[String | Double] = js.native
    
    var iconColor: js.UndefOr[String] = js.native
    
    var letterSpacing: js.UndefOr[String] = js.native
    
    var lineHeight: js.UndefOr[String] = js.native
    
    var textAlign: js.UndefOr[String] = js.native
    
    var textDecoration: js.UndefOr[String] = js.native
    
    var textShadow: js.UndefOr[String] = js.native
    
    var textTransform: js.UndefOr[String] = js.native
  }
  object StyleOptions {
    
    @scala.inline
    def apply(): StyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleOptions]
    }
    
    @scala.inline
    implicit class StyleOptionsMutableBuilder[Self <: StyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontSmoothing(value: String): Self = StObject.set(x, "fontSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSmoothingUndefined: Self = StObject.set(x, "fontSmoothing", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      @scala.inline
      def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
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
    
    @scala.inline
    def card: typings.stripeV3.stripeV3Strings.card = "card".asInstanceOf[typings.stripeV3.stripeV3Strings.card]
    
    @scala.inline
    def cardCvc: typings.stripeV3.stripeV3Strings.cardCvc = "cardCvc".asInstanceOf[typings.stripeV3.stripeV3Strings.cardCvc]
    
    @scala.inline
    def cardExpiry: typings.stripeV3.stripeV3Strings.cardExpiry = "cardExpiry".asInstanceOf[typings.stripeV3.stripeV3Strings.cardExpiry]
    
    @scala.inline
    def cardNumber: typings.stripeV3.stripeV3Strings.cardNumber = "cardNumber".asInstanceOf[typings.stripeV3.stripeV3Strings.cardNumber]
    
    @scala.inline
    def iban: typings.stripeV3.stripeV3Strings.iban = "iban".asInstanceOf[typings.stripeV3.stripeV3Strings.iban]
    
    @scala.inline
    def idealBank: typings.stripeV3.stripeV3Strings.idealBank = "idealBank".asInstanceOf[typings.stripeV3.stripeV3Strings.idealBank]
    
    @scala.inline
    def paymentRequestButton: typings.stripeV3.stripeV3Strings.paymentRequestButton = "paymentRequestButton".asInstanceOf[typings.stripeV3.stripeV3Strings.paymentRequestButton]
    
    @scala.inline
    def postalCode: typings.stripeV3.stripeV3Strings.postalCode = "postalCode".asInstanceOf[typings.stripeV3.stripeV3Strings.postalCode]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripeV3.stripeV3Strings.blur
    - typings.stripeV3.stripeV3Strings.change
    - typings.stripeV3.stripeV3Strings.focus
    - typings.stripeV3.stripeV3Strings.ready
  */
  trait eventTypes extends StObject
  object eventTypes {
    
    @scala.inline
    def blur: typings.stripeV3.stripeV3Strings.blur = "blur".asInstanceOf[typings.stripeV3.stripeV3Strings.blur]
    
    @scala.inline
    def change: typings.stripeV3.stripeV3Strings.change = "change".asInstanceOf[typings.stripeV3.stripeV3Strings.change]
    
    @scala.inline
    def focus: typings.stripeV3.stripeV3Strings.focus = "focus".asInstanceOf[typings.stripeV3.stripeV3Strings.focus]
    
    @scala.inline
    def ready: typings.stripeV3.stripeV3Strings.ready = "ready".asInstanceOf[typings.stripeV3.stripeV3Strings.ready]
  }
  
  type handler = js.Function1[/* response */ js.UndefOr[ElementChangeResponse], Unit]
}
