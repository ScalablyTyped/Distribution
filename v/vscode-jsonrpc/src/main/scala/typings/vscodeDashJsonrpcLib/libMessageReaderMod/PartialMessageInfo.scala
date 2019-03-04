package typings
package vscodeDashJsonrpcLib.libMessageReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialMessageInfo extends js.Object {
  val messageToken: scala.Double
  val waitingTime: scala.Double
}

object PartialMessageInfo {
  @scala.inline
  def apply(messageToken: scala.Double, waitingTime: scala.Double): PartialMessageInfo = {
    val __obj = js.Dynamic.literal(messageToken = messageToken, waitingTime = waitingTime)
  
    __obj.asInstanceOf[PartialMessageInfo]
  }
}

