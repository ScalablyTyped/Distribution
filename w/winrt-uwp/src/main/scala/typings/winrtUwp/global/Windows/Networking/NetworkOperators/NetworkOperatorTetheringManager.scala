package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface exposes the methods and properties used to control and configure tethering capabilities for a specific network account. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager")
@js.native
abstract class NetworkOperatorTetheringManager ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager
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
