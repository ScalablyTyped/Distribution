package typings.svgJs.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gradient
  extends Container
     with Instantiable1[/* type */ String, Gradient] {
  def at(): Stop = js.native
  def at(offset: Double): Stop = js.native
  def at(offset: Double, color: ColorAlias): Stop = js.native
  def at(offset: Double, color: ColorAlias, opacity: Double): Stop = js.native
  def at(opts: StopProperties): Stop = js.native
  def fill(): String = js.native
  def fill(params: js.Any*): scala.Nothing = js.native
  def from(x: Double, y: Double): this.type = js.native
  def radius(x: Double): this.type = js.native
  def radius(x: Double, y: Double): this.type = js.native
  def to(x: Double, y: Double): this.type = js.native
  def update(): this.type = js.native
  def update(block: js.Function): this.type = js.native
}

