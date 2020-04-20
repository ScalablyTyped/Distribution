package typings.stripejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientsecret extends js.Object {
  var client_secret: String
  var id: String
}

object AnonClientsecret {
  @scala.inline
  def apply(client_secret: String, id: String): AnonClientsecret = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientsecret]
  }
}

