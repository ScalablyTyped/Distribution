package typings.vscodeLanguageclient.clientMod

import typings.std.Error
import typings.vscodeJsonrpc.messagesMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorHandler extends js.Object {
  
  /**
    * The connection to the server got closed.
    */
  def closed(): CloseAction = js.native
  
  /**
    * An error has occurred while writing or reading from the connection.
    *
    * @param error - the error received
    * @param message - the message to be delivered to the server if know.
    * @param count - a count indicating how often an error is received. Will
    *  be reset if a message got successfully send or received.
    */
  def error(error: Error, message: Message, count: Double): ErrorAction = js.native
}
object ErrorHandler {
  
  @scala.inline
  def apply(closed: () => CloseAction, error: (Error, Message, Double) => ErrorAction): ErrorHandler = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction3(error))
    __obj.asInstanceOf[ErrorHandler]
  }
  
  @scala.inline
  implicit class ErrorHandlerOps[Self <: ErrorHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClosed(value: () => CloseAction): Self = this.set("closed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: (Error, Message, Double) => ErrorAction): Self = this.set("error", js.Any.fromFunction3(value))
  }
}
