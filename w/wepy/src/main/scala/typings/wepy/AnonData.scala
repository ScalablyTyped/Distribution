package typings.wepy

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: Uint8ClampedArray
  var height: Double
  var width: Double
}

object AnonData {
  @scala.inline
  def apply(data: Uint8ClampedArray, height: Double, width: Double): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

