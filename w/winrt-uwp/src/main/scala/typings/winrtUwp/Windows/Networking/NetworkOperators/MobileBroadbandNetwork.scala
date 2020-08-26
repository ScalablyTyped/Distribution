package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband network and the current network state. */
@js.native
trait MobileBroadbandNetwork extends js.Object {
  /** The name of the currently connected access point. */
  var accessPointName: String = js.native
  /** Attempts to get the latest network activation error. */
  var activationNetworkError: Double = js.native
  /** Gets the unique network interface that identifies the mobile broadband network. */
  var networkAdapter: NetworkAdapter = js.native
  /** Gets the current network registration state. */
  var networkRegistrationState: NetworkRegistrationState = js.native
  /** Gets the latest packet attach network error. */
  var packetAttachNetworkError: Double = js.native
  /** Gets the data class of the current mobile network. */
  var registeredDataClass: DataClasses = js.native
  /** Gets the provider ID for the currently registered mobile network. */
  var registeredProviderId: String = js.native
  /** Gets the provider name for the currently registered mobile network. */
  var registeredProviderName: String = js.native
  /** Gets the latest network registration error. */
  var registrationNetworkError: Double = js.native
  /** Gets a list of all UICC apps available on the SIM card that can be used for registration on a mobile network. This list includes UICC apps that are not currently used for registration, but could potentially could be used for registration. */
  var registrationUiccApps: IVectorView[MobileBroadbandUiccApp] = js.native
  /**
    * Asynchronously retrieves a value indicating whether this network currently supports voice calls.
    * @return An asynchronous retrieval operation. On successful completion, contains a value indicating whether the network supports voice calls (if true) or not.
    */
  def getVoiceCallSupportAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /** Displays the connect UI for a specific mobile network. */
  def showConnectionUI(): Unit = js.native
}

object MobileBroadbandNetwork {
  @scala.inline
  def apply(
    accessPointName: String,
    activationNetworkError: Double,
    getVoiceCallSupportAsync: () => IPromiseWithIAsyncOperation[Boolean],
    networkAdapter: NetworkAdapter,
    networkRegistrationState: NetworkRegistrationState,
    packetAttachNetworkError: Double,
    registeredDataClass: DataClasses,
    registeredProviderId: String,
    registeredProviderName: String,
    registrationNetworkError: Double,
    registrationUiccApps: IVectorView[MobileBroadbandUiccApp],
    showConnectionUI: () => Unit
  ): MobileBroadbandNetwork = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], activationNetworkError = activationNetworkError.asInstanceOf[js.Any], getVoiceCallSupportAsync = js.Any.fromFunction0(getVoiceCallSupportAsync), networkAdapter = networkAdapter.asInstanceOf[js.Any], networkRegistrationState = networkRegistrationState.asInstanceOf[js.Any], packetAttachNetworkError = packetAttachNetworkError.asInstanceOf[js.Any], registeredDataClass = registeredDataClass.asInstanceOf[js.Any], registeredProviderId = registeredProviderId.asInstanceOf[js.Any], registeredProviderName = registeredProviderName.asInstanceOf[js.Any], registrationNetworkError = registrationNetworkError.asInstanceOf[js.Any], registrationUiccApps = registrationUiccApps.asInstanceOf[js.Any], showConnectionUI = js.Any.fromFunction0(showConnectionUI))
    __obj.asInstanceOf[MobileBroadbandNetwork]
  }
  @scala.inline
  implicit class MobileBroadbandNetworkOps[Self <: MobileBroadbandNetwork] (val x: Self) extends AnyVal {
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
    def setAccessPointName(value: String): Self = this.set("accessPointName", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivationNetworkError(value: Double): Self = this.set("activationNetworkError", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetVoiceCallSupportAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("getVoiceCallSupportAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setNetworkAdapter(value: NetworkAdapter): Self = this.set("networkAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkRegistrationState(value: NetworkRegistrationState): Self = this.set("networkRegistrationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacketAttachNetworkError(value: Double): Self = this.set("packetAttachNetworkError", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisteredDataClass(value: DataClasses): Self = this.set("registeredDataClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisteredProviderId(value: String): Self = this.set("registeredProviderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisteredProviderName(value: String): Self = this.set("registeredProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistrationNetworkError(value: Double): Self = this.set("registrationNetworkError", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistrationUiccApps(value: IVectorView[MobileBroadbandUiccApp]): Self = this.set("registrationUiccApps", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowConnectionUI(value: () => Unit): Self = this.set("showConnectionUI", js.Any.fromFunction0(value))
  }
  
}

