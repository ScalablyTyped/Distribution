package typings.web3DashShh.web3DashShhMod

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
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize, memory = memory, messages = messages, minPow = minPow)
  
    __obj.asInstanceOf[Info]
  }
}

