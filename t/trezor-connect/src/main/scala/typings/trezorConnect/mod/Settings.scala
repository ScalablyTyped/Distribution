package typings.trezorConnect.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var configSrc: js.UndefOr[String] = js.undefined
  var connectSrc: js.UndefOr[String] = js.undefined
  var debug: Boolean | StringDictionary[Boolean]
  var extension: js.UndefOr[String] = js.undefined
  var hostIcon: js.UndefOr[String] = js.undefined
  var hostLabel: js.UndefOr[String] = js.undefined
  var iframeSrc: js.UndefOr[String] = js.undefined
  var lazyLoad: js.UndefOr[String] = js.undefined
  var manifest: js.UndefOr[ManifestParams] = js.undefined
   // constant
  var origin: js.UndefOr[String] = js.undefined
  var pendingTransportEvent: js.UndefOr[Boolean] = js.undefined
  var popup: js.UndefOr[Boolean] = js.undefined
  var popupSrc: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var supportedBrowser: js.UndefOr[Boolean] = js.undefined
  var transportReconnect: js.UndefOr[Boolean] = js.undefined
  var trustedHost: js.UndefOr[Boolean] = js.undefined
  var webusb: js.UndefOr[Boolean] = js.undefined
  var webusbSrc: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    debug: Boolean | StringDictionary[Boolean],
    configSrc: String = null,
    connectSrc: String = null,
    extension: String = null,
    hostIcon: String = null,
    hostLabel: String = null,
    iframeSrc: String = null,
    lazyLoad: String = null,
    manifest: ManifestParams = null,
    origin: String = null,
    pendingTransportEvent: js.UndefOr[Boolean] = js.undefined,
    popup: js.UndefOr[Boolean] = js.undefined,
    popupSrc: String = null,
    priority: Int | Double = null,
    supportedBrowser: js.UndefOr[Boolean] = js.undefined,
    transportReconnect: js.UndefOr[Boolean] = js.undefined,
    trustedHost: js.UndefOr[Boolean] = js.undefined,
    webusb: js.UndefOr[Boolean] = js.undefined,
    webusbSrc: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
    if (configSrc != null) __obj.updateDynamic("configSrc")(configSrc.asInstanceOf[js.Any])
    if (connectSrc != null) __obj.updateDynamic("connectSrc")(connectSrc.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (hostIcon != null) __obj.updateDynamic("hostIcon")(hostIcon.asInstanceOf[js.Any])
    if (hostLabel != null) __obj.updateDynamic("hostLabel")(hostLabel.asInstanceOf[js.Any])
    if (iframeSrc != null) __obj.updateDynamic("iframeSrc")(iframeSrc.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(pendingTransportEvent)) __obj.updateDynamic("pendingTransportEvent")(pendingTransportEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (popupSrc != null) __obj.updateDynamic("popupSrc")(popupSrc.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(supportedBrowser)) __obj.updateDynamic("supportedBrowser")(supportedBrowser.asInstanceOf[js.Any])
    if (!js.isUndefined(transportReconnect)) __obj.updateDynamic("transportReconnect")(transportReconnect.asInstanceOf[js.Any])
    if (!js.isUndefined(trustedHost)) __obj.updateDynamic("trustedHost")(trustedHost.asInstanceOf[js.Any])
    if (!js.isUndefined(webusb)) __obj.updateDynamic("webusb")(webusb.asInstanceOf[js.Any])
    if (webusbSrc != null) __obj.updateDynamic("webusbSrc")(webusbSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

