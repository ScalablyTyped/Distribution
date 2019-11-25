package typings.stripejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientsecret extends js.Object {
  var client_secret: String
  var id: String
}

object Anon_Clientsecret {
  @scala.inline
  def apply(client_secret: String, id: String): Anon_Clientsecret = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Clientsecret]
  }
}

