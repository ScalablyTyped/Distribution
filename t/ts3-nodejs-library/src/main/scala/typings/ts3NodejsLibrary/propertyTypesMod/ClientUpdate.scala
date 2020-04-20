package typings.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUpdate extends js.Object {
  var client_nickname: String
}

object ClientUpdate {
  @scala.inline
  def apply(client_nickname: String): ClientUpdate = {
    val __obj = js.Dynamic.literal(client_nickname = client_nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientUpdate]
  }
}

