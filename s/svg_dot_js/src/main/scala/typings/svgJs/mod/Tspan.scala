package typings.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tspan extends Shape {
  def clear(): this.type = js.native
  def length(): Double = js.native
  def newLine(): this.type = js.native
  def plain(text: js.Any): this.type = js.native
  def text(): String = js.native
  def text(block: js.Function1[/* tspan */ this.type, Unit]): this.type = js.native
  def text(text: String): Tspan = js.native
  def tspan(block: js.Function1[/* tspan */ this.type, Unit]): this.type = js.native
  def tspan(text: String): Tspan = js.native
}

