package typings.vscodeDashJsonrpc.libMessageReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialMessageInfo extends js.Object {
  val messageToken: Double
  val waitingTime: Double
}

object PartialMessageInfo {
  @scala.inline
  def apply(messageToken: Double, waitingTime: Double): PartialMessageInfo = {
    val __obj = js.Dynamic.literal(messageToken = messageToken, waitingTime = waitingTime)
  
    __obj.asInstanceOf[PartialMessageInfo]
  }
}

