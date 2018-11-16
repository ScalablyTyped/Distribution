package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent a Wi-Fi Direct advertisement and allows the app to control the listen state and custom information elements in the advertisement. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisement")
@js.native
abstract class WiFiDirectAdvertisement () extends js.Object {
  /** Information elements to advertise in the Wi-Fi Direct advertisement. */
  var informationElements: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[WiFiDirectInformationElement] = js.native
  /** Whether autonomous group owner will be enabled. */
  var isAutonomousGroupOwnerEnabled: scala.Boolean = js.native
  /** Gets the settings object for "legacy" (non-Wi-Fi Direct) connections. */
  var legacySettings: WiFiDirectLegacySettings = js.native
  /** Gets or sets the listen state and whether the Wi-Fi Direct device is discoverable. */
  var listenStateDiscoverability: WiFiDirectAdvertisementListenStateDiscoverability = js.native
  /** Gets a device's supported configuration methods. */
  var supportedConfigurationMethods: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[WiFiDirectConfigurationMethod] = js.native
}

