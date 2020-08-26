package typings.trezorConnect.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
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
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebug(value: Boolean | StringDictionary[Boolean]): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigSrc(value: String): Self = this.set("configSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigSrc: Self = this.set("configSrc", js.undefined)
    @scala.inline
    def setConnectSrc(value: String): Self = this.set("connectSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectSrc: Self = this.set("connectSrc", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setHostIcon(value: String): Self = this.set("hostIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostIcon: Self = this.set("hostIcon", js.undefined)
    @scala.inline
    def setHostLabel(value: String): Self = this.set("hostLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostLabel: Self = this.set("hostLabel", js.undefined)
    @scala.inline
    def setIframeSrc(value: String): Self = this.set("iframeSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeSrc: Self = this.set("iframeSrc", js.undefined)
    @scala.inline
    def setLazyLoad(value: String): Self = this.set("lazyLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    @scala.inline
    def setManifest(value: ManifestParams): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPendingTransportEvent(value: Boolean): Self = this.set("pendingTransportEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingTransportEvent: Self = this.set("pendingTransportEvent", js.undefined)
    @scala.inline
    def setPopup(value: Boolean): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    @scala.inline
    def setPopupSrc(value: String): Self = this.set("popupSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupSrc: Self = this.set("popupSrc", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSupportedBrowser(value: Boolean): Self = this.set("supportedBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedBrowser: Self = this.set("supportedBrowser", js.undefined)
    @scala.inline
    def setTransportReconnect(value: Boolean): Self = this.set("transportReconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportReconnect: Self = this.set("transportReconnect", js.undefined)
    @scala.inline
    def setTrustedHost(value: Boolean): Self = this.set("trustedHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustedHost: Self = this.set("trustedHost", js.undefined)
    @scala.inline
    def setWebusb(value: Boolean): Self = this.set("webusb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebusb: Self = this.set("webusb", js.undefined)
    @scala.inline
    def setWebusbSrc(value: String): Self = this.set("webusbSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebusbSrc: Self = this.set("webusbSrc", js.undefined)
  }
  
}

