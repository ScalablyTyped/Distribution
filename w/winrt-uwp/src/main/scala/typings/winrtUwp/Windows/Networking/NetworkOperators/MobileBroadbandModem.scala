package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband modem. */
trait MobileBroadbandModem extends js.Object {
  /** Gets the MobileBroadbandAccount associated currently with the mobile broadband modem. */
  var currentAccount: MobileBroadbandAccount
  /** Gets an object that describes the mobile broadband network that this modem us currently attached to. */
  var currentNetwork: MobileBroadbandNetwork
  /** Gets the MobileBroadbandDeviceInformation for the mobile broadband modem. */
  var deviceInformation: MobileBroadbandDeviceInformation
  /** Gets a list of the device services available for the mobile broadband modem. */
  var deviceServices: IVectorView[MobileBroadbandDeviceServiceInformation]
  /** Gets a value indicating whether the mobile broadband modem allows a reset operation. */
  var isResetSupported: Boolean
  /** Gets the maximum device service command size, in bytes, for the mobile broadband modem. */
  var maxDeviceServiceCommandSizeInBytes: Double
  /** Gets the maximum device service data size, in bytes, for the mobile broadband modem. */
  var maxDeviceServiceDataSizeInBytes: Double
  /**
    * Asynchronously retrieves mobile broadband modem configuration information.
    * @return An asynchronous retrieval operation. On successful completion, contains a MobileBroadbandModemConfiguration object representing the current configuration.
    */
  def getCurrentConfigurationAsync(): IPromiseWithIAsyncOperation[MobileBroadbandModemConfiguration]
  /**
    * Gets a specific device service for the mobile broadband modem.
    * @param deviceServiceId The unique device service identifier for the device service to be retrieved.
    * @return The mobile broadband device service retrieved.
    */
  def getDeviceService(deviceServiceId: String): MobileBroadbandDeviceService
  /**
    * Asynchronously performs a reset operation on the mobile broadband modem.
    * @return An asynchronous reset operation.
    */
  def resetAsync(): IPromiseWithIAsyncAction
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
}

