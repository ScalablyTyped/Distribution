package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasPath extends js.Object {
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double
  ): scala.Unit = js.native
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): scala.Unit = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, radius: scala.Double): scala.Unit = js.native
  def bezierCurveTo(
    cp1x: scala.Double,
    cp1y: scala.Double,
    cp2x: scala.Double,
    cp2y: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def closePath(): scala.Unit = js.native
  def ellipse(
    x: scala.Double,
    y: scala.Double,
    radiusX: scala.Double,
    radiusY: scala.Double,
    rotation: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double
  ): scala.Unit = js.native
  def ellipse(
    x: scala.Double,
    y: scala.Double,
    radiusX: scala.Double,
    radiusY: scala.Double,
    rotation: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): scala.Unit = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def rect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
}

