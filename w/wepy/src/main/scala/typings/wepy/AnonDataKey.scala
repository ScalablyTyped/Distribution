package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataKey extends js.Object {
  var data: String | js.Object
  var key: String
}

object AnonDataKey {
  @scala.inline
  def apply(data: String | js.Object, key: String): AnonDataKey = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataKey]
  }
}

