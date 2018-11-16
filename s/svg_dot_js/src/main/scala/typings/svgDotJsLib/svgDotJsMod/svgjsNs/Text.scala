package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends Shape {
  def build(enabled: scala.Boolean): this.type = js.native
  def clear(): this.type = js.native
  def font(font: FontData): this.type = js.native
  def leading(): scala.Double = js.native
  def leading(leading: NumberAlias): this.type = js.native
  def length(): scala.Double = js.native
  def lines(): Set = js.native
  def path(d: PathArrayAlias): this.type = js.native
  def plain(text: java.lang.String): this.type = js.native
  def rebuild(enabled: scala.Boolean): this.type = js.native
  def text(): java.lang.String = js.native
  def text(block: js.Function1[/* text */ this.type, scala.Unit]): this.type = js.native
  def text(text: java.lang.String): this.type = js.native
  def textPath(): Element = js.native
  def track(): Element = js.native
  def tspan(block: js.Function1[/* tspan */ Tspan, scala.Unit]): this.type = js.native
  def tspan(text: java.lang.String): Tspan = js.native
}

