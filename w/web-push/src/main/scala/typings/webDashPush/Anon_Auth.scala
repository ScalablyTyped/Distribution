package typings.webDashPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auth extends js.Object {
  var auth: String
  var p256dh: String
}

object Anon_Auth {
  @scala.inline
  def apply(auth: String, p256dh: String): Anon_Auth = {
    val __obj = js.Dynamic.literal(auth = auth, p256dh = p256dh)
  
    __obj.asInstanceOf[Anon_Auth]
  }
}

