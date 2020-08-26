package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband device service. */
@js.native
trait MobileBroadbandDeviceService extends js.Object {
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
  @scala.inline
  implicit class MobileBroadbandDeviceServiceOps[Self <: MobileBroadbandDeviceService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceServiceId(value: String): Self = this.set("deviceServiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenCommandSession(value: () => MobileBroadbandDeviceServiceCommandSession): Self = this.set("openCommandSession", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenDataSession(value: () => MobileBroadbandDeviceServiceDataSession): Self = this.set("openDataSession", js.Any.fromFunction0(value))
    @scala.inline
    def setSupportedCommands(value: IVectorView[Double]): Self = this.set("supportedCommands", value.asInstanceOf[js.Any])
  }
  
}

