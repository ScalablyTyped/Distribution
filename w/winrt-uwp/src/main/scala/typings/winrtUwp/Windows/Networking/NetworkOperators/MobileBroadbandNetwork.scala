package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband network and the current network state. */
trait MobileBroadbandNetwork extends StObject {
  
  /** The name of the currently connected access point. */
  var accessPointName: String
  
  /** Attempts to get the latest network activation error. */
  var activationNetworkError: Double
  
  /**
    * Asynchronously retrieves a value indicating whether this network currently supports voice calls.
    * @return An asynchronous retrieval operation. On successful completion, contains a value indicating whether the network supports voice calls (if true) or not.
    */
  def getVoiceCallSupportAsync(): IPromiseWithIAsyncOperation[Boolean]
  
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
  
  /** Displays the connect UI for a specific mobile network. */
  def showConnectionUI(): Unit
}
object MobileBroadbandNetwork {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: MobileBroadbandNetwork] (val x: Self) extends AnyVal {
    
    inline def setAccessPointName(value: String): Self = StObject.set(x, "accessPointName", value.asInstanceOf[js.Any])
    
    inline def setActivationNetworkError(value: Double): Self = StObject.set(x, "activationNetworkError", value.asInstanceOf[js.Any])
    
    inline def setGetVoiceCallSupportAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "getVoiceCallSupportAsync", js.Any.fromFunction0(value))
    
    inline def setNetworkAdapter(value: NetworkAdapter): Self = StObject.set(x, "networkAdapter", value.asInstanceOf[js.Any])
    
    inline def setNetworkRegistrationState(value: NetworkRegistrationState): Self = StObject.set(x, "networkRegistrationState", value.asInstanceOf[js.Any])
    
    inline def setPacketAttachNetworkError(value: Double): Self = StObject.set(x, "packetAttachNetworkError", value.asInstanceOf[js.Any])
    
    inline def setRegisteredDataClass(value: DataClasses): Self = StObject.set(x, "registeredDataClass", value.asInstanceOf[js.Any])
    
    inline def setRegisteredProviderId(value: String): Self = StObject.set(x, "registeredProviderId", value.asInstanceOf[js.Any])
    
    inline def setRegisteredProviderName(value: String): Self = StObject.set(x, "registeredProviderName", value.asInstanceOf[js.Any])
    
    inline def setRegistrationNetworkError(value: Double): Self = StObject.set(x, "registrationNetworkError", value.asInstanceOf[js.Any])
    
    inline def setRegistrationUiccApps(value: IVectorView[MobileBroadbandUiccApp]): Self = StObject.set(x, "registrationUiccApps", value.asInstanceOf[js.Any])
    
    inline def setShowConnectionUI(value: () => Unit): Self = StObject.set(x, "showConnectionUI", js.Any.fromFunction0(value))
  }
}
