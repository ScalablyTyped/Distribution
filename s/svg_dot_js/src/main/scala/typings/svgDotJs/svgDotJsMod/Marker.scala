package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Marker extends Container {
  def ref(x: String, y: String): this.type = js.native
  def ref(x: String, y: Double): this.type = js.native
  def ref(x: Double, y: String): this.type = js.native
  def ref(x: Double, y: Double): this.type = js.native
  def update(block: js.Function1[/* marker */ this.type, Unit]): this.type = js.native
}

