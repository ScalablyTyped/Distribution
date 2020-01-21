package typings.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends Parent {
  def circle(): Circle = js.native
  def circle(size: Double): Circle = js.native
  def clip(): ClipPath = js.native
  def ellipse(): Ellipse = js.native
  def ellipse(width: Double): Ellipse = js.native
  def ellipse(width: Double, height: Double): Ellipse = js.native
  def gradient(`type`: String): Gradient = js.native
  def gradient(`type`: String, block: js.Function1[/* stop */ Gradient, Unit]): Gradient = js.native
  def group(): G = js.native
  def image(): Image = js.native
  def image(href: String): Image = js.native
  def image(href: String, size: Double): Image = js.native
  def image(href: String, width: Double, height: Double): Image = js.native
  def line(points: PointArrayAlias): Line = js.native
  def line(x1: Double, y1: Double, x2: Double, y2: Double): Line = js.native
  def link(url: String): A = js.native
  def marker(): Marker = js.native
  def marker(width: Double): Marker = js.native
  def marker(width: Double, height: Double): Marker = js.native
  def marker(width: Double, height: Double, block: js.Function1[/* marker */ Marker, Unit]): Marker = js.native
  def mask(): Mask = js.native
  def nested(): Nested = js.native
  def path(): Path = js.native
  def path(d: PathArrayAlias): Path = js.native
  def pattern(): Pattern = js.native
  def pattern(width: Double): Pattern = js.native
  def pattern(width: Double, height: Double): Pattern = js.native
  def pattern(width: Double, height: Double, block: js.Function1[/* pattern */ Pattern, Unit]): Pattern = js.native
  def plain(text: String): Text = js.native
  def polygon(points: PointArrayAlias): Polygon = js.native
  def polyline(points: PointArrayAlias): PolyLine_ = js.native
  def rect(): Rect = js.native
  def rect(width: Double): Rect = js.native
  def rect(width: Double, height: Double): Rect = js.native
  def set(): Set = js.native
  def set(members: js.Array[Element]): Set = js.native
  def text(block: js.Function1[/* tspan */ Tspan, Unit]): Text = js.native
  def text(text: String): Text = js.native
  def use(element: String): Use = js.native
  def use(element: String, file: String): Use = js.native
  def use(element: Element): Use = js.native
  def use(element: Element, file: String): Use = js.native
  def viewbox(): ViewBox = js.native
  def viewbox(viewbox: ViewBoxLike): this.type = js.native
  def viewbox(x: Double, y: Double, width: Double, height: Double): this.type = js.native
}

