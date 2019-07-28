package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband device service. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceService")
@js.native
abstract class MobileBroadbandDeviceService () extends js.Object {
  /** Gets the unique device service identity for the mobile broadband device service. */
  var deviceServiceId: String = js.native
  /** Gets a list of supported device service commands for the mobile broadband device service. */
  var supportedCommands: IVectorView[Double] = js.native
  /**
    * Opens a new MobileBroadbandDeviceServiceCommandSession for the mobile broadband device service.
    * @return A new command session for the mobile broadband device service.
    */
  def openCommandSession(): MobileBroadbandDeviceServiceCommandSession = js.native
  /**
    * Opens a new MobileBroadbandDeviceServiceDataSession for the mobile broadband device service.
    * @return A new data session for the Mobile Broadband device service.
    */
  def openDataSession(): MobileBroadbandDeviceServiceDataSession = js.native
}

