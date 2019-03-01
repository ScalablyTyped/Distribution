package typings
package stripejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientsecret extends js.Object {
  var client_secret: java.lang.String
  var id: java.lang.String
}

object Anon_Clientsecret {
  @scala.inline
  def apply(client_secret: java.lang.String, id: java.lang.String): Anon_Clientsecret = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client_secret")(client_secret)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Clientsecret]
  }
}

