package typings.terminalDashKit.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  val height: Double
  val isNull: Boolean
  val width: Double
  val xmax: Double
  val xmin: Double
  val ymax: Double
  val ymin: Double
  def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit
  def set(obj: Region): Unit
}

object Rect {
  @scala.inline
  def apply(
    clip: (Rect, Double, Double, Boolean) => Unit,
    height: Double,
    isNull: Boolean,
    set: Region => Unit,
    width: Double,
    xmax: Double,
    xmin: Double,
    ymax: Double,
    ymin: Double
  ): Rect = {
    val __obj = js.Dynamic.literal(clip = js.Any.fromFunction4(clip), height = height, isNull = isNull, set = js.Any.fromFunction1(set), width = width, xmax = xmax, xmin = xmin, ymax = ymax, ymin = ymin)
  
    __obj.asInstanceOf[Rect]
  }
}

