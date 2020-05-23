package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: Double
  var height: Double
  var size: Double
  var tempFilePath: String
  var width: Double
}

object Duration {
  @scala.inline
  def apply(duration: Double, height: Double, size: Double, tempFilePath: String, width: Double): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

