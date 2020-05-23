package typings.wepy.anon

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var canvasId: String
  var data: Uint8ClampedArray
  var height: js.UndefOr[Double] = js.undefined
  var wdith: Double
  var x: Double
  var y: Double
}

object Height {
  @scala.inline
  def apply(
    canvasId: String,
    data: Uint8ClampedArray,
    wdith: Double,
    x: Double,
    y: Double,
    height: js.UndefOr[Double] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], wdith = wdith.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

