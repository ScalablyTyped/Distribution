package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband network and the current network state. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetwork")
@js.native
abstract class MobileBroadbandNetwork () extends js.Object {
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

