package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenOptions extends js.Object {
  var identity: String
  var nbf: Double
  var ttl: Double
}

object AccessTokenOptions {
  @scala.inline
  def apply(identity: String, nbf: Double, ttl: Double): AccessTokenOptions = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], nbf = nbf.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenOptions]
  }
}

