package typings.yandexMetrikaTag

import org.scalablytyped.runtime.StringDictionary
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.addFileExtension
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.extLink
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.file
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.getClientID
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.hit
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.init
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.noindex
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.notBounce
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.params
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.reachGoal
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.replacePhones
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.setUserID
import typings.yandexMetrikaTag.yandexMetrikaTagStrings.userParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ym {
  
  @js.native
  trait Event extends StObject {
    
    def apply(counterId: Double, eventName: addFileExtension, extensions: String): Unit = js.native
    def apply(counterId: Double, eventName: addFileExtension, extensions: js.Array[String]): Unit = js.native
    def apply(counterId: Double, eventName: getClientID, cb: js.Function1[/* clientID */ String, Unit]): Unit = js.native
    /** @deprecated */
    def apply(counterId: Double, eventName: hit, url: String): Unit = js.native
    def apply(counterId: Double, eventName: hit, url: String, title: String): Unit = js.native
    def apply(counterId: Double, eventName: hit, url: String, title: String, referer: String): Unit = js.native
    def apply(
      counterId: Double,
      eventName: hit,
      url: String,
      title: String,
      referer: String,
      params: VisitParameters
    ): Unit = js.native
    def apply(
      counterId: Double,
      eventName: hit,
      url: String,
      title: String,
      referer: Unit,
      params: VisitParameters
    ): Unit = js.native
    def apply(counterId: Double, eventName: hit, url: String, title: Unit, referer: String): Unit = js.native
    def apply(
      counterId: Double,
      eventName: hit,
      url: String,
      title: Unit,
      referer: String,
      params: VisitParameters
    ): Unit = js.native
    def apply(
      counterId: Double,
      eventName: hit,
      url: String,
      title: Unit,
      referer: Unit,
      params: VisitParameters
    ): Unit = js.native
    def apply(counterId: Double, eventName: init, parameters: InitParameters): Unit = js.native
    def apply(counterId: Double, eventName: params, parameters: js.Array[VisitParameters]): Unit = js.native
    def apply(counterId: Double, eventName: params, parameters: VisitParameters): Unit = js.native
    def apply(counterId: Double, eventName: replacePhones): Unit = js.native
    def apply(counterId: Double, eventName: setUserID, userID: String): Unit = js.native
    def apply(counterId: Double, eventName: userParams, parameters: UserParameters): Unit = js.native
    // tslint:disable-next-line no-unnecessary-generics
    def apply[CTX](counterId: Double, eventName: extLink, url: String): Unit = js.native
    def apply[CTX](counterId: Double, eventName: extLink, url: String, options: ExtLinkOptions[CTX]): Unit = js.native
    // tslint:disable-next-line no-unnecessary-generics
    def apply[CTX](counterId: Double, eventName: file, url: String): Unit = js.native
    def apply[CTX](counterId: Double, eventName: file, url: String, options: FileOptions[CTX]): Unit = js.native
    def apply[CTX](counterId: Double, eventName: hit, url: String, options: HitOptions[CTX]): Unit = js.native
    // tslint:disable-next-line no-unnecessary-generics
    def apply[CTX](counterId: Double, eventName: notBounce): Unit = js.native
    def apply[CTX](counterId: Double, eventName: notBounce, options: NotBounceOptions[CTX]): Unit = js.native
    def apply[CTX](counterId: Double, eventName: reachGoal, target: String): Unit = js.native
    def apply[CTX](
      counterId: Double,
      eventName: reachGoal,
      target: String,
      params: Unit,
      callback: js.ThisFunction0[/* this */ CTX, Unit]
    ): Unit = js.native
    def apply[CTX](
      counterId: Double,
      eventName: reachGoal,
      target: String,
      params: Unit,
      callback: js.ThisFunction0[/* this */ CTX, Unit],
      ctx: CTX
    ): Unit = js.native
    def apply[CTX](counterId: Double, eventName: reachGoal, target: String, params: Unit, callback: Unit, ctx: CTX): Unit = js.native
    def apply[CTX](counterId: Double, eventName: reachGoal, target: String, params: VisitParameters): Unit = js.native
    def apply[CTX](
      counterId: Double,
      eventName: reachGoal,
      target: String,
      params: VisitParameters,
      callback: js.ThisFunction0[/* this */ CTX, Unit]
    ): Unit = js.native
    def apply[CTX](
      counterId: Double,
      eventName: reachGoal,
      target: String,
      params: VisitParameters,
      callback: js.ThisFunction0[/* this */ CTX, Unit],
      ctx: CTX
    ): Unit = js.native
    def apply[CTX](
      counterId: Double,
      eventName: reachGoal,
      target: String,
      params: VisitParameters,
      callback: Unit,
      ctx: CTX
    ): Unit = js.native
  }
  
  trait ExtLinkOptions[CTX] extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction0[/* this */ CTX, Unit]] = js.undefined
    
    var ctx: js.UndefOr[CTX] = js.undefined
    
    var params: js.UndefOr[VisitParameters] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ExtLinkOptions {
    
    @scala.inline
    def apply[CTX](): ExtLinkOptions[CTX] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtLinkOptions[CTX]]
    }
    
    @scala.inline
    implicit class ExtLinkOptionsMutableBuilder[Self <: ExtLinkOptions[?], CTX] (val x: Self & ExtLinkOptions[CTX]) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.ThisFunction0[/* this */ CTX, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCtx(value: CTX): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
      
      @scala.inline
      def setParams(value: VisitParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait FileOptions[CTX] extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction0[/* this */ CTX, Unit]] = js.undefined
    
    var ctx: js.UndefOr[CTX] = js.undefined
    
    var params: js.UndefOr[VisitParameters] = js.undefined
    
    var referer: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object FileOptions {
    
    @scala.inline
    def apply[CTX](): FileOptions[CTX] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions[CTX]]
    }
    
    @scala.inline
    implicit class FileOptionsMutableBuilder[Self <: FileOptions[?], CTX] (val x: Self & FileOptions[CTX]) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.ThisFunction0[/* this */ CTX, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCtx(value: CTX): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
      
      @scala.inline
      def setParams(value: VisitParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait HitOptions[CTX] extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction0[/* this */ CTX, Unit]] = js.undefined
    
    var ctx: js.UndefOr[CTX] = js.undefined
    
    var params: js.UndefOr[VisitParameters] = js.undefined
    
    var referer: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object HitOptions {
    
    @scala.inline
    def apply[CTX](): HitOptions[CTX] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HitOptions[CTX]]
    }
    
    @scala.inline
    implicit class HitOptionsMutableBuilder[Self <: HitOptions[?], CTX] (val x: Self & HitOptions[CTX]) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.ThisFunction0[/* this */ CTX, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCtx(value: CTX): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
      
      @scala.inline
      def setParams(value: VisitParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait InitParameters extends StObject {
    
    var accurateTrackBounce: js.UndefOr[Boolean | Double] = js.undefined
    
    var childIframe: js.UndefOr[Boolean] = js.undefined
    
    var clickmap: js.UndefOr[Boolean] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var ecommerce: js.UndefOr[Boolean | String | js.Array[js.Any]] = js.undefined
    
    var params: js.UndefOr[VisitParameters | js.Array[VisitParameters]] = js.undefined
    
    var trackHash: js.UndefOr[Boolean] = js.undefined
    
    var trackLinks: js.UndefOr[Boolean] = js.undefined
    
    var triggerEvent: js.UndefOr[Boolean] = js.undefined
    
    var trustedDomains: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: js.UndefOr[Double] = js.undefined
    
    var userParams: js.UndefOr[UserParameters] = js.undefined
    
    var ut: js.UndefOr[noindex] = js.undefined
    
    var webvisor: js.UndefOr[Boolean] = js.undefined
  }
  object InitParameters {
    
    @scala.inline
    def apply(): InitParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitParameters]
    }
    
    @scala.inline
    implicit class InitParametersMutableBuilder[Self <: InitParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccurateTrackBounce(value: Boolean | Double): Self = StObject.set(x, "accurateTrackBounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccurateTrackBounceUndefined: Self = StObject.set(x, "accurateTrackBounce", js.undefined)
      
      @scala.inline
      def setChildIframe(value: Boolean): Self = StObject.set(x, "childIframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildIframeUndefined: Self = StObject.set(x, "childIframe", js.undefined)
      
      @scala.inline
      def setClickmap(value: Boolean): Self = StObject.set(x, "clickmap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickmapUndefined: Self = StObject.set(x, "clickmap", js.undefined)
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setEcommerce(value: Boolean | String | js.Array[js.Any]): Self = StObject.set(x, "ecommerce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcommerceUndefined: Self = StObject.set(x, "ecommerce", js.undefined)
      
      @scala.inline
      def setEcommerceVarargs(value: js.Any*): Self = StObject.set(x, "ecommerce", js.Array(value :_*))
      
      @scala.inline
      def setParams(value: VisitParameters | js.Array[VisitParameters]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: VisitParameters*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setTrackHash(value: Boolean): Self = StObject.set(x, "trackHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackHashUndefined: Self = StObject.set(x, "trackHash", js.undefined)
      
      @scala.inline
      def setTrackLinks(value: Boolean): Self = StObject.set(x, "trackLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackLinksUndefined: Self = StObject.set(x, "trackLinks", js.undefined)
      
      @scala.inline
      def setTriggerEvent(value: Boolean): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
      
      @scala.inline
      def setTrustedDomains(value: js.Array[String]): Self = StObject.set(x, "trustedDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustedDomainsUndefined: Self = StObject.set(x, "trustedDomains", js.undefined)
      
      @scala.inline
      def setTrustedDomainsVarargs(value: String*): Self = StObject.set(x, "trustedDomains", js.Array(value :_*))
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUserParams(value: UserParameters): Self = StObject.set(x, "userParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserParamsUndefined: Self = StObject.set(x, "userParams", js.undefined)
      
      @scala.inline
      def setUt(value: noindex): Self = StObject.set(x, "ut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtUndefined: Self = StObject.set(x, "ut", js.undefined)
      
      @scala.inline
      def setWebvisor(value: Boolean): Self = StObject.set(x, "webvisor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebvisorUndefined: Self = StObject.set(x, "webvisor", js.undefined)
    }
  }
  
  trait NotBounceOptions[CTX] extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction0[/* this */ CTX, Unit]] = js.undefined
    
    var ctx: js.UndefOr[CTX] = js.undefined
  }
  object NotBounceOptions {
    
    @scala.inline
    def apply[CTX](): NotBounceOptions[CTX] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotBounceOptions[CTX]]
    }
    
    @scala.inline
    implicit class NotBounceOptionsMutableBuilder[Self <: NotBounceOptions[?], CTX] (val x: Self & NotBounceOptions[CTX]) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.ThisFunction0[/* this */ CTX, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCtx(value: CTX): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
    }
  }
  
  trait UserParameters
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var UserID: js.UndefOr[Double] = js.undefined
  }
  object UserParameters {
    
    @scala.inline
    def apply(): UserParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserParameters]
    }
    
    @scala.inline
    implicit class UserParametersMutableBuilder[Self <: UserParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserID(value: Double): Self = StObject.set(x, "UserID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIDUndefined: Self = StObject.set(x, "UserID", js.undefined)
    }
  }
  
  trait VisitParameters
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var currency: js.UndefOr[String] = js.undefined
    
    var order_price: js.UndefOr[Double] = js.undefined
  }
  object VisitParameters {
    
    @scala.inline
    def apply(): VisitParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisitParameters]
    }
    
    @scala.inline
    implicit class VisitParametersMutableBuilder[Self <: VisitParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setOrder_price(value: Double): Self = StObject.set(x, "order_price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder_priceUndefined: Self = StObject.set(x, "order_price", js.undefined)
    }
  }
}
