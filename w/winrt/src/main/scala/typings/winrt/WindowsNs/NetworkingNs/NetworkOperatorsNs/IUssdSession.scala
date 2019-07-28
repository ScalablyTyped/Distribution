package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdSession extends js.Object {
  def close(): Unit
  def sendMessageAndGetReplyAsync(message: UssdMessage): IAsyncOperation[UssdReply]
}

object IUssdSession {
  @scala.inline
  def apply(close: () => Unit, sendMessageAndGetReplyAsync: UssdMessage => IAsyncOperation[UssdReply]): IUssdSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendMessageAndGetReplyAsync = js.Any.fromFunction1(sendMessageAndGetReplyAsync))
  
    __obj.asInstanceOf[IUssdSession]
  }
}

