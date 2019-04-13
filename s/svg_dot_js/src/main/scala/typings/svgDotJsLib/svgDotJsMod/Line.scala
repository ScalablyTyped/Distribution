package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line extends Shape {
  def array(): PointArray = js.native
  def marker(position: java.lang.String): Marker = js.native
  def marker(position: java.lang.String, marker: Marker): Marker = js.native
  def marker(position: java.lang.String, width: scala.Double): Marker = js.native
  def marker(position: java.lang.String, width: scala.Double, height: scala.Double): Marker = js.native
  def marker(
    position: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    block: js.Function1[/* marker */ Marker, scala.Unit]
  ): Marker = js.native
  def move(x: scala.Double, y: scala.Double): this.type = js.native
  def plot(points: PointArrayAlias): this.type = js.native
  def plot(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): this.type = js.native
  def size(width: scala.Double): this.type = js.native
  def size(width: scala.Double, height: scala.Double): this.type = js.native
}

