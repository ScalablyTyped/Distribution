package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface exposes the methods and properties used to control and configure tethering capabilities for a specific network account. */
trait NetworkOperatorTetheringManager extends js.Object {
  /** Gets the current number of connected clients on the tethering network. */
  var clientCount: Double
  /** Gets the maximum number of client connections over a tethered network. */
  var maxClientCount: Double
  /** Gets the current operational state of the tethering feature. Possible values are defined by TetheringOperationalState */
  var tetheringOperationalState: TetheringOperationalState
  /**
    * Use this method to provide tethering network configuration details for the tethering network.
    * @param configuration Provides a network account ID (SSID) and specifies the passphrase used for authentication when establishing a tethered network connection.
    * @return The asynchronous action.
    */
  def configureAccessPointAsync(configuration: NetworkOperatorTetheringAccessPointConfiguration): IPromiseWithIAsyncAction
  /**
    * Gets the current access point configuration for a network account as defined by a NetworkOperatorTetheringAccessPointConfiguration object.
    * @return Indicates the network account id and specifies the pass-phrase used for authentication when establishing a connection over the tethering network.
    */
  def getCurrentAccessPointConfiguration(): NetworkOperatorTetheringAccessPointConfiguration
  /**
    * Retrieves a list of tethering clients for this NetworkOperatorTetheringManager .
    * @return A list of clients.
    */
  def getTetheringClients(): IVectorView[NetworkOperatorTetheringClient]
  /**
    * Establishes the tethering network.
    * @return The result of the tethering network operation.
    */
  def startTetheringAsync(): IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]
  /**
    * Shuts down the tethering network.
    * @return The result of the tethering network operation.
    */
  def stopTetheringAsync(): IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]
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
}

