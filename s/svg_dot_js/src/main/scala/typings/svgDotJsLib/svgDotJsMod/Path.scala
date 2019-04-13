package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends Shape {
  var morphArray: PathArray = js.native
  def array(): PathArray = js.native
  def length(): scala.Double = js.native
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
  def plot(d: PathArrayAlias): this.type = js.native
  def pointAt(length: scala.Double): svgDotJsLib.Anon_X = js.native
}

