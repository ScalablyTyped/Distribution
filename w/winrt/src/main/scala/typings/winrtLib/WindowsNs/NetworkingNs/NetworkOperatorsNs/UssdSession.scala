package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
class UssdSession () extends IUssdSession {
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def sendMessageAndGetReplyAsync(message: UssdMessage): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UssdReply] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
object UssdSession extends js.Object {
  def createFromNetworkAccountId(networkAccountId: java.lang.String): winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdSession = js.native
  def createFromNetworkInterfaceId(networkInterfaceId: java.lang.String): winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdSession = js.native
}

