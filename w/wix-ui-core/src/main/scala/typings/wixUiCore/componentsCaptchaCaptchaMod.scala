package typings.wixUiCore

import typings.react.mod.PureComponent
import typings.wixUiCore.anon.Rendered
import typings.wixUiCore.componentsCaptchaTypesMod.CaptchaLang
import typings.wixUiCore.componentsCaptchaTypesMod.CaptchaType
import typings.wixUiCore.componentsCaptchaTypesMod.Size
import typings.wixUiCore.componentsCaptchaTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCaptchaCaptchaMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/captcha/Captcha", "Captcha")
  @js.native
  class Captcha protected ()
    extends PureComponent[CaptchaProps, CaptchaState, js.Any] {
    def this(props: CaptchaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CaptchaProps, context: js.Any) = this()
    
    var captchaRef: js.Any = js.native
    
    /**
      * returns the verification token to the caller
      */
    def getVerificationToken(): js.Any = js.native
    
    /**
      * return true if the captcha challenge has been successfully taken
      */
    def isVerified(): Boolean = js.native
    
    /**
      * this method will pass the error to the registered error call back.
      */
    val onError: js.Any = js.native
    
    /**
      * The user has taken the captcha challange however it has not been verified the page was not submitted in time
      * so we need to ask the user to retake the captcha challenge.
      */
    val onExpired: js.Any = js.native
    
    /**
      * this will indicate the google component is loaded and ready to be displayed
      */
    val onLoad: js.Any = js.native
    
    /**
      * triggered when the inner captcha is actually rendered
      */
    val onRender: js.Any = js.native
    
    /**
      * the user has successfully taken the captcha and we have the verification id
      * @param verificationString
      */
    val onVerified: js.Any = js.native
    
    /**
      * reload a new captcha from google
      */
    def resetCaptcha(): Unit = js.native
    
    @JSName("state")
    var state_Captcha: Rendered = js.native
  }
  /* static members */
  object Captcha {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/captcha/Captcha", "Captcha")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/captcha/Captcha", "Captcha.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait CaptchaProps extends StObject {
    
    var captchaType: js.UndefOr[CaptchaType] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[CaptchaLang] = js.undefined
    
    var loader: js.Any
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExpire: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVerify: js.UndefOr[js.Function1[/* token */ String, Unit]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var sitekey: String
    
    var size: js.UndefOr[Size] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object CaptchaProps {
    
    @scala.inline
    def apply(loader: js.Any, sitekey: String): CaptchaProps = {
      val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptchaProps]
    }
    
    @scala.inline
    implicit class CaptchaPropsMutableBuilder[Self <: CaptchaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptchaType(value: CaptchaType): Self = StObject.set(x, "captchaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptchaTypeUndefined: Self = StObject.set(x, "captchaType", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setLang(value: CaptchaLang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLoader(value: js.Any): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnExpire(value: () => Unit): Self = StObject.set(x, "onExpire", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      @scala.inline
      def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      @scala.inline
      def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnVerify(value: /* token */ String => Unit): Self = StObject.set(x, "onVerify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVerifyUndefined: Self = StObject.set(x, "onVerify", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait CaptchaState extends StObject {
    
    var rendered: Boolean
    
    var token: String
  }
  object CaptchaState {
    
    @scala.inline
    def apply(rendered: Boolean, token: String): CaptchaState = {
      val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptchaState]
    }
    
    @scala.inline
    implicit class CaptchaStateMutableBuilder[Self <: CaptchaState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
