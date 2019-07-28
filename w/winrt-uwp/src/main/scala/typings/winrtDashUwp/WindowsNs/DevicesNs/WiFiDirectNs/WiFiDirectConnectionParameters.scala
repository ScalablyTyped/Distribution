package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DevicePairingKinds
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by an app to specify the connection parameters for a Wi-Fi Direct connect/pairing operation. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters")
@js.native
/** Creates a new WiFiDirectConnectionParameters object. */
class WiFiDirectConnectionParameters () extends js.Object {
  /** The group owner intent value used for group owner negotiation in a Wi-Fi Direct connect/pairing operation. */
  var groupOwnerIntent: Double = js.native
  /** Gets a list of supported configuration methods, in order of preference. */
  var preferenceOrderedConfigurationMethods: IVector[WiFiDirectConfigurationMethod] = js.native
  /** Gets or sets a value specifying a device's preferred pairing procedure. */
  var preferredPairingProcedure: WiFiDirectPairingProcedure = js.native
}

/* static members */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters")
@js.native
object WiFiDirectConnectionParameters extends js.Object {
  /**
    * Gets a list of the DevicePairingKinds supporting the given configuration method.
    * @param configurationMethod A value specifying a configuration method.
    * @return A value specifying a pairing kind, for use with the pairing functionality in the Windows.Devices.Enumeration API.
    */
  def getDevicePairingKinds(configurationMethod: WiFiDirectConfigurationMethod): DevicePairingKinds = js.native
}

