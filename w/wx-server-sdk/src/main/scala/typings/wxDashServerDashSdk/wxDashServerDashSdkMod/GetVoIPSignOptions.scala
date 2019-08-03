package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVoIPSignOptions extends js.Object {
  var groupId: String
  var nonce: String
  var timestamp: Double
}

object GetVoIPSignOptions {
  @scala.inline
  def apply(groupId: String, nonce: String, timestamp: Double): GetVoIPSignOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId, nonce = nonce, timestamp = timestamp)
  
    __obj.asInstanceOf[GetVoIPSignOptions]
  }
}

