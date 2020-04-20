package typings.vscodeLanguageclient.clientMod

import typings.std.Error
import typings.vscodeJsonrpc.messagesMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHandler extends js.Object {
  /**
    * The connection to the server got closed.
    */
  def closed(): CloseAction
  /**
    * An error has occurred while writing or reading from the connection.
    *
    * @param error - the error received
    * @param message - the message to be delivered to the server if know.
    * @param count - a count indicating how often an error is received. Will
    *  be reset if a message got successfully send or received.
    */
  def error(error: Error, message: Message, count: Double): ErrorAction
}

object ErrorHandler {
  @scala.inline
  def apply(closed: () => CloseAction, error: (Error, Message, Double) => ErrorAction): ErrorHandler = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction3(error))
    __obj.asInstanceOf[ErrorHandler]
  }
}

