package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// arrange.js
// attr.js
// data.js
// event.js
// memory.js
// style.js
// transform.js
@js.native
trait Element
  extends org.scalablytyped.runtime.Instantiable0[Element] {
  var clipper: ClipPath = js.native
  var masker: Mask = js.native
  var node: LinkedHTMLElement = js.native
  var `type`: java.lang.String = js.native
  def addClass(name: java.lang.String): this.type = js.native
  def addTo(parent: Parent): this.type = js.native
  def after(element: Element): Element = js.native
  def animate(): Animation = js.native
  def animate(duration: scala.Double): Animation = js.native
  def animate(duration: scala.Double, ease: java.lang.String): Animation = js.native
  def animate(duration: scala.Double, ease: java.lang.String, delay: scala.Double): Animation = js.native
  def animate(info: svgDotJsLib.Anon_Delay): Animation = js.native
  def attr(): js.Object = js.native
  def attr(name: java.lang.String): js.Any = js.native
  def attr(name: java.lang.String, value: js.Any): this.type = js.native
  def attr(name: java.lang.String, value: js.Any, namespace: java.lang.String): this.type = js.native
  def attr(obj: js.Object): this.type = js.native
  def back(): this.type = js.native
  def backward(): this.type = js.native
  def bbox(): BBox = js.native
  def before(element: Element): Element = js.native
  def center(x: scala.Double, y: scala.Double): this.type = js.native
  def classes(): js.Array[java.lang.String] = js.native
  def click(cb: js.Function): this.type = js.native
  def clipWith(element: Element): this.type = js.native
  def ctm(): Matrix = js.native
  def cx(): scala.Double = js.native
  //cx(x: number, anchor?: boolean): this;
  def cx(x: scala.Double): this.type = js.native
  def cy(): scala.Double = js.native
  //cy(y: number, anchor?: boolean): this;
  def cy(y: scala.Double): this.type = js.native
  def data(name: java.lang.String): js.Any = js.native
  def data(name: java.lang.String, value: js.Any): this.type = js.native
  def data(name: java.lang.String, value: js.Any, sustain: scala.Boolean): this.type = js.native
  def dblclick(cb: js.Function): this.type = js.native
  def dmove(x: NumberAlias, y: NumberAlias): this.type = js.native
  def doc(): Parent = js.native
  def dx(x: NumberAlias): this.type = js.native
  def dy(y: NumberAlias): this.type = js.native
  def event(): stdLib.Event | stdLib.CustomEvent[_] = js.native
  def fill(color: java.lang.String): this.type = js.native
  def fill(fill: svgDotJsLib.Anon_Rule): this.type = js.native
  def fill(image: Image): this.type = js.native
  def fill(pattern: Element): this.type = js.native
  def fire(event: java.lang.String): this.type = js.native
  def fire(event: java.lang.String, data: js.Any): this.type = js.native
  def fire(event: stdLib.Event): this.type = js.native
  def flip(): this.type = js.native
  def flip(a: java.lang.String): this.type = js.native
  def flip(a: java.lang.String, offset: scala.Double): this.type = js.native
  def flip(offset: scala.Double): this.type = js.native
  def forget(): this.type = js.native
  def forget(keys: java.lang.String*): this.type = js.native
  def forward(): this.type = js.native
  def front(): this.type = js.native
  def hasClass(name: java.lang.String): scala.Boolean = js.native
  def height(): scala.Double = js.native
  def height(height: NumberAlias): this.type = js.native
  def hide(): this.type = js.native
  def id(): java.lang.String = js.native
  def id(id: java.lang.String): this.type = js.native
  def inside(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def is(cls: js.Any): scala.Boolean = js.native
  def linkTo(url: java.lang.String): A = js.native
  def linkTo(url: js.Function1[/* link */ A, scala.Unit]): A = js.native
  def maskWith(element: Element): this.type = js.native
  def maskWith(mask: Mask): this.type = js.native
  def matches(selector: java.lang.String): scala.Boolean = js.native
  def matrix(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): this.type = js.native
  def matrix(m: MatrixAlias): this.type = js.native
  def matrixify(): Matrix = js.native
  def memory(): js.Object = js.native
  def mousedown(cb: js.Function): this.type = js.native
  def mousemove(cb: js.Function): this.type = js.native
  def mouseout(cb: js.Function): this.type = js.native
  def mouseover(cb: js.Function): this.type = js.native
  def mouseup(cb: js.Function): this.type = js.native
  def move(x: NumberAlias, y: NumberAlias): this.type = js.native
  def native(): LinkedHTMLElement = js.native
  def next(): Element = js.native
  def off(event: java.lang.String): this.type = js.native
  def off(event: java.lang.String, cb: js.Function): this.type = js.native
  def off(event: java.lang.String, cb: js.Function, context: js.Object): this.type = js.native
  def on(event: java.lang.String, cb: js.Function): this.type = js.native
  def on(event: java.lang.String, cb: js.Function, context: js.Object): this.type = js.native
  def opacity(): scala.Double = js.native
  def opacity(o: scala.Double): this.type = js.native
  // Add HTMLElement for Doc inheritance
  def parent(): Parent | stdLib.HTMLElement = js.native
  def parent(`type`: ParentTypeAlias): Parent | stdLib.HTMLElement = js.native
  def parents(): js.Array[Parent] = js.native
  def point(): Point = js.native
  def point(position: svgDotJsLib.Anon_Y): Point = js.native
  def point(position: ArrayPoint): Point = js.native
  def point(x: scala.Double, y: scala.Double): Point = js.native
  def position(): scala.Double = js.native
  def previous(): Element = js.native
  def putIn(parent: Parent): Parent = js.native
  def rbox(): RBox = js.native
  def rbox(element: Element): RBox = js.native
  def reference(`type`: java.lang.String): Element = js.native
  def remember(name: java.lang.String): js.Any = js.native
  def remember(name: java.lang.String, value: js.Any): this.type = js.native
  def remember(obj: js.Object): this.type = js.native
  def remove(): this.type = js.native
  def removeClass(name: java.lang.String): this.type = js.native
  def replace(element: Element): Element = js.native
  def rotate(d: scala.Double): this.type = js.native
  def rotate(d: scala.Double, cx: scala.Double): this.type = js.native
  def rotate(d: scala.Double, cx: scala.Double, cy: scala.Double): this.type = js.native
  def scale(x: scala.Double): this.type = js.native
  def scale(x: scala.Double, y: scala.Double): this.type = js.native
  def scale(x: scala.Double, y: scala.Double, cx: scala.Double): this.type = js.native
  def scale(x: scala.Double, y: scala.Double, cx: scala.Double, cy: scala.Double): this.type = js.native
  def screenCTM(): Matrix = js.native
  def setData(data: js.Object): this.type = js.native
  def show(): this.type = js.native
  def siblings(): js.Array[Element] = js.native
  def size(): this.type = js.native
  def size(width: NumberAlias): this.type = js.native
  def size(width: NumberAlias, height: NumberAlias): this.type = js.native
  def skew(x: scala.Double): this.type = js.native
  def skew(x: scala.Double, y: scala.Double): this.type = js.native
  def skew(x: scala.Double, y: scala.Double, cx: scala.Double): this.type = js.native
  def skew(x: scala.Double, y: scala.Double, cx: scala.Double, cy: scala.Double): this.type = js.native
  def stop(jumpToEnd: scala.Boolean, clearQueue: scala.Boolean): Animation = js.native
  def stroke(color: java.lang.String): this.type = js.native
  def stroke(stroke: StrokeData): this.type = js.native
  def style(style: java.lang.String): js.Any = js.native
  def style(style: java.lang.String, value: js.Any): this.type = js.native
  def style(styles: js.Object): this.type = js.native
  def svg(): java.lang.String = js.native
  def svg(svg: java.lang.String): this.type = js.native
  def tbox(): TBox = js.native
  def toDoc(): this.type = js.native
  def toParent(parent: Parent): this.type = js.native
  def toggleClass(name: java.lang.String): this.type = js.native
  def touchcancel(cb: js.Function): this.type = js.native
  def touchend(cb: js.Function): this.type = js.native
  def touchleave(cb: js.Function): this.type = js.native
  def touchmove(cb: js.Function): this.type = js.native
  def touchstart(cb: js.Function): this.type = js.native
  def transform(): Transform = js.native
  def transform(t: Transform): Element = js.native
  def transform(t: Transform, relative: scala.Boolean): Element = js.native
  def translate(x: scala.Double, y: scala.Double): this.type = js.native
  def unclip(): this.type = js.native
  def unmask(): this.type = js.native
  def untransform(): this.type = js.native
  def visible(): scala.Boolean = js.native
  def width(): scala.Double = js.native
  def width(width: NumberAlias): this.type = js.native
  def writeDataToDom(): this.type = js.native
  def x(): scala.Double = js.native
  def x(x: NumberAlias): this.type = js.native
  def y(): scala.Double = js.native
  def y(y: NumberAlias): this.type = js.native
}

