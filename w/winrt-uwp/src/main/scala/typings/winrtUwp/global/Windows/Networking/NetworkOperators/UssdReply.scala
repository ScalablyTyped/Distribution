package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the network response after sending a USSD message. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdReply")
@js.native
abstract class UssdReply ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.UssdReply {
  /** Gets the message for the USSD response. */
  /* CompleteClass */
  override var message: typings.winrtUwp.Windows.Networking.NetworkOperators.UssdMessage = js.native
  /** Gets the result code for the USSD response. */
  /* CompleteClass */
  override var resultCode: typings.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode = js.native
}

