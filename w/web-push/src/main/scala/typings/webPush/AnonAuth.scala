package typings.webPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuth extends js.Object {
  var auth: String
  var p256dh: String
}

object AnonAuth {
  @scala.inline
  def apply(auth: String, p256dh: String): AnonAuth = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuth]
  }
}

