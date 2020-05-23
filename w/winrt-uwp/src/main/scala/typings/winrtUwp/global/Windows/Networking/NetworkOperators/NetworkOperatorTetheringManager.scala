package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface exposes the methods and properties used to control and configure tethering capabilities for a specific network account. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager")
@js.native
abstract class NetworkOperatorTetheringManager ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager {
  /** Gets the current number of connected clients on the tethering network. */
  /* CompleteClass */
  override var clientCount: Double = js.native
  /** Gets the maximum number of client connections over a tethered network. */
  /* CompleteClass */
  override var maxClientCount: Double = js.native
  /** Gets the current operational state of the tethering feature. Possible values are defined by TetheringOperationalState */
  /* CompleteClass */
  override var tetheringOperationalState: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationalState = js.native
  /**
    * Use this method to provide tethering network configuration details for the tethering network.
    * @param configuration Provides a network account ID (SSID) and specifies the passphrase used for authentication when establishing a tethered network connection.
    * @return The asynchronous action.
    */
  /* CompleteClass */
  override def configureAccessPointAsync(
    configuration: typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringAccessPointConfiguration
  ): IPromiseWithIAsyncAction = js.native
  /**
    * Gets the current access point configuration for a network account as defined by a NetworkOperatorTetheringAccessPointConfiguration object.
    * @return Indicates the network account id and specifies the pass-phrase used for authentication when establishing a connection over the tethering network.
    */
  /* CompleteClass */
  override def getCurrentAccessPointConfiguration(): typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringAccessPointConfiguration = js.native
  /**
    * Retrieves a list of tethering clients for this NetworkOperatorTetheringManager .
    * @return A list of clients.
    */
  /* CompleteClass */
  override def getTetheringClients(): IVectorView[
    typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringClient
  ] = js.native
  /**
    * Establishes the tethering network.
    * @return The result of the tethering network operation.
    */
  /* CompleteClass */
  override def startTetheringAsync(): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringOperationResult
  ] = js.native
  /**
    * Shuts down the tethering network.
    * @return The result of the tethering network operation.
    */
  /* CompleteClass */
  override def stopTetheringAsync(): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringOperationResult
  ] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager")
@js.native
object NetworkOperatorTetheringManager extends js.Object {
  /**
    * Creates a NetworkOperatorTetheringManager using the given profile.
    * @param profile Connection profile to be used.
    * @return The resulting manager object.
    */
  def createFromConnectionProfile(profile: ConnectionProfile): typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager = js.native
  /**
    * Creates an instance of NetworkOperatorTetheringManager for a specific network account using the provided network account ID for the mobile broadband device.
    * @param networkAccountId The network account ID.
    * @return A NetworkOperatorTetheringManager object.
    */
  def createFromNetworkAccountId(networkAccountId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager = js.native
  /**
    * Indicates if a device is capable of creating a tethering network. Possible values are defined by TetheringCapability .
    * @param networkAccountId The network account ID.
    * @return The tethering capabilities of a network account.
    */
  def getTetheringCapability(networkAccountId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringCapability = js.native
  /**
    * Gets tethering capabilities, based on the given connection profile.
    * @param profile Connection profile to be checked.
    * @return Tethering capabilities of the connection profile.
    */
  def getTetheringCapabilityFromConnectionProfile(profile: ConnectionProfile): typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringCapability = js.native
}

