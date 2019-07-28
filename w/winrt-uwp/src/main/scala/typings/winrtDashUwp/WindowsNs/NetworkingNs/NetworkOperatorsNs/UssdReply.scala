package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the network response after sending a USSD message. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdReply")
@js.native
abstract class UssdReply () extends js.Object {
  /** Gets the message for the USSD response. */
  var message: UssdMessage = js.native
  /** Gets the result code for the USSD response. */
  var resultCode: UssdResultCode = js.native
}

