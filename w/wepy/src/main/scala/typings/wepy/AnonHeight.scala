package typings.wepy

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var canvasId: String
  var data: Uint8ClampedArray
  var height: js.UndefOr[Double] = js.undefined
  var wdith: Double
  var x: Double
  var y: Double
}

object AnonHeight {
  @scala.inline
  def apply(
    canvasId: String,
    data: Uint8ClampedArray,
    wdith: Double,
    x: Double,
    y: Double,
    height: Int | Double = null
  ): AnonHeight = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], wdith = wdith.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

