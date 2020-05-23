package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataKey extends js.Object {
  var data: String | js.Object
  var key: String
}

object DataKey {
  @scala.inline
  def apply(data: String | js.Object, key: String): DataKey = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataKey]
  }
}

