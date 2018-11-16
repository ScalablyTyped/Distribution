package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends Parent {
  def circle(): Circle = js.native
  def circle(size: scala.Double): Circle = js.native
  def clip(): ClipPath = js.native
  def ellipse(): Ellipse = js.native
  def ellipse(width: scala.Double): Ellipse = js.native
  def ellipse(width: scala.Double, height: scala.Double): Ellipse = js.native
  def gradient(`type`: java.lang.String): Gradient = js.native
  def gradient(`type`: java.lang.String, block: js.Function1[/* stop */ Gradient, scala.Unit]): Gradient = js.native
  def group(): G = js.native
  def image(): Image = js.native
  def image(href: java.lang.String): Image = js.native
  def image(href: java.lang.String, size: scala.Double): Image = js.native
  def image(href: java.lang.String, width: scala.Double, height: scala.Double): Image = js.native
  def line(points: PointArrayAlias): Line = js.native
  def line(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): Line = js.native
  def link(url: java.lang.String): A = js.native
  def marker(): Marker = js.native
  def marker(width: scala.Double): Marker = js.native
  def marker(width: scala.Double, height: scala.Double): Marker = js.native
  def marker(width: scala.Double, height: scala.Double, block: js.Function1[/* marker */ Marker, scala.Unit]): Marker = js.native
  def mask(): Mask = js.native
  def nested(): Nested = js.native
  def path(): Path = js.native
  def path(d: PathArrayAlias): Path = js.native
  def pattern(): Pattern = js.native
  def pattern(width: scala.Double): Pattern = js.native
  def pattern(width: scala.Double, height: scala.Double): Pattern = js.native
  def pattern(width: scala.Double, height: scala.Double, block: js.Function1[/* pattern */ Pattern, scala.Unit]): Pattern = js.native
  def plain(text: java.lang.String): Text = js.native
  def polygon(points: PointArrayAlias): Polygon = js.native
  def polyline(points: PointArrayAlias): PolyLine = js.native
  def rect(): Rect = js.native
  def rect(width: scala.Double): Rect = js.native
  def rect(width: scala.Double, height: scala.Double): Rect = js.native
  def set(): Set = js.native
  def set(members: js.Array[Element]): Set = js.native
  def text(block: js.Function1[/* tspan */ Tspan, scala.Unit]): Text = js.native
  def text(text: java.lang.String): Text = js.native
  def use(element: java.lang.String): Use = js.native
  def use(element: java.lang.String, file: java.lang.String): Use = js.native
  def use(element: Element): Use = js.native
  def use(element: Element, file: java.lang.String): Use = js.native
  def viewbox(): ViewBox = js.native
  def viewbox(viewbox: ViewBoxLike): this.type = js.native
  def viewbox(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): this.type = js.native
}

