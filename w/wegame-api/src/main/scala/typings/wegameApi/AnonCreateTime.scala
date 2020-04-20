package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateTime extends js.Object {
  var createTime: Double
  var filePath: String
  var size: Double
}

object AnonCreateTime {
  @scala.inline
  def apply(createTime: Double, filePath: String, size: Double): AnonCreateTime = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreateTime]
  }
}

