package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UssdResultCode extends js.Object

/** Describes the USSD response codes for messages sent to the network. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
@js.native
object UssdResultCode extends js.Object {
  /** The USSD message that was received is either a USSD request from the network or a response to a message sent to the network. Additional information is needed. The USSD session is open. */
  @js.native
  sealed trait actionRequired
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  /** The USSD session has been closed because there was no response from the network. */
  @js.native
  sealed trait networkTimeout
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  /** The USSD message that was received is either a USSD notification from the network or a response to an earlier request. No further information is necessary. The USSD session is closed. */
  @js.native
  sealed trait noActionRequired
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  /** The previous USSD request failed because the request was invalid or cannot be handled by the driver, device, or network. */
  @js.native
  sealed trait operationNotSupported
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  /** The previous USSD request failed because another local client has an active USSD session. */
  @js.native
  sealed trait otherLocalClient
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  /** The USSD session has been terminated by the network or a local client. */
  @js.native
  sealed trait terminated
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  val actionRequired: actionRequired with java.lang.String = js.native
  val networkTimeout: networkTimeout with java.lang.String = js.native
  val noActionRequired: noActionRequired with java.lang.String = js.native
  val operationNotSupported: operationNotSupported with java.lang.String = js.native
  val otherLocalClient: otherLocalClient with java.lang.String = js.native
  val terminated: terminated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode with java.lang.String
  ] = js.native
}

