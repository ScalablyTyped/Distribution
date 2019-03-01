package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasId extends js.Object {
  var canvasId: java.lang.String
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_CanvasId {
  @scala.inline
  def apply(
    canvasId: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Anon_CanvasId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canvasId")(canvasId)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_CanvasId]
  }
}

