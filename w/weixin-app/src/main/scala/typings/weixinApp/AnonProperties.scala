package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperties extends js.Object {
  var properties: js.Array[AnonIndicate]
  var uuid: String
}

object AnonProperties {
  @scala.inline
  def apply(properties: js.Array[AnonIndicate], uuid: String): AnonProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProperties]
  }
}

