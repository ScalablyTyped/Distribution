package typings.wepy

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasIdData extends js.Object {
  var canvasId: String
  var data: Uint8ClampedArray
  var height: js.UndefOr[Double] = js.undefined
  var wdith: Double
  var x: Double
  var y: Double
}

object Anon_CanvasIdData {
  @scala.inline
  def apply(
    canvasId: String,
    data: Uint8ClampedArray,
    wdith: Double,
    x: Double,
    y: Double,
    height: Int | Double = null
  ): Anon_CanvasIdData = {
    val __obj = js.Dynamic.literal(canvasId = canvasId, data = data, wdith = wdith, x = x, y = y)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CanvasIdData]
  }
}

