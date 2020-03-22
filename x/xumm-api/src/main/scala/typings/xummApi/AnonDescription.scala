package typings.xummApi

import typings.xummApi.xummApiNumbers.`0`
import typings.xummApi.xummApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: String
  var disabled: `0` | `1`
  var icon_url: String
  var issued_user_token: String | Null
  var name: String
  var uuidv4: String
}

object AnonDescription {
  @scala.inline
  def apply(
    description: String,
    disabled: `0` | `1`,
    icon_url: String,
    name: String,
    uuidv4: String,
    issued_user_token: String = null
  ): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], icon_url = icon_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uuidv4 = uuidv4.asInstanceOf[js.Any])
    if (issued_user_token != null) __obj.updateDynamic("issued_user_token")(issued_user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

