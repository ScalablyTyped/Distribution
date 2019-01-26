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

