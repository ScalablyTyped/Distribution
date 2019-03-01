package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var configSrc: js.UndefOr[java.lang.String] = js.undefined
  var connectSrc: js.UndefOr[java.lang.String] = js.undefined
  var debug: scala.Boolean | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var extension: js.UndefOr[java.lang.String] = js.undefined
  var hostIcon: js.UndefOr[java.lang.String] = js.undefined
  var hostLabel: js.UndefOr[java.lang.String] = js.undefined
  var iframeSrc: js.UndefOr[java.lang.String] = js.undefined
   // constant
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var pendingTransportEvent: js.UndefOr[scala.Boolean] = js.undefined
  var popup: js.UndefOr[scala.Boolean] = js.undefined
  var popupSrc: js.UndefOr[java.lang.String] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  var supportedBrowser: js.UndefOr[scala.Boolean] = js.undefined
  var transportReconnect: js.UndefOr[scala.Boolean] = js.undefined
  var trustedHost: js.UndefOr[scala.Boolean] = js.undefined
  var webusb: js.UndefOr[scala.Boolean] = js.undefined
  var webusbSrc: js.UndefOr[java.lang.String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    debug: scala.Boolean | org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    configSrc: java.lang.String = null,
    connectSrc: java.lang.String = null,
    extension: java.lang.String = null,
    hostIcon: java.lang.String = null,
    hostLabel: java.lang.String = null,
    iframeSrc: java.lang.String = null,
    origin: java.lang.String = null,
    pendingTransportEvent: js.UndefOr[scala.Boolean] = js.undefined,
    popup: js.UndefOr[scala.Boolean] = js.undefined,
    popupSrc: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    supportedBrowser: js.UndefOr[scala.Boolean] = js.undefined,
    transportReconnect: js.UndefOr[scala.Boolean] = js.undefined,
    trustedHost: js.UndefOr[scala.Boolean] = js.undefined,
    webusb: js.UndefOr[scala.Boolean] = js.undefined,
    webusbSrc: java.lang.String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (configSrc != null) __obj.updateDynamic("configSrc")(configSrc)
    if (connectSrc != null) __obj.updateDynamic("connectSrc")(connectSrc)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (hostIcon != null) __obj.updateDynamic("hostIcon")(hostIcon)
    if (hostLabel != null) __obj.updateDynamic("hostLabel")(hostLabel)
    if (iframeSrc != null) __obj.updateDynamic("iframeSrc")(iframeSrc)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (!js.isUndefined(pendingTransportEvent)) __obj.updateDynamic("pendingTransportEvent")(pendingTransportEvent)
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (popupSrc != null) __obj.updateDynamic("popupSrc")(popupSrc)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(supportedBrowser)) __obj.updateDynamic("supportedBrowser")(supportedBrowser)
    if (!js.isUndefined(transportReconnect)) __obj.updateDynamic("transportReconnect")(transportReconnect)
    if (!js.isUndefined(trustedHost)) __obj.updateDynamic("trustedHost")(trustedHost)
    if (!js.isUndefined(webusb)) __obj.updateDynamic("webusb")(webusb)
    if (webusbSrc != null) __obj.updateDynamic("webusbSrc")(webusbSrc)
    __obj.asInstanceOf[Settings]
  }
}

