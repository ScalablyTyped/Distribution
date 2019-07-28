package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.RfcommNs.RfcommServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for RFCOMM outbound connections. If an app wants the system to create outbound connections on its behalf, the app must create this object and attach it to the RfcommConnectionTrigger . */
@JSGlobal("Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation")
@js.native
abstract class RfcommOutboundConnectionInformation () extends js.Object {
  /** Gets or sets the service UUID of the remote service to which the system will connect on behalf of the app. */
  var remoteServiceId: RfcommServiceId = js.native
}

