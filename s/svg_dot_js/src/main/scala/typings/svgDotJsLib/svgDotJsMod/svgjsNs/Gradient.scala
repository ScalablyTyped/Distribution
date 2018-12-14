package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gradient
  extends Container
     with org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, Gradient] {
  def at(): Stop = js.native
  def at(offset: scala.Double): Stop = js.native
  def at(offset: scala.Double, color: ColorAlias): Stop = js.native
  def at(offset: scala.Double, color: ColorAlias, opacity: scala.Double): Stop = js.native
  def at(opts: StopProperties): Stop = js.native
  def fill(): java.lang.String = js.native
  def fill(params: js.Any*): scala.Nothing = js.native
  def from(x: scala.Double, y: scala.Double): this.type = js.native
  def radius(x: scala.Double): this.type = js.native
  def radius(x: scala.Double, y: scala.Double): this.type = js.native
  def to(x: scala.Double, y: scala.Double): this.type = js.native
  def update(): this.type = js.native
  def update(block: js.Function): this.type = js.native
}

