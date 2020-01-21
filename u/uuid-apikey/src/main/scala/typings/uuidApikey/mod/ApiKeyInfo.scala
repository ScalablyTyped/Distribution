package typings.uuidApikey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyInfo extends js.Object {
  var apiKey: String
  var uuid: String
}

object ApiKeyInfo {
  @scala.inline
  def apply(apiKey: String, uuid: String): ApiKeyInfo = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApiKeyInfo]
  }
}

