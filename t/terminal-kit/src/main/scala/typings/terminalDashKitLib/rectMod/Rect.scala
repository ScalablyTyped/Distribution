package typings
package terminalDashKitLib.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  val height: scala.Double
  val isNull: scala.Boolean
  val width: scala.Double
  val xmax: scala.Double
  val xmin: scala.Double
  val ymax: scala.Double
  val ymin: scala.Double
  def clip(dstRect: Rect, offsetX: scala.Double, offsetY: scala.Double, dstClipping: scala.Boolean): scala.Unit
  def set(obj: terminalDashKitLib.rectMod.RectNs.Region): scala.Unit
}

object Rect {
  @scala.inline
  def apply(
    clip: js.Function4[Rect, scala.Double, scala.Double, scala.Boolean, scala.Unit],
    height: scala.Double,
    isNull: scala.Boolean,
    set: js.Function1[terminalDashKitLib.rectMod.RectNs.Region, scala.Unit],
    width: scala.Double,
    xmax: scala.Double,
    xmin: scala.Double,
    ymax: scala.Double,
    ymin: scala.Double
  ): Rect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clip")(clip)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("isNull")(isNull)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("xmax")(xmax)
    __obj.updateDynamic("xmin")(xmin)
    __obj.updateDynamic("ymax")(ymax)
    __obj.updateDynamic("ymin")(ymin)
    __obj.asInstanceOf[Rect]
  }
}

