package typings.winrtUwp.global.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent a Wi-Fi Direct advertisement and allows the app to control the listen state and custom information elements in the advertisement. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisement")
@js.native
abstract class WiFiDirectAdvertisement ()
  extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisement {
  /** Information elements to advertise in the Wi-Fi Direct advertisement. */
  /* CompleteClass */
  override var informationElements: IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement] = js.native
  /** Whether autonomous group owner will be enabled. */
  /* CompleteClass */
  override var isAutonomousGroupOwnerEnabled: Boolean = js.native
  /** Gets the settings object for "legacy" (non-Wi-Fi Direct) connections. */
  /* CompleteClass */
  override var legacySettings: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectLegacySettings = js.native
  /** Gets or sets the listen state and whether the Wi-Fi Direct device is discoverable. */
  /* CompleteClass */
  override var listenStateDiscoverability: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability = js.native
  /** Gets a device's supported configuration methods. */
  /* CompleteClass */
  override var supportedConfigurationMethods: IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod] = js.native
}

