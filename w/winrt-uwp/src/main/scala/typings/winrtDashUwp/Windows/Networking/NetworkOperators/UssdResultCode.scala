package typings.winrtDashUwp.Windows.Networking.NetworkOperators

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
  sealed trait actionRequired extends UssdResultCode
  
  /** The USSD session has been closed because there was no response from the network. */
  @js.native
  sealed trait networkTimeout extends UssdResultCode
  
  /** The USSD message that was received is either a USSD notification from the network or a response to an earlier request. No further information is necessary. The USSD session is closed. */
  @js.native
  sealed trait noActionRequired extends UssdResultCode
  
  /** The previous USSD request failed because the request was invalid or cannot be handled by the driver, device, or network. */
  @js.native
  sealed trait operationNotSupported extends UssdResultCode
  
  /** The previous USSD request failed because another local client has an active USSD session. */
  @js.native
  sealed trait otherLocalClient extends UssdResultCode
  
  /** The USSD session has been terminated by the network or a local client. */
  @js.native
  sealed trait terminated extends UssdResultCode
  
  /* 1 */ val actionRequired: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UssdResultCode.actionRequired with Double = js.native
  /* 5 */ val networkTimeout: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UssdResultCode.networkTimeout with Double = js.native
  /* 0 */ val noActionRequired: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UssdResultCode.noActionRequired with Double = js.native
  /* 4 */ val operationNotSupported: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UssdResultCode.operationNotSupported with Double = js.native
  /* 3 */ val otherLocalClient: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UssdResultCode.otherLocalClient with Double = js.native
  /* 2 */ val terminated: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UssdResultCode.terminated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UssdResultCode with Double] = js.native
}

