package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTime extends js.Object {
  var createTime: Double
  var filePath: String
  var size: Double
}

object CreateTime {
  @scala.inline
  def apply(createTime: Double, filePath: String, size: Double): CreateTime = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTime]
  }
}

