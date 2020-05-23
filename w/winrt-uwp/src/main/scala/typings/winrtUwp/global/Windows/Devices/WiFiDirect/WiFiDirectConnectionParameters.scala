package typings.winrtUwp.global.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by an app to specify the connection parameters for a Wi-Fi Direct connect/pairing operation. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters")
@js.native
/** Creates a new WiFiDirectConnectionParameters object. */
class WiFiDirectConnectionParameters ()
  extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters {
  /** The group owner intent value used for group owner negotiation in a Wi-Fi Direct connect/pairing operation. */
  /* CompleteClass */
  override var groupOwnerIntent: Double = js.native
  /** Gets a list of supported configuration methods, in order of preference. */
  /* CompleteClass */
  override var preferenceOrderedConfigurationMethods: IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod] = js.native
  /** Gets or sets a value specifying a device's preferred pairing procedure. */
  /* CompleteClass */
  override var preferredPairingProcedure: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure = js.native
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
  def getDevicePairingKinds(configurationMethod: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod): DevicePairingKinds = js.native
}

