package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var maxMessageSize: Double
  var memory: Double
  var messages: Double
  var minPow: Double
}

object Info {
  @scala.inline
  def apply(maxMessageSize: Double, memory: Double, messages: Double, minPow: Double): Info = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], minPow = minPow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Info]
  }
}

