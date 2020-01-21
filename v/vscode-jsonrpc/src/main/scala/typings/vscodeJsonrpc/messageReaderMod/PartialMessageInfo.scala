package typings.vscodeJsonrpc.messageReaderMod

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
    val __obj = js.Dynamic.literal(messageToken = messageToken.asInstanceOf[js.Any], waitingTime = waitingTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PartialMessageInfo]
  }
}

