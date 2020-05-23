package typings.vkOpenapi.vk.OpenAPI.Auth

import typings.vkOpenapi.anon.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var expire: Double
  var mid: Double
  var secret: String
  var sid: String
  var sig: String
  var user: Domain
}

object Session {
  @scala.inline
  def apply(expire: Double, mid: Double, secret: String, sid: String, sig: String, user: Domain): Session = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

