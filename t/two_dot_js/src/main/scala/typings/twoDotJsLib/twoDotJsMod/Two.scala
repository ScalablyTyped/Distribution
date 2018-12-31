package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Two extends js.Object {
  var frameCount: scala.Double = js.native
  var height: scala.Double = js.native
  var playing: scala.Boolean = js.native
  var renderer: twoDotJsLib.twoDotJsMod.TwoNs.Renderer = js.native
  var scene: twoDotJsLib.twoDotJsMod.TwoNs.Group = js.native
  var timeDelta: scala.Double = js.native
  var `type`: twoDotJsLib.twoDotJsMod.TwoNs.Types = js.native
  var width: scala.Double = js.native
  def add(objects: twoDotJsLib.twoDotJsMod.TwoNs.Object*): this.type = js.native
  def add(objects: js.Array[twoDotJsLib.twoDotJsMod.TwoNs.Object]): this.type = js.native
  def appendTo(domElement: stdLib.HTMLElement): this.type = js.native
  def bind(event: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def clear(): this.type = js.native
  def interpret(svgNode: stdLib.SVGElement): twoDotJsLib.twoDotJsMod.TwoNs.Group = js.native
  def makeArcSegment(
    ox: scala.Double,
    oy: scala.Double,
    ir: scala.Double,
    or: scala.Double,
    sa: scala.Double,
    ea: scala.Double
  ): twoDotJsLib.twoDotJsMod.TwoNs.ArcSegment = js.native
  def makeArcSegment(
    ox: scala.Double,
    oy: scala.Double,
    ir: scala.Double,
    or: scala.Double,
    sa: scala.Double,
    ea: scala.Double,
    res: scala.Double
  ): twoDotJsLib.twoDotJsMod.TwoNs.ArcSegment = js.native
  def makeCircle(x: scala.Double, y: scala.Double, radius: scala.Double): twoDotJsLib.twoDotJsMod.TwoNs.Circle = js.native
  def makeCurve(coords: (scala.Double | scala.Boolean)*): twoDotJsLib.twoDotJsMod.TwoNs.Path = js.native
  def makeCurve(points: js.Array[twoDotJsLib.twoDotJsMod.TwoNs.Vector]): twoDotJsLib.twoDotJsMod.TwoNs.Path = js.native
  def makeCurve(points: js.Array[twoDotJsLib.twoDotJsMod.TwoNs.Vector], open: scala.Boolean): twoDotJsLib.twoDotJsMod.TwoNs.Path = js.native
  def makeEllipse(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): twoDotJsLib.twoDotJsMod.TwoNs.Ellipse = js.native
  def makeGroup(objects: twoDotJsLib.twoDotJsMod.TwoNs.Object*): twoDotJsLib.twoDotJsMod.TwoNs.Group = js.native
  def makeGroup(objects: js.Array[twoDotJsLib.twoDotJsMod.TwoNs.Object]): twoDotJsLib.twoDotJsMod.TwoNs.Group = js.native
  def makeLine(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): twoDotJsLib.twoDotJsMod.TwoNs.Line = js.native
  def makePath(coords: (scala.Double | scala.Boolean)*): twoDotJsLib.twoDotJsMod.TwoNs.Path = js.native
  def makePath(points: js.Array[twoDotJsLib.twoDotJsMod.TwoNs.Vector]): twoDotJsLib.twoDotJsMod.TwoNs.Path = js.native
  def makePath(points: js.Array[twoDotJsLib.twoDotJsMod.TwoNs.Vector], open: scala.Boolean): twoDotJsLib.twoDotJsMod.TwoNs.Path = js.native
  def makePolygon(x: scala.Double, y: scala.Double, radius: scala.Double, sides: scala.Double): twoDotJsLib.twoDotJsMod.TwoNs.Polygon = js.native
  def makeRectangle(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): twoDotJsLib.twoDotJsMod.TwoNs.Rectangle = js.native
  def makeRoundedRectangle(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, radius: scala.Double): twoDotJsLib.twoDotJsMod.TwoNs.RoundedRectangle = js.native
  def makeStar(ox: scala.Double, oy: scala.Double, or: scala.Double, ir: scala.Double, sides: scala.Double): twoDotJsLib.twoDotJsMod.TwoNs.Star = js.native
  def pause(): this.type = js.native
  def play(): this.type = js.native
  def remove(objects: twoDotJsLib.twoDotJsMod.TwoNs.Object*): this.type = js.native
  def remove(objects: js.Array[twoDotJsLib.twoDotJsMod.TwoNs.Object]): this.type = js.native
  def render(): this.type = js.native
  def unbind(): this.type = js.native
  def unbind(event: java.lang.String): this.type = js.native
  def unbind(event: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def unbind(event: scala.Null, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def update(): this.type = js.native
}

