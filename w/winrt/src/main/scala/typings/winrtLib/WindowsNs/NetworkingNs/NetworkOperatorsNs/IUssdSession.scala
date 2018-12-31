package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdSession extends js.Object {
  def close(): scala.Unit
  def sendMessageAndGetReplyAsync(message: UssdMessage): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UssdReply]
}

