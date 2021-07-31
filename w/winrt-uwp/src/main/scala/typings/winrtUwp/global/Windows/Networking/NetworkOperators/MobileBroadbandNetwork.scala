package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband network and the current network state. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetwork")
@js.native
abstract class MobileBroadbandNetwork ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandNetwork {
  
  /** The name of the currently connected access point. */
  /* CompleteClass */
  var accessPointName: String = js.native
  
  /** Attempts to get the latest network activation error. */
  /* CompleteClass */
  var activationNetworkError: Double = js.native
  
  /**
    * Asynchronously retrieves a value indicating whether this network currently supports voice calls.
    * @return An asynchronous retrieval operation. On successful completion, contains a value indicating whether the network supports voice calls (if true) or not.
    */
  /* CompleteClass */
  override def getVoiceCallSupportAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets the unique network interface that identifies the mobile broadband network. */
  /* CompleteClass */
  var networkAdapter: NetworkAdapter = js.native
  
  /** Gets the current network registration state. */
  /* CompleteClass */
  var networkRegistrationState: typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkRegistrationState = js.native
  
  /** Gets the latest packet attach network error. */
  /* CompleteClass */
  var packetAttachNetworkError: Double = js.native
  
  /** Gets the data class of the current mobile network. */
  /* CompleteClass */
  var registeredDataClass: typings.winrtUwp.Windows.Networking.NetworkOperators.DataClasses = js.native
  
  /** Gets the provider ID for the currently registered mobile network. */
  /* CompleteClass */
  var registeredProviderId: String = js.native
  
  /** Gets the provider name for the currently registered mobile network. */
  /* CompleteClass */
  var registeredProviderName: String = js.native
  
  /** Gets the latest network registration error. */
  /* CompleteClass */
  var registrationNetworkError: Double = js.native
  
  /** Gets a list of all UICC apps available on the SIM card that can be used for registration on a mobile network. This list includes UICC apps that are not currently used for registration, but could potentially could be used for registration. */
  /* CompleteClass */
  var registrationUiccApps: IVectorView[typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccApp] = js.native
  
  /** Displays the connect UI for a specific mobile network. */
  /* CompleteClass */
  override def showConnectionUI(): Unit = js.native
}
