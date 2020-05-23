package typings.webPush.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  var auth: String
  var p256dh: String
}

object Auth {
  @scala.inline
  def apply(auth: String, p256dh: String): Auth = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
}

