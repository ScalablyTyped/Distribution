package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent a Wi-Fi Direct advertisement and allows the app to control the listen state and custom information elements in the advertisement. */
trait WiFiDirectAdvertisement extends js.Object {
  /** Information elements to advertise in the Wi-Fi Direct advertisement. */
  var informationElements: IVector[WiFiDirectInformationElement]
  /** Whether autonomous group owner will be enabled. */
  var isAutonomousGroupOwnerEnabled: Boolean
  /** Gets the settings object for "legacy" (non-Wi-Fi Direct) connections. */
  var legacySettings: WiFiDirectLegacySettings
  /** Gets or sets the listen state and whether the Wi-Fi Direct device is discoverable. */
  var listenStateDiscoverability: WiFiDirectAdvertisementListenStateDiscoverability
  /** Gets a device's supported configuration methods. */
  var supportedConfigurationMethods: IVector[WiFiDirectConfigurationMethod]
}

object WiFiDirectAdvertisement {
  @scala.inline
  def apply(
    informationElements: IVector[WiFiDirectInformationElement],
    isAutonomousGroupOwnerEnabled: Boolean,
    legacySettings: WiFiDirectLegacySettings,
    listenStateDiscoverability: WiFiDirectAdvertisementListenStateDiscoverability,
    supportedConfigurationMethods: IVector[WiFiDirectConfigurationMethod]
  ): WiFiDirectAdvertisement = {
    val __obj = js.Dynamic.literal(informationElements = informationElements.asInstanceOf[js.Any], isAutonomousGroupOwnerEnabled = isAutonomousGroupOwnerEnabled.asInstanceOf[js.Any], legacySettings = legacySettings.asInstanceOf[js.Any], listenStateDiscoverability = listenStateDiscoverability.asInstanceOf[js.Any], supportedConfigurationMethods = supportedConfigurationMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectAdvertisement]
  }
}

