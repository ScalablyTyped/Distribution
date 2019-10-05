package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
class UssdSession () extends IUssdSession {
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def sendMessageAndGetReplyAsync(message: UssdMessage): IAsyncOperation[UssdReply] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
object UssdSession extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): UssdSession = js.native
  def createFromNetworkInterfaceId(networkInterfaceId: String): UssdSession = js.native
}

