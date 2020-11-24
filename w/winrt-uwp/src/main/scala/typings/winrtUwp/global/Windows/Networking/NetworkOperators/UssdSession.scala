package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a session of the USSD network protocol. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
abstract class UssdSession ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.UssdSession
/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
object UssdSession extends js.Object {
  
  /**
    * Creates a USSD session for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the USSD session.
    * @return The USSD session for the mobile device associated with the supplied network account ID.
    */
  def createFromNetworkAccountId(networkAccountId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.UssdSession = js.native
  
  /**
    * Creates a USSD session for the mobile device associated with the supplied network interface ID.
    * @param networkInterfaceId The network interface ID to use to select the corresponding mobile broadband device to use for the USSD session.
    * @return The USSD session for the mobile device associated with the supplied network interface ID.
    */
  def createFromNetworkInterfaceId(networkInterfaceId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.UssdSession = js.native
}
