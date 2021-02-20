package typings.trezorConnect.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends StObject {
  
  var configSrc: js.UndefOr[String] = js.native
  
  var connectSrc: js.UndefOr[String] = js.native
  
  var debug: Boolean | StringDictionary[Boolean] = js.native
  
  var extension: js.UndefOr[String] = js.native
  
  var hostIcon: js.UndefOr[String] = js.native
  
  var hostLabel: js.UndefOr[String] = js.native
  
  var iframeSrc: js.UndefOr[String] = js.native
  
  var lazyLoad: js.UndefOr[String] = js.native
  
  var manifest: js.UndefOr[ManifestParams] = js.native
  
  // constant
  var origin: js.UndefOr[String] = js.native
  
  var pendingTransportEvent: js.UndefOr[Boolean] = js.native
  
  var popup: js.UndefOr[Boolean] = js.native
  
  var popupSrc: js.UndefOr[String] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var supportedBrowser: js.UndefOr[Boolean] = js.native
  
  var transportReconnect: js.UndefOr[Boolean] = js.native
  
  var trustedHost: js.UndefOr[Boolean] = js.native
  
  var webusb: js.UndefOr[Boolean] = js.native
  
  var webusbSrc: js.UndefOr[String] = js.native
}
object Settings {
  
  @scala.inline
  def apply(debug: Boolean | StringDictionary[Boolean]): Settings = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigSrc(value: String): Self = StObject.set(x, "configSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigSrcUndefined: Self = StObject.set(x, "configSrc", js.undefined)
    
    @scala.inline
    def setConnectSrc(value: String): Self = StObject.set(x, "connectSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectSrcUndefined: Self = StObject.set(x, "connectSrc", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean | StringDictionary[Boolean]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setHostIcon(value: String): Self = StObject.set(x, "hostIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIconUndefined: Self = StObject.set(x, "hostIcon", js.undefined)
    
    @scala.inline
    def setHostLabel(value: String): Self = StObject.set(x, "hostLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostLabelUndefined: Self = StObject.set(x, "hostLabel", js.undefined)
    
    @scala.inline
    def setIframeSrc(value: String): Self = StObject.set(x, "iframeSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeSrcUndefined: Self = StObject.set(x, "iframeSrc", js.undefined)
    
    @scala.inline
    def setLazyLoad(value: String): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
    
    @scala.inline
    def setManifest(value: ManifestParams): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPendingTransportEvent(value: Boolean): Self = StObject.set(x, "pendingTransportEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingTransportEventUndefined: Self = StObject.set(x, "pendingTransportEvent", js.undefined)
    
    @scala.inline
    def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupSrc(value: String): Self = StObject.set(x, "popupSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupSrcUndefined: Self = StObject.set(x, "popupSrc", js.undefined)
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSupportedBrowser(value: Boolean): Self = StObject.set(x, "supportedBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedBrowserUndefined: Self = StObject.set(x, "supportedBrowser", js.undefined)
    
    @scala.inline
    def setTransportReconnect(value: Boolean): Self = StObject.set(x, "transportReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportReconnectUndefined: Self = StObject.set(x, "transportReconnect", js.undefined)
    
    @scala.inline
    def setTrustedHost(value: Boolean): Self = StObject.set(x, "trustedHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustedHostUndefined: Self = StObject.set(x, "trustedHost", js.undefined)
    
    @scala.inline
    def setWebusb(value: Boolean): Self = StObject.set(x, "webusb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebusbSrc(value: String): Self = StObject.set(x, "webusbSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebusbSrcUndefined: Self = StObject.set(x, "webusbSrc", js.undefined)
    
    @scala.inline
    def setWebusbUndefined: Self = StObject.set(x, "webusb", js.undefined)
  }
}
