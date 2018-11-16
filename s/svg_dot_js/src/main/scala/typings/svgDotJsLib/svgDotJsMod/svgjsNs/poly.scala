package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// poly.js
@js.native
trait poly extends Shape {
  def array(): PointArray = js.native
  def move(x: scala.Double, y: scala.Double): this.type = js.native
  def plot(p: PointArrayAlias): this.type = js.native
  def size(width: scala.Double, height: scala.Double): this.type = js.native
}

