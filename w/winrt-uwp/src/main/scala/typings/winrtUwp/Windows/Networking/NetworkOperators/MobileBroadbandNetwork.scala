package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband network and the current network state. */
trait MobileBroadbandNetwork extends js.Object {
  /** The name of the currently connected access point. */
  var accessPointName: String
  /** Attempts to get the latest network activation error. */
  var activationNetworkError: Double
  /** Gets the unique network interface that identifies the mobile broadband network. */
  var networkAdapter: NetworkAdapter
  /** Gets the current network registration state. */
  var networkRegistrationState: NetworkRegistrationState
  /** Gets the latest packet attach network error. */
  var packetAttachNetworkError: Double
  /** Gets the data class of the current mobile network. */
  var registeredDataClass: DataClasses
  /** Gets the provider ID for the currently registered mobile network. */
  var registeredProviderId: String
  /** Gets the provider name for the currently registered mobile network. */
  var registeredProviderName: String
  /** Gets the latest network registration error. */
  var registrationNetworkError: Double
  /** Gets a list of all UICC apps available on the SIM card that can be used for registration on a mobile network. This list includes UICC apps that are not currently used for registration, but could potentially could be used for registration. */
  var registrationUiccApps: IVectorView[MobileBroadbandUiccApp]
  /**
    * Asynchronously retrieves a value indicating whether this network currently supports voice calls.
    * @return An asynchronous retrieval operation. On successful completion, contains a value indicating whether the network supports voice calls (if true) or not.
    */
  def getVoiceCallSupportAsync(): IPromiseWithIAsyncOperation[Boolean]
  /** Displays the connect UI for a specific mobile network. */
  def showConnectionUI(): Unit
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
}

