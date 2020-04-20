package typings.twilioSync.serverapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishMessageResponse extends js.Object {
  var sid: String
}

object PublishMessageResponse {
  @scala.inline
  def apply(sid: String): PublishMessageResponse = {
    val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishMessageResponse]
  }
}

