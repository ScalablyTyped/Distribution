package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdSession extends js.Object {
  def close(): scala.Unit
  def sendMessageAndGetReplyAsync(message: UssdMessage): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UssdReply]
}

object IUssdSession {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    sendMessageAndGetReplyAsync: UssdMessage => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UssdReply]
  ): IUssdSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendMessageAndGetReplyAsync = js.Any.fromFunction1(sendMessageAndGetReplyAsync))
  
    __obj.asInstanceOf[IUssdSession]
  }
}

