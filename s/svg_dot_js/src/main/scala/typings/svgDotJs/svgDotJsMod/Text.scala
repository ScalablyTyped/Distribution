package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends Shape {
  def build(enabled: Boolean): this.type = js.native
  def clear(): this.type = js.native
  def font(font: FontData): this.type = js.native
  def leading(): Double = js.native
  def leading(leading: NumberAlias): this.type = js.native
  def length(): Double = js.native
  def lines(): Set = js.native
  def path(d: PathArrayAlias): this.type = js.native
  def plain(text: String): this.type = js.native
  def rebuild(enabled: Boolean): this.type = js.native
  def text(): String = js.native
  def text(block: js.Function1[/* text */ this.type, Unit]): this.type = js.native
  def text(text: String): this.type = js.native
  def textPath(): Element = js.native
  def track(): Element = js.native
  def tspan(block: js.Function1[/* tspan */ Tspan, Unit]): this.type = js.native
  def tspan(text: String): Tspan = js.native
}

