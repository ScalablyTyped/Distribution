package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a session of the USSD network protocol. */
@js.native
trait UssdSession extends js.Object {
  
  /** Closes the USSD session with the network. */
  def close(): Unit = js.native
  
  /**
    * Sends a message to a USSD session and returns a handler to retrieve the reply asynchronously.
    * @param message The message to send to the USSD session.
    * @return An asynchronous handler to retrieve the USSD response to the sent message.
    */
  def sendMessageAndGetReplyAsync(message: UssdMessage): IPromiseWithIAsyncOperation[UssdReply] = js.native
}
object UssdSession {
  
  @scala.inline
  def apply(
    close: () => Unit,
    sendMessageAndGetReplyAsync: UssdMessage => IPromiseWithIAsyncOperation[UssdReply]
  ): UssdSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendMessageAndGetReplyAsync = js.Any.fromFunction1(sendMessageAndGetReplyAsync))
    __obj.asInstanceOf[UssdSession]
  }
  
  @scala.inline
  implicit class UssdSessionOps[Self <: UssdSession] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSendMessageAndGetReplyAsync(value: UssdMessage => IPromiseWithIAsyncOperation[UssdReply]): Self = this.set("sendMessageAndGetReplyAsync", js.Any.fromFunction1(value))
  }
}
