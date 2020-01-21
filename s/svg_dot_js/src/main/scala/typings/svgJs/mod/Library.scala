package typings.svgJs.mod

import typings.std.HTMLElement
import typings.svgJs.Anon
import typings.svgJs.AnonArray
import typings.svgJs.AnonAttrs
import typings.svgJs.AnonDelimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// default.js
//fx.js
// regex.js
// selector.js
// utilities.js
@js.native
trait Library extends js.Object {
  var A: typings.svgJs.mod.A = js.native
  var Array: typings.svgJs.mod.Array = js.native
  var BBox: typings.svgJs.mod.BBox = js.native
  var Bare: typings.svgJs.mod.Bare = js.native
  var Circle: typings.svgJs.mod.Circle = js.native
  var ClipPath: typings.svgJs.mod.ClipPath = js.native
  var Color: typings.svgJs.mod.Color = js.native
  var Container: typings.svgJs.mod.Container = js.native
  var Defs: typings.svgJs.mod.Defs = js.native
  var Doc: typings.svgJs.mod.Doc = js.native
  var Element: typings.svgJs.mod.Element = js.native
  var Ellipse: typings.svgJs.mod.Ellipse = js.native
  var G: typings.svgJs.mod.G = js.native
  var Gradient: typings.svgJs.mod.Gradient = js.native
  var Image: typings.svgJs.mod.Image = js.native
  var Line: typings.svgJs.mod.Line = js.native
  var Marker: typings.svgJs.mod.Marker = js.native
  var Mask: typings.svgJs.mod.Mask = js.native
  var Matrix: typings.svgJs.mod.Matrix = js.native
  var Nested: typings.svgJs.mod.Nested = js.native
  var Number: typings.svgJs.mod.Number = js.native
  var Parent: typings.svgJs.mod.Parent = js.native
  var Path: typings.svgJs.mod.Path = js.native
  var PathArray: typings.svgJs.mod.PathArray = js.native
  var Pattern: typings.svgJs.mod.Pattern = js.native
  var Point: typings.svgJs.mod.Point = js.native
  var PointArray: typings.svgJs.mod.PointArray = js.native
  var PolyLine: PolyLine_ = js.native
  var Polygon: typings.svgJs.mod.Polygon = js.native
  var RBox: typings.svgJs.mod.RBox = js.native
  var Rect: typings.svgJs.mod.Rect = js.native
  var Rotate: typings.svgJs.mod.Rotate = js.native
  var Scale: typings.svgJs.mod.Scale = js.native
  var Set: typings.svgJs.mod.Set = js.native
  var Shape: typings.svgJs.mod.Shape = js.native
  var Skew: typings.svgJs.mod.Skew = js.native
  var Stop: typings.svgJs.mod.Stop = js.native
  var TBox: typings.svgJs.mod.TBox = js.native
  var Text: typings.svgJs.mod.Text = js.native
  var TextPath: typings.svgJs.mod.TextPath = js.native
  var Transformation: typings.svgJs.mod.Transformation = js.native
  var Translate: typings.svgJs.mod.Translate = js.native
  var Tspan: typings.svgJs.mod.Tspan = js.native
  var Use: typings.svgJs.mod.Use = js.native
  var ViewBox: typings.svgJs.mod.ViewBox = js.native
  var defaults: AnonAttrs = js.native
  var did: Double = js.native
  var easing: Anon = js.native
  var ns: String = js.native
  var regex: AnonDelimiter = js.native
  var supported: Boolean = js.native
  var svgjs: String = js.native
  var utils: AnonArray = js.native
  var xlink: String = js.native
  var xmlns: String = js.native
  def apply(domElement: HTMLElement): Doc = js.native
  def apply(id: String): Doc = js.native
  def adopt(node: HTMLElement): Element = js.native
  def create(name: String): js.Any = js.native
  def eid(name: String): String = js.native
  def extend(parent: js.Object, obj: js.Object): Unit = js.native
  def get(id: String): Element = js.native
  def invent(config: js.Object): js.Any = js.native
  def prepare(element: HTMLElement): Unit = js.native
  def select(query: String): Set = js.native
  def select(query: String, parent: HTMLElement): Set = js.native
}

