package typings.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientEdit extends js.Object {
  var client_description: js.UndefOr[String] = js.undefined
  var client_is_talker: js.UndefOr[Double] = js.undefined
}

object ClientEdit {
  @scala.inline
  def apply(client_description: String = null, client_is_talker: Int | Double = null): ClientEdit = {
    val __obj = js.Dynamic.literal()
    if (client_description != null) __obj.updateDynamic("client_description")(client_description.asInstanceOf[js.Any])
    if (client_is_talker != null) __obj.updateDynamic("client_is_talker")(client_is_talker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientEdit]
  }
}

