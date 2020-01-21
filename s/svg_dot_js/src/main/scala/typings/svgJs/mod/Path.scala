package typings.svgJs.mod

import typings.svgJs.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends Shape {
  var morphArray: PathArray = js.native
  def array(): PathArray = js.native
  def length(): Double = js.native
  def marker(position: String): Marker = js.native
  def marker(position: String, marker: Marker): Marker = js.native
  def marker(position: String, width: Double): Marker = js.native
  def marker(position: String, width: Double, height: Double): Marker = js.native
  def marker(position: String, width: Double, height: Double, block: js.Function1[/* marker */ Marker, Unit]): Marker = js.native
  def plot(d: PathArrayAlias): this.type = js.native
  def pointAt(length: Double): AnonX = js.native
}

