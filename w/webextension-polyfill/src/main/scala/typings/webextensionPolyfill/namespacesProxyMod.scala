package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesTypesMod.Types.Setting
import typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest.HttpHeaders
import typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest.HttpHeadersItemType
import typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest.RequestFilter
import typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest.ResourceType
import typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest.UrlClassification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesProxyMod {
  
  object Proxy {
    
    type OnErrorErrorType = StringDictionary[Any]
    
    trait OnRequestDetailsType extends StObject {
      
      /**
        * The cookie store ID of the contextual identity.
        * Optional.
        */
      var cookieStoreId: js.UndefOr[String] = js.undefined
      
      /**
        * URL of the page into which the requested resource will be loaded.
        * Optional.
        */
      var documentUrl: js.UndefOr[String] = js.undefined
      
      /**
        * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a subframe in
        * which the request happens. If the document of a (sub-)frame is loaded (<code>type</code> is <code>main_frame</code>
        * or <code>sub_frame</code>), <code>frameId</code> indicates the ID of this frame, not the ID of the outer frame.
        * Frame IDs are unique within a tab.
        */
      var frameId: Double
      
      /**
        * Indicates if this response was fetched from disk cache.
        */
      var fromCache: Boolean
      
      /**
        * True for private browsing requests.
        * Optional.
        */
      var incognito: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Standard HTTP method.
        */
      var method: String
      
      /**
        * URL of the resource that triggered this request.
        * Optional.
        */
      var originUrl: js.UndefOr[String] = js.undefined
      
      /**
        * ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists.
        */
      var parentFrameId: Double
      
      /**
        * The HTTP request headers that are going to be sent out with this request.
        * Optional.
        */
      var requestHeaders: js.UndefOr[HttpHeaders] = js.undefined
      
      /**
        * The ID of the request. Request IDs are unique within a browser session. As a result,
        * they could be used to relate different events of the same request.
        */
      var requestId: String
      
      /**
        * The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab.
        */
      var tabId: Double
      
      /**
        * Indicates if this request and its content window hierarchy is third party.
        */
      var thirdParty: Boolean
      
      /**
        * The time when this signal is triggered, in milliseconds since the epoch.
        */
      var timeStamp: Double
      
      /**
        * How the requested resource will be used.
        */
      var `type`: ResourceType
      
      var url: String
      
      /**
        * Url classification if the request has been classified.
        */
      var urlClassification: UrlClassification
    }
    object OnRequestDetailsType {
      
      inline def apply(
        frameId: Double,
        fromCache: Boolean,
        method: String,
        parentFrameId: Double,
        requestId: String,
        tabId: Double,
        thirdParty: Boolean,
        timeStamp: Double,
        `type`: ResourceType,
        url: String,
        urlClassification: UrlClassification
      ): OnRequestDetailsType = {
        val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlClassification = urlClassification.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnRequestDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OnRequestDetailsType] (val x: Self) extends AnyVal {
        
        inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
        
        inline def setDocumentUrl(value: String): Self = StObject.set(x, "documentUrl", value.asInstanceOf[js.Any])
        
        inline def setDocumentUrlUndefined: Self = StObject.set(x, "documentUrl", js.undefined)
        
        inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
        
        inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
        
        inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
        
        inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setOriginUrl(value: String): Self = StObject.set(x, "originUrl", value.asInstanceOf[js.Any])
        
        inline def setOriginUrlUndefined: Self = StObject.set(x, "originUrl", js.undefined)
        
        inline def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
        
        inline def setRequestHeaders(value: HttpHeaders): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
        
        inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
        
        inline def setRequestHeadersVarargs(value: HttpHeadersItemType*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
        
        inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setThirdParty(value: Boolean): Self = StObject.set(x, "thirdParty", value.asInstanceOf[js.Any])
        
        inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
        
        inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlClassification(value: UrlClassification): Self = StObject.set(x, "urlClassification", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An object which describes proxy settings.
      */
    trait ProxyConfig extends StObject {
      
      /**
        * A URL to use to configure the proxy.
        * Optional.
        */
      var autoConfigUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Do not prompt for authentication if password is saved.
        * Optional.
        */
      var autoLogin: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The address of the http proxy, can include a port.
        * Optional.
        */
      var http: js.UndefOr[String] = js.undefined
      
      /**
        * Use the http proxy server for all protocols.
        * Optional.
        */
      var httpProxyAll: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A list of hosts which should not be proxied.
        * Optional.
        */
      var passthrough: js.UndefOr[String] = js.undefined
      
      /**
        * Proxy DNS when using SOCKS v5.
        * Optional.
        */
      var proxyDNS: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The type of proxy to use.
        * Optional.
        */
      var proxyType: js.UndefOr[ProxyConfigProxyTypeEnum] = js.undefined
      
      /**
        * If true (the default value), do not use newer TLS protocol features that might have interoperability problems on the
        * Internet. This is intended only for use with critical infrastructure like the updates,
        * and is only available to privileged addons.
        * Optional.
        */
      var respectBeConservative: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The address of the socks proxy, can include a port.
        * Optional.
        */
      var socks: js.UndefOr[String] = js.undefined
      
      /**
        * The version of the socks proxy.
        * Optional.
        */
      var socksVersion: js.UndefOr[Double] = js.undefined
      
      /**
        * The address of the ssl proxy, can include a port.
        * Optional.
        */
      var ssl: js.UndefOr[String] = js.undefined
    }
    object ProxyConfig {
      
      inline def apply(): ProxyConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProxyConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ProxyConfig] (val x: Self) extends AnyVal {
        
        inline def setAutoConfigUrl(value: String): Self = StObject.set(x, "autoConfigUrl", value.asInstanceOf[js.Any])
        
        inline def setAutoConfigUrlUndefined: Self = StObject.set(x, "autoConfigUrl", js.undefined)
        
        inline def setAutoLogin(value: Boolean): Self = StObject.set(x, "autoLogin", value.asInstanceOf[js.Any])
        
        inline def setAutoLoginUndefined: Self = StObject.set(x, "autoLogin", js.undefined)
        
        inline def setHttp(value: String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        inline def setHttpProxyAll(value: Boolean): Self = StObject.set(x, "httpProxyAll", value.asInstanceOf[js.Any])
        
        inline def setHttpProxyAllUndefined: Self = StObject.set(x, "httpProxyAll", js.undefined)
        
        inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
        
        inline def setPassthrough(value: String): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
        
        inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
        
        inline def setProxyDNS(value: Boolean): Self = StObject.set(x, "proxyDNS", value.asInstanceOf[js.Any])
        
        inline def setProxyDNSUndefined: Self = StObject.set(x, "proxyDNS", js.undefined)
        
        inline def setProxyType(value: ProxyConfigProxyTypeEnum): Self = StObject.set(x, "proxyType", value.asInstanceOf[js.Any])
        
        inline def setProxyTypeUndefined: Self = StObject.set(x, "proxyType", js.undefined)
        
        inline def setRespectBeConservative(value: Boolean): Self = StObject.set(x, "respectBeConservative", value.asInstanceOf[js.Any])
        
        inline def setRespectBeConservativeUndefined: Self = StObject.set(x, "respectBeConservative", js.undefined)
        
        inline def setSocks(value: String): Self = StObject.set(x, "socks", value.asInstanceOf[js.Any])
        
        inline def setSocksUndefined: Self = StObject.set(x, "socks", js.undefined)
        
        inline def setSocksVersion(value: Double): Self = StObject.set(x, "socksVersion", value.asInstanceOf[js.Any])
        
        inline def setSocksVersionUndefined: Self = StObject.set(x, "socksVersion", js.undefined)
        
        inline def setSsl(value: String): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
        
        inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      }
    }
    
    /**
      * The type of proxy to use.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.none
      - typings.webextensionPolyfill.webextensionPolyfillStrings.autoDetect
      - typings.webextensionPolyfill.webextensionPolyfillStrings.system
      - typings.webextensionPolyfill.webextensionPolyfillStrings.manual
      - typings.webextensionPolyfill.webextensionPolyfillStrings.autoConfig
    */
    trait ProxyConfigProxyTypeEnum extends StObject
    object ProxyConfigProxyTypeEnum {
      
      inline def autoConfig: typings.webextensionPolyfill.webextensionPolyfillStrings.autoConfig = "autoConfig".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.autoConfig]
      
      inline def autoDetect: typings.webextensionPolyfill.webextensionPolyfillStrings.autoDetect = "autoDetect".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.autoDetect]
      
      inline def manual: typings.webextensionPolyfill.webextensionPolyfillStrings.manual = "manual".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.manual]
      
      inline def none: typings.webextensionPolyfill.webextensionPolyfillStrings.none = "none".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.none]
      
      inline def system: typings.webextensionPolyfill.webextensionPolyfillStrings.system = "system".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.system]
    }
    
    trait Static extends StObject {
      
      /**
        * Notifies about errors caused by the invalid use of the proxy API.
        *
        * @param error
        */
      var onError: Event[js.Function1[/* error */ OnErrorErrorType, Unit]]
      
      /**
        * Fired when proxy data is needed for a request.
        */
      var onRequest: onRequestEvent
      
      /**
        * Configures proxy settings. This setting's value is an object of type ProxyConfig.
        */
      var settings: Setting
    }
    object Static {
      
      inline def apply(
        onError: Event[js.Function1[/* error */ OnErrorErrorType, Unit]],
        onRequest: onRequestEvent,
        settings: Setting
      ): Static = {
        val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onRequest = onRequest.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setOnError(value: Event[js.Function1[/* error */ OnErrorErrorType, Unit]]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
        
        inline def setOnRequest(value: onRequestEvent): Self = StObject.set(x, "onRequest", value.asInstanceOf[js.Any])
        
        inline def setSettings(value: Setting): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Fired when proxy data is needed for a request.
      */
    @js.native
    trait onRequestEvent
      extends StObject
         with Event[js.Function1[/* details */ OnRequestDetailsType, Unit]] {
      
      /**
        * Registers an event listener <em>callback</em> to an event.
        *
        * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
        * @param filter A set of filters that restricts the events that will be sent to this listener.
        * @param extraInfoSpec Optional. Array of extra information that should be passed to the listener function.
        */
      def addListener(callback: js.Function1[/* details */ OnRequestDetailsType, Unit], filter: RequestFilter): Unit = js.native
      def addListener(
        callback: js.Function1[/* details */ OnRequestDetailsType, Unit],
        filter: RequestFilter,
        extraInfoSpec: js.Array[String]
      ): Unit = js.native
    }
  }
}
