package typings.trezorConnect

import typings.trezorConnect.anon.Code
import typings.trezorConnect.anon.Host
import typings.trezorConnect.anon.Instance
import typings.trezorConnect.trezorConnectBooleans.`false`
import typings.trezorConnect.trezorConnectBooleans.`true`
import typings.trezorConnect.trezorConnectStrings.`react-native`
import typings.trezorConnect.trezorConnectStrings.electron
import typings.trezorConnect.trezorConnectStrings.node
import typings.trezorConnect.trezorConnectStrings.web
import typings.trezorConnect.trezorConnectStrings.webextension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paramsMod {
  
  trait Bundle[T] extends StObject {
    
    var bundle: js.Array[T]
  }
  object Bundle {
    
    inline def apply[T](bundle: js.Array[T]): Bundle[T] = {
      val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bundle[T]]
    }
    
    extension [Self <: Bundle[?], T](x: Self & Bundle[T]) {
      
      inline def setBundle(value: js.Array[T]): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
      
      inline def setBundleVarargs(value: T*): Self = StObject.set(x, "bundle", js.Array(value*))
    }
  }
  
  type BundledResponse[T] = js.Promise[Success[js.Array[T]] | Unsuccessful]
  
  trait CommonParams extends StObject {
    
    var allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined
    
    var device: js.UndefOr[Instance] = js.undefined
    
    var keepSession: js.UndefOr[Boolean] = js.undefined
    
    var skipFinalReload: js.UndefOr[Boolean] = js.undefined
    
    var useCardanoDerivation: js.UndefOr[Boolean] = js.undefined
    
    var useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  }
  object CommonParams {
    
    inline def apply(): CommonParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonParams]
    }
    
    extension [Self <: CommonParams](x: Self) {
      
      inline def setAllowSeedlessDevice(value: Boolean): Self = StObject.set(x, "allowSeedlessDevice", value.asInstanceOf[js.Any])
      
      inline def setAllowSeedlessDeviceUndefined: Self = StObject.set(x, "allowSeedlessDevice", js.undefined)
      
      inline def setDevice(value: Instance): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setKeepSession(value: Boolean): Self = StObject.set(x, "keepSession", value.asInstanceOf[js.Any])
      
      inline def setKeepSessionUndefined: Self = StObject.set(x, "keepSession", js.undefined)
      
      inline def setSkipFinalReload(value: Boolean): Self = StObject.set(x, "skipFinalReload", value.asInstanceOf[js.Any])
      
      inline def setSkipFinalReloadUndefined: Self = StObject.set(x, "skipFinalReload", js.undefined)
      
      inline def setUseCardanoDerivation(value: Boolean): Self = StObject.set(x, "useCardanoDerivation", value.asInstanceOf[js.Any])
      
      inline def setUseCardanoDerivationUndefined: Self = StObject.set(x, "useCardanoDerivation", js.undefined)
      
      inline def setUseEmptyPassphrase(value: Boolean): Self = StObject.set(x, "useEmptyPassphrase", value.asInstanceOf[js.Any])
      
      inline def setUseEmptyPassphraseUndefined: Self = StObject.set(x, "useEmptyPassphrase", js.undefined)
    }
  }
  
  trait ConnectSettings extends StObject {
    
    var configSrc: String
    
    var connectSrc: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var env: node | web | webextension | electron | `react-native`
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var hostIcon: js.UndefOr[String] = js.undefined
    
    var hostLabel: js.UndefOr[String] = js.undefined
    
    var iframeSrc: String
    
    var interactionTimeout: js.UndefOr[Double] = js.undefined
    
    var lazyLoad: js.UndefOr[Boolean] = js.undefined
    
    var manifest: js.UndefOr[Manifest] = js.undefined
    
    // internal part, not to be accepted from .init()
    var origin: js.UndefOr[String] = js.undefined
    
    var pendingTransportEvent: js.UndefOr[Boolean] = js.undefined
    
    var popup: js.UndefOr[Boolean] = js.undefined
    
    var popupSrc: String
    
    var priority: Double
    
    var proxy: js.UndefOr[Proxy] = js.undefined
    
    var supportedBrowser: js.UndefOr[Boolean] = js.undefined
    
    var timestamp: Double
    
    var transportReconnect: js.UndefOr[Boolean] = js.undefined
    
    var trustedHost: Boolean
    
    var useOnionLinks: js.UndefOr[Boolean] = js.undefined
    
    var version: String
    
    var webusb: js.UndefOr[Boolean] = js.undefined
    
    var webusbSrc: String
  }
  object ConnectSettings {
    
    inline def apply(
      configSrc: String,
      env: node | web | webextension | electron | `react-native`,
      iframeSrc: String,
      popupSrc: String,
      priority: Double,
      timestamp: Double,
      trustedHost: Boolean,
      version: String,
      webusbSrc: String
    ): ConnectSettings = {
      val __obj = js.Dynamic.literal(configSrc = configSrc.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], iframeSrc = iframeSrc.asInstanceOf[js.Any], popupSrc = popupSrc.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trustedHost = trustedHost.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webusbSrc = webusbSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectSettings]
    }
    
    extension [Self <: ConnectSettings](x: Self) {
      
      inline def setConfigSrc(value: String): Self = StObject.set(x, "configSrc", value.asInstanceOf[js.Any])
      
      inline def setConnectSrc(value: String): Self = StObject.set(x, "connectSrc", value.asInstanceOf[js.Any])
      
      inline def setConnectSrcUndefined: Self = StObject.set(x, "connectSrc", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEnv(value: node | web | webextension | electron | `react-native`): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setHostIcon(value: String): Self = StObject.set(x, "hostIcon", value.asInstanceOf[js.Any])
      
      inline def setHostIconUndefined: Self = StObject.set(x, "hostIcon", js.undefined)
      
      inline def setHostLabel(value: String): Self = StObject.set(x, "hostLabel", value.asInstanceOf[js.Any])
      
      inline def setHostLabelUndefined: Self = StObject.set(x, "hostLabel", js.undefined)
      
      inline def setIframeSrc(value: String): Self = StObject.set(x, "iframeSrc", value.asInstanceOf[js.Any])
      
      inline def setInteractionTimeout(value: Double): Self = StObject.set(x, "interactionTimeout", value.asInstanceOf[js.Any])
      
      inline def setInteractionTimeoutUndefined: Self = StObject.set(x, "interactionTimeout", js.undefined)
      
      inline def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      inline def setManifest(value: Manifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPendingTransportEvent(value: Boolean): Self = StObject.set(x, "pendingTransportEvent", value.asInstanceOf[js.Any])
      
      inline def setPendingTransportEventUndefined: Self = StObject.set(x, "pendingTransportEvent", js.undefined)
      
      inline def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupSrc(value: String): Self = StObject.set(x, "popupSrc", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setSupportedBrowser(value: Boolean): Self = StObject.set(x, "supportedBrowser", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowserUndefined: Self = StObject.set(x, "supportedBrowser", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTransportReconnect(value: Boolean): Self = StObject.set(x, "transportReconnect", value.asInstanceOf[js.Any])
      
      inline def setTransportReconnectUndefined: Self = StObject.set(x, "transportReconnect", js.undefined)
      
      inline def setTrustedHost(value: Boolean): Self = StObject.set(x, "trustedHost", value.asInstanceOf[js.Any])
      
      inline def setUseOnionLinks(value: Boolean): Self = StObject.set(x, "useOnionLinks", value.asInstanceOf[js.Any])
      
      inline def setUseOnionLinksUndefined: Self = StObject.set(x, "useOnionLinks", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWebusb(value: Boolean): Self = StObject.set(x, "webusb", value.asInstanceOf[js.Any])
      
      inline def setWebusbSrc(value: String): Self = StObject.set(x, "webusbSrc", value.asInstanceOf[js.Any])
      
      inline def setWebusbUndefined: Self = StObject.set(x, "webusb", js.undefined)
    }
  }
  
  trait DefaultMessage extends StObject {
    
    var message: String
  }
  object DefaultMessage {
    
    inline def apply(message: String): DefaultMessage = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultMessage]
    }
    
    extension [Self <: DefaultMessage](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Manifest extends StObject {
    
    var appUrl: String
    
    var email: String
  }
  object Manifest {
    
    inline def apply(appUrl: String, email: String): Manifest = {
      val __obj = js.Dynamic.literal(appUrl = appUrl.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest]
    }
    
    extension [Self <: Manifest](x: Self) {
      
      inline def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  type Proxy = String | Host
  
  type Response[T] = js.Promise[Success[T] | Unsuccessful]
  
  trait Success[T] extends StObject {
    
    var id: Double
    
    var payload: T
    
    var success: `true`
  }
  object Success {
    
    inline def apply[T](id: Double, payload: T): Success[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], success = true)
      __obj.asInstanceOf[Success[T]]
    }
    
    extension [Self <: Success[?], T](x: Self & Success[T]) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unsuccessful extends StObject {
    
    var payload: Code
    
    var success: `false`
  }
  object Unsuccessful {
    
    inline def apply(payload: Code): Unsuccessful = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = false)
      __obj.asInstanceOf[Unsuccessful]
    }
    
    extension [Self <: Unsuccessful](x: Self) {
      
      inline def setPayload(value: Code): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
