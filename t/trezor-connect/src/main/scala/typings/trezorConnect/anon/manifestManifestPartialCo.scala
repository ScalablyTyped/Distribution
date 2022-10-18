package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptParamsMod.Manifest
import typings.trezorConnect.libTypescriptParamsMod.Proxy
import typings.trezorConnect.trezorConnectStrings.`react-native`
import typings.trezorConnect.trezorConnectStrings.electron
import typings.trezorConnect.trezorConnectStrings.node
import typings.trezorConnect.trezorConnectStrings.web
import typings.trezorConnect.trezorConnectStrings.webextension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  manifest :trezor-connect.trezor-connect/lib/typescript/params.Manifest} & std.Partial<trezor-connect.trezor-connect/lib/typescript/params.ConnectSettings> */
trait manifestManifestPartialCo extends StObject {
  
  var configSrc: js.UndefOr[String] = js.undefined
  
  var connectSrc: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[node | web | webextension | electron | `react-native`] = js.undefined
  
  var `extension`: js.UndefOr[String] = js.undefined
  
  var hostIcon: js.UndefOr[String] = js.undefined
  
  var hostLabel: js.UndefOr[String] = js.undefined
  
  var iframeSrc: js.UndefOr[String] = js.undefined
  
  var interactionTimeout: js.UndefOr[Double] = js.undefined
  
  var lazyLoad: js.UndefOr[Boolean] = js.undefined
  
  var manifest: Manifest & js.UndefOr[Manifest]
  
  var origin: js.UndefOr[String] = js.undefined
  
  var pendingTransportEvent: js.UndefOr[Boolean] = js.undefined
  
  var popup: js.UndefOr[Boolean] = js.undefined
  
  var popupSrc: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var proxy: js.UndefOr[Proxy] = js.undefined
  
  var supportedBrowser: js.UndefOr[Boolean] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var transportReconnect: js.UndefOr[Boolean] = js.undefined
  
  var trustedHost: js.UndefOr[Boolean] = js.undefined
  
  var useOnionLinks: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var webusb: js.UndefOr[Boolean] = js.undefined
  
  var webusbSrc: js.UndefOr[String] = js.undefined
}
object manifestManifestPartialCo {
  
  inline def apply(manifest: Manifest & js.UndefOr[Manifest]): manifestManifestPartialCo = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[manifestManifestPartialCo]
  }
  
  extension [Self <: manifestManifestPartialCo](x: Self) {
    
    inline def setConfigSrc(value: String): Self = StObject.set(x, "configSrc", value.asInstanceOf[js.Any])
    
    inline def setConfigSrcUndefined: Self = StObject.set(x, "configSrc", js.undefined)
    
    inline def setConnectSrc(value: String): Self = StObject.set(x, "connectSrc", value.asInstanceOf[js.Any])
    
    inline def setConnectSrcUndefined: Self = StObject.set(x, "connectSrc", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setEnv(value: node | web | webextension | electron | `react-native`): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setHostIcon(value: String): Self = StObject.set(x, "hostIcon", value.asInstanceOf[js.Any])
    
    inline def setHostIconUndefined: Self = StObject.set(x, "hostIcon", js.undefined)
    
    inline def setHostLabel(value: String): Self = StObject.set(x, "hostLabel", value.asInstanceOf[js.Any])
    
    inline def setHostLabelUndefined: Self = StObject.set(x, "hostLabel", js.undefined)
    
    inline def setIframeSrc(value: String): Self = StObject.set(x, "iframeSrc", value.asInstanceOf[js.Any])
    
    inline def setIframeSrcUndefined: Self = StObject.set(x, "iframeSrc", js.undefined)
    
    inline def setInteractionTimeout(value: Double): Self = StObject.set(x, "interactionTimeout", value.asInstanceOf[js.Any])
    
    inline def setInteractionTimeoutUndefined: Self = StObject.set(x, "interactionTimeout", js.undefined)
    
    inline def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
    
    inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
    
    inline def setManifest(value: Manifest & js.UndefOr[Manifest]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPendingTransportEvent(value: Boolean): Self = StObject.set(x, "pendingTransportEvent", value.asInstanceOf[js.Any])
    
    inline def setPendingTransportEventUndefined: Self = StObject.set(x, "pendingTransportEvent", js.undefined)
    
    inline def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupSrc(value: String): Self = StObject.set(x, "popupSrc", value.asInstanceOf[js.Any])
    
    inline def setPopupSrcUndefined: Self = StObject.set(x, "popupSrc", js.undefined)
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProxy(value: Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setSupportedBrowser(value: Boolean): Self = StObject.set(x, "supportedBrowser", value.asInstanceOf[js.Any])
    
    inline def setSupportedBrowserUndefined: Self = StObject.set(x, "supportedBrowser", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTransportReconnect(value: Boolean): Self = StObject.set(x, "transportReconnect", value.asInstanceOf[js.Any])
    
    inline def setTransportReconnectUndefined: Self = StObject.set(x, "transportReconnect", js.undefined)
    
    inline def setTrustedHost(value: Boolean): Self = StObject.set(x, "trustedHost", value.asInstanceOf[js.Any])
    
    inline def setTrustedHostUndefined: Self = StObject.set(x, "trustedHost", js.undefined)
    
    inline def setUseOnionLinks(value: Boolean): Self = StObject.set(x, "useOnionLinks", value.asInstanceOf[js.Any])
    
    inline def setUseOnionLinksUndefined: Self = StObject.set(x, "useOnionLinks", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWebusb(value: Boolean): Self = StObject.set(x, "webusb", value.asInstanceOf[js.Any])
    
    inline def setWebusbSrc(value: String): Self = StObject.set(x, "webusbSrc", value.asInstanceOf[js.Any])
    
    inline def setWebusbSrcUndefined: Self = StObject.set(x, "webusbSrc", js.undefined)
    
    inline def setWebusbUndefined: Self = StObject.set(x, "webusb", js.undefined)
  }
}
