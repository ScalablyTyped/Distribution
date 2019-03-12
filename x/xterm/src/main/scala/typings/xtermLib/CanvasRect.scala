package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRect extends js.Object {
  def clearRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit
  def fillRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit
  def strokeRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit
}

object CanvasRect {
  @scala.inline
  def apply(
    clearRect: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    fillRect: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    strokeRect: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit
  ): CanvasRect = {
    val __obj = js.Dynamic.literal(clearRect = js.Any.fromFunction4(clearRect), fillRect = js.Any.fromFunction4(fillRect), strokeRect = js.Any.fromFunction4(strokeRect))
  
    __obj.asInstanceOf[CanvasRect]
  }
}

