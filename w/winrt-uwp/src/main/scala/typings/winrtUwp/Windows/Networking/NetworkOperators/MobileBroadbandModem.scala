package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband modem. */
@js.native
trait MobileBroadbandModem extends js.Object {
  /** Gets the MobileBroadbandAccount associated currently with the mobile broadband modem. */
  var currentAccount: MobileBroadbandAccount = js.native
  /** Gets an object that describes the mobile broadband network that this modem us currently attached to. */
  var currentNetwork: MobileBroadbandNetwork = js.native
  /** Gets the MobileBroadbandDeviceInformation for the mobile broadband modem. */
  var deviceInformation: MobileBroadbandDeviceInformation = js.native
  /** Gets a list of the device services available for the mobile broadband modem. */
  var deviceServices: IVectorView[MobileBroadbandDeviceServiceInformation] = js.native
  /** Gets a value indicating whether the mobile broadband modem allows a reset operation. */
  var isResetSupported: Boolean = js.native
  /** Gets the maximum device service command size, in bytes, for the mobile broadband modem. */
  var maxDeviceServiceCommandSizeInBytes: Double = js.native
  /** Gets the maximum device service data size, in bytes, for the mobile broadband modem. */
  var maxDeviceServiceDataSizeInBytes: Double = js.native
  /**
    * Asynchronously retrieves mobile broadband modem configuration information.
    * @return An asynchronous retrieval operation. On successful completion, contains a MobileBroadbandModemConfiguration object representing the current configuration.
    */
  def getCurrentConfigurationAsync(): IPromiseWithIAsyncOperation[MobileBroadbandModemConfiguration] = js.native
  /**
    * Gets a specific device service for the mobile broadband modem.
    * @param deviceServiceId The unique device service identifier for the device service to be retrieved.
    * @return The mobile broadband device service retrieved.
    */
  def getDeviceService(deviceServiceId: String): MobileBroadbandDeviceService = js.native
  /**
    * Asynchronously performs a reset operation on the mobile broadband modem.
    * @return An asynchronous reset operation.
    */
  def resetAsync(): IPromiseWithIAsyncAction = js.native
}

object MobileBroadbandModem {
  @scala.inline
  def apply(
    currentAccount: MobileBroadbandAccount,
    currentNetwork: MobileBroadbandNetwork,
    deviceInformation: MobileBroadbandDeviceInformation,
    deviceServices: IVectorView[MobileBroadbandDeviceServiceInformation],
    getCurrentConfigurationAsync: () => IPromiseWithIAsyncOperation[MobileBroadbandModemConfiguration],
    getDeviceService: String => MobileBroadbandDeviceService,
    isResetSupported: Boolean,
    maxDeviceServiceCommandSizeInBytes: Double,
    maxDeviceServiceDataSizeInBytes: Double,
    resetAsync: () => IPromiseWithIAsyncAction
  ): MobileBroadbandModem = {
    val __obj = js.Dynamic.literal(currentAccount = currentAccount.asInstanceOf[js.Any], currentNetwork = currentNetwork.asInstanceOf[js.Any], deviceInformation = deviceInformation.asInstanceOf[js.Any], deviceServices = deviceServices.asInstanceOf[js.Any], getCurrentConfigurationAsync = js.Any.fromFunction0(getCurrentConfigurationAsync), getDeviceService = js.Any.fromFunction1(getDeviceService), isResetSupported = isResetSupported.asInstanceOf[js.Any], maxDeviceServiceCommandSizeInBytes = maxDeviceServiceCommandSizeInBytes.asInstanceOf[js.Any], maxDeviceServiceDataSizeInBytes = maxDeviceServiceDataSizeInBytes.asInstanceOf[js.Any], resetAsync = js.Any.fromFunction0(resetAsync))
    __obj.asInstanceOf[MobileBroadbandModem]
  }
  @scala.inline
  implicit class MobileBroadbandModemOps[Self <: MobileBroadbandModem] (val x: Self) extends AnyVal {
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
    def setCurrentAccount(value: MobileBroadbandAccount): Self = this.set("currentAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentNetwork(value: MobileBroadbandNetwork): Self = this.set("currentNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceInformation(value: MobileBroadbandDeviceInformation): Self = this.set("deviceInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceServices(value: IVectorView[MobileBroadbandDeviceServiceInformation]): Self = this.set("deviceServices", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCurrentConfigurationAsync(value: () => IPromiseWithIAsyncOperation[MobileBroadbandModemConfiguration]): Self = this.set("getCurrentConfigurationAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDeviceService(value: String => MobileBroadbandDeviceService): Self = this.set("getDeviceService", js.Any.fromFunction1(value))
    @scala.inline
    def setIsResetSupported(value: Boolean): Self = this.set("isResetSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDeviceServiceCommandSizeInBytes(value: Double): Self = this.set("maxDeviceServiceCommandSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDeviceServiceDataSizeInBytes(value: Double): Self = this.set("maxDeviceServiceDataSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("resetAsync", js.Any.fromFunction0(value))
  }
  
}

