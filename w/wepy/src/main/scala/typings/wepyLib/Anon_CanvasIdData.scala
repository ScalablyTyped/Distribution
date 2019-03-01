package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasIdData extends js.Object {
  var canvasId: java.lang.String
  var data: stdLib.Uint8ClampedArray
  var height: js.UndefOr[scala.Double] = js.undefined
  var wdith: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_CanvasIdData {
  @scala.inline
  def apply(
    canvasId: java.lang.String,
    data: stdLib.Uint8ClampedArray,
    wdith: scala.Double,
    x: scala.Double,
    y: scala.Double,
    height: scala.Int | scala.Double = null
  ): Anon_CanvasIdData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canvasId")(canvasId)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("wdith")(wdith)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CanvasIdData]
  }
}

