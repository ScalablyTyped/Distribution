package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband device service. */
trait MobileBroadbandDeviceService extends js.Object {
  /** Gets the unique device service identity for the mobile broadband device service. */
  var deviceServiceId: String
  /** Gets a list of supported device service commands for the mobile broadband device service. */
  var supportedCommands: IVectorView[Double]
  /**
    * Opens a new MobileBroadbandDeviceServiceCommandSession for the mobile broadband device service.
    * @return A new command session for the mobile broadband device service.
    */
  def openCommandSession(): MobileBroadbandDeviceServiceCommandSession
  /**
    * Opens a new MobileBroadbandDeviceServiceDataSession for the mobile broadband device service.
    * @return A new data session for the Mobile Broadband device service.
    */
  def openDataSession(): MobileBroadbandDeviceServiceDataSession
}

object MobileBroadbandDeviceService {
  @scala.inline
  def apply(
    deviceServiceId: String,
    openCommandSession: () => MobileBroadbandDeviceServiceCommandSession,
    openDataSession: () => MobileBroadbandDeviceServiceDataSession,
    supportedCommands: IVectorView[Double]
  ): MobileBroadbandDeviceService = {
    val __obj = js.Dynamic.literal(deviceServiceId = deviceServiceId.asInstanceOf[js.Any], openCommandSession = js.Any.fromFunction0(openCommandSession), openDataSession = js.Any.fromFunction0(openDataSession), supportedCommands = supportedCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceService]
  }
}

