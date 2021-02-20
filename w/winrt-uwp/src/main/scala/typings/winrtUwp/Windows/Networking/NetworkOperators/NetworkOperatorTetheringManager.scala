package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface exposes the methods and properties used to control and configure tethering capabilities for a specific network account. */
@js.native
trait NetworkOperatorTetheringManager extends StObject {
  
  /** Gets the current number of connected clients on the tethering network. */
  var clientCount: Double = js.native
  
  /**
    * Use this method to provide tethering network configuration details for the tethering network.
    * @param configuration Provides a network account ID (SSID) and specifies the passphrase used for authentication when establishing a tethered network connection.
    * @return The asynchronous action.
    */
  def configureAccessPointAsync(configuration: NetworkOperatorTetheringAccessPointConfiguration): IPromiseWithIAsyncAction = js.native
  
  /**
    * Gets the current access point configuration for a network account as defined by a NetworkOperatorTetheringAccessPointConfiguration object.
    * @return Indicates the network account id and specifies the pass-phrase used for authentication when establishing a connection over the tethering network.
    */
  def getCurrentAccessPointConfiguration(): NetworkOperatorTetheringAccessPointConfiguration = js.native
  
  /**
    * Retrieves a list of tethering clients for this NetworkOperatorTetheringManager .
    * @return A list of clients.
    */
  def getTetheringClients(): IVectorView[NetworkOperatorTetheringClient] = js.native
  
  /** Gets the maximum number of client connections over a tethered network. */
  var maxClientCount: Double = js.native
  
  /**
    * Establishes the tethering network.
    * @return The result of the tethering network operation.
    */
  def startTetheringAsync(): IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult] = js.native
  
  /**
    * Shuts down the tethering network.
    * @return The result of the tethering network operation.
    */
  def stopTetheringAsync(): IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult] = js.native
  
  /** Gets the current operational state of the tethering feature. Possible values are defined by TetheringOperationalState */
  var tetheringOperationalState: TetheringOperationalState = js.native
}
object NetworkOperatorTetheringManager {
  
  @scala.inline
  def apply(
    clientCount: Double,
    configureAccessPointAsync: NetworkOperatorTetheringAccessPointConfiguration => IPromiseWithIAsyncAction,
    getCurrentAccessPointConfiguration: () => NetworkOperatorTetheringAccessPointConfiguration,
    getTetheringClients: () => IVectorView[NetworkOperatorTetheringClient],
    maxClientCount: Double,
    startTetheringAsync: () => IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult],
    stopTetheringAsync: () => IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult],
    tetheringOperationalState: TetheringOperationalState
  ): NetworkOperatorTetheringManager = {
    val __obj = js.Dynamic.literal(clientCount = clientCount.asInstanceOf[js.Any], configureAccessPointAsync = js.Any.fromFunction1(configureAccessPointAsync), getCurrentAccessPointConfiguration = js.Any.fromFunction0(getCurrentAccessPointConfiguration), getTetheringClients = js.Any.fromFunction0(getTetheringClients), maxClientCount = maxClientCount.asInstanceOf[js.Any], startTetheringAsync = js.Any.fromFunction0(startTetheringAsync), stopTetheringAsync = js.Any.fromFunction0(stopTetheringAsync), tetheringOperationalState = tetheringOperationalState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringManager]
  }
  
  @scala.inline
  implicit class NetworkOperatorTetheringManagerMutableBuilder[Self <: NetworkOperatorTetheringManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientCount(value: Double): Self = StObject.set(x, "clientCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigureAccessPointAsync(value: NetworkOperatorTetheringAccessPointConfiguration => IPromiseWithIAsyncAction): Self = StObject.set(x, "configureAccessPointAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentAccessPointConfiguration(value: () => NetworkOperatorTetheringAccessPointConfiguration): Self = StObject.set(x, "getCurrentAccessPointConfiguration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTetheringClients(value: () => IVectorView[NetworkOperatorTetheringClient]): Self = StObject.set(x, "getTetheringClients", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxClientCount(value: Double): Self = StObject.set(x, "maxClientCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTetheringAsync(value: () => IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]): Self = StObject.set(x, "startTetheringAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopTetheringAsync(value: () => IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]): Self = StObject.set(x, "stopTetheringAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTetheringOperationalState(value: TetheringOperationalState): Self = StObject.set(x, "tetheringOperationalState", value.asInstanceOf[js.Any])
  }
}
