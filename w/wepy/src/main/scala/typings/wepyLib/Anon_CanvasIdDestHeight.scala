package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasIdDestHeight extends js.Object {
  var canvasId: java.lang.String
  var destHeight: scala.Double
  var destWidth: scala.Double
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_CanvasIdDestHeight {
  @scala.inline
  def apply(
    canvasId: java.lang.String,
    destHeight: scala.Double,
    destWidth: scala.Double,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Anon_CanvasIdDestHeight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canvasId")(canvasId)
    __obj.updateDynamic("destHeight")(destHeight)
    __obj.updateDynamic("destWidth")(destWidth)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_CanvasIdDestHeight]
  }
}

