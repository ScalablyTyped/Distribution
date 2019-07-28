package typings.svgDotJs.svgDotJsMod

import org.scalablytyped.runtime.Instantiable0
import typings.std.CustomEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.svgDotJs.Anon_Color
import typings.svgDotJs.Anon_Delay
import typings.svgDotJs.Anon_X
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
  extends _MatrixAlias
     with _ViewBoxAlias
     with Instantiable0[Element] {
  var clipper: ClipPath = js.native
  var masker: Mask = js.native
  var node: LinkedHTMLElement = js.native
  var `type`: String = js.native
  def addClass(name: String): this.type = js.native
  def addTo(parent: Parent): this.type = js.native
  def after(element: Element): Element = js.native
  def animate(): Animation = js.native
  def animate(duration: Double): Animation = js.native
  def animate(duration: Double, ease: String): Animation = js.native
  def animate(duration: Double, ease: String, delay: Double): Animation = js.native
  def animate(info: Anon_Delay): Animation = js.native
  def attr(): js.Object = js.native
  def attr(name: String): js.Any = js.native
  def attr(name: String, value: js.Any): this.type = js.native
  def attr(name: String, value: js.Any, namespace: String): this.type = js.native
  def attr(obj: js.Object): this.type = js.native
  def back(): this.type = js.native
  def backward(): this.type = js.native
  def bbox(): BBox = js.native
  def before(element: Element): Element = js.native
  def center(x: Double, y: Double): this.type = js.native
  def classes(): js.Array[String] = js.native
  def click(cb: js.Function): this.type = js.native
  def clipWith(element: Element): this.type = js.native
  def ctm(): Matrix = js.native
  def cx(): Double = js.native
  //cx(x: number, anchor?: boolean): this;
  def cx(x: Double): this.type = js.native
  def cy(): Double = js.native
  //cy(y: number, anchor?: boolean): this;
  def cy(y: Double): this.type = js.native
  def data(name: String): js.Any = js.native
  def data(name: String, value: js.Any): this.type = js.native
  def data(name: String, value: js.Any, sustain: Boolean): this.type = js.native
  def dblclick(cb: js.Function): this.type = js.native
  def dmove(x: NumberAlias, y: NumberAlias): this.type = js.native
  def doc(): Parent = js.native
  def dx(x: NumberAlias): this.type = js.native
  def dy(y: NumberAlias): this.type = js.native
  def event(): Event | CustomEvent[_] = js.native
  def fill(color: String): this.type = js.native
  def fill(fill: Anon_Color): this.type = js.native
  def fill(image: Image): this.type = js.native
  def fill(pattern: Element): this.type = js.native
  def fire(event: String): this.type = js.native
  def fire(event: String, data: js.Any): this.type = js.native
  def fire(event: Event): this.type = js.native
  def flip(): this.type = js.native
  def flip(a: String): this.type = js.native
  def flip(a: String, offset: Double): this.type = js.native
  def flip(offset: Double): this.type = js.native
  def forget(): this.type = js.native
  def forget(keys: String*): this.type = js.native
  def forward(): this.type = js.native
  def front(): this.type = js.native
  def hasClass(name: String): Boolean = js.native
  def height(): Double = js.native
  def height(height: NumberAlias): this.type = js.native
  def hide(): this.type = js.native
  def id(): String = js.native
  def id(id: String): this.type = js.native
  def inside(x: Double, y: Double): Boolean = js.native
  def is(cls: js.Any): Boolean = js.native
  def linkTo(url: String): A = js.native
  def linkTo(url: js.Function1[/* link */ A, Unit]): A = js.native
  def maskWith(element: Element): this.type = js.native
  def maskWith(mask: Mask): this.type = js.native
  def matches(selector: String): Boolean = js.native
  def matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): this.type = js.native
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
  def off(event: String): this.type = js.native
  def off(event: String, cb: js.Function): this.type = js.native
  def off(event: String, cb: js.Function, context: js.Object): this.type = js.native
  def on(event: String, cb: js.Function): this.type = js.native
  def on(event: String, cb: js.Function, context: js.Object): this.type = js.native
  def opacity(): Double = js.native
  def opacity(o: Double): this.type = js.native
  // Add HTMLElement for Doc inheritance
  def parent(): Parent | HTMLElement = js.native
  def parent(`type`: ParentTypeAlias): Parent | HTMLElement = js.native
  def parents(): js.Array[Parent] = js.native
  def point(): Point = js.native
  def point(position: Anon_X): Point = js.native
  def point(position: ArrayPoint): Point = js.native
  def point(x: Double, y: Double): Point = js.native
  def position(): Double = js.native
  def previous(): Element = js.native
  def putIn(parent: Parent): Parent = js.native
  def rbox(): RBox = js.native
  def rbox(element: Element): RBox = js.native
  def reference(`type`: String): Element = js.native
  def remember(name: String): js.Any = js.native
  def remember(name: String, value: js.Any): this.type = js.native
  def remember(obj: js.Object): this.type = js.native
  def remove(): this.type = js.native
  def removeClass(name: String): this.type = js.native
  def replace(element: Element): Element = js.native
  def rotate(d: Double): this.type = js.native
  def rotate(d: Double, cx: Double): this.type = js.native
  def rotate(d: Double, cx: Double, cy: Double): this.type = js.native
  def scale(x: Double): this.type = js.native
  def scale(x: Double, y: Double): this.type = js.native
  def scale(x: Double, y: Double, cx: Double): this.type = js.native
  def scale(x: Double, y: Double, cx: Double, cy: Double): this.type = js.native
  def screenCTM(): Matrix = js.native
  def setData(data: js.Object): this.type = js.native
  def show(): this.type = js.native
  def siblings(): js.Array[Element] = js.native
  def size(): this.type = js.native
  def size(width: NumberAlias): this.type = js.native
  def size(width: NumberAlias, height: NumberAlias): this.type = js.native
  def skew(x: Double): this.type = js.native
  def skew(x: Double, y: Double): this.type = js.native
  def skew(x: Double, y: Double, cx: Double): this.type = js.native
  def skew(x: Double, y: Double, cx: Double, cy: Double): this.type = js.native
  def stop(jumpToEnd: Boolean, clearQueue: Boolean): Animation = js.native
  def stroke(color: String): this.type = js.native
  def stroke(stroke: StrokeData): this.type = js.native
  def style(style: String): js.Any = js.native
  def style(style: String, value: js.Any): this.type = js.native
  def style(styles: js.Object): this.type = js.native
  def svg(): String = js.native
  def svg(svg: String): this.type = js.native
  def tbox(): TBox = js.native
  def toDoc(): this.type = js.native
  def toParent(parent: Parent): this.type = js.native
  def toggleClass(name: String): this.type = js.native
  def touchcancel(cb: js.Function): this.type = js.native
  def touchend(cb: js.Function): this.type = js.native
  def touchleave(cb: js.Function): this.type = js.native
  def touchmove(cb: js.Function): this.type = js.native
  def touchstart(cb: js.Function): this.type = js.native
  def transform(): Transform = js.native
  def transform(t: Transform): Element = js.native
  def transform(t: Transform, relative: Boolean): Element = js.native
  def translate(x: Double, y: Double): this.type = js.native
  def unclip(): this.type = js.native
  def unmask(): this.type = js.native
  def untransform(): this.type = js.native
  def visible(): Boolean = js.native
  def width(): Double = js.native
  def width(width: NumberAlias): this.type = js.native
  def writeDataToDom(): this.type = js.native
  def x(): Double = js.native
  def x(x: NumberAlias): this.type = js.native
  def y(): Double = js.native
  def y(y: NumberAlias): this.type = js.native
}

