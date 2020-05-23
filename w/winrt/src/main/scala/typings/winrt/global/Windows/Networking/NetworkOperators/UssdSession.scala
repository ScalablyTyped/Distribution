package typings.winrt.global.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
class UssdSession ()
  extends typings.winrt.Windows.Networking.NetworkOperators.UssdSession {
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def sendMessageAndGetReplyAsync(message: typings.winrt.Windows.Networking.NetworkOperators.UssdMessage): IAsyncOperation[typings.winrt.Windows.Networking.NetworkOperators.UssdReply] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
object UssdSession extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): typings.winrt.Windows.Networking.NetworkOperators.UssdSession = js.native
  def createFromNetworkInterfaceId(networkInterfaceId: String): typings.winrt.Windows.Networking.NetworkOperators.UssdSession = js.native
}

