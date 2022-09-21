package typings.twoJs.mod

import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Two extends StObject {
  
  def add(objects: Object*): this.type = js.native
  def add(objects: js.Array[Object]): this.type = js.native
  
  def appendTo(domElement: HTMLElement): this.type = js.native
  
  def bind(event: String, callback: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  def clear(): this.type = js.native
  
  var frameCount: Double = js.native
  
  var height: Double = js.native
  
  def interpret(svgNode: SVGElement): Group = js.native
  
  def makeArcSegment(ox: Double, oy: Double, ir: Double, or: Double, sa: Double, ea: Double): ArcSegment = js.native
  def makeArcSegment(ox: Double, oy: Double, ir: Double, or: Double, sa: Double, ea: Double, res: Double): ArcSegment = js.native
  
  def makeCircle(x: Double, y: Double, radius: Double): Circle = js.native
  
  def makeCurve(coords: (Double | Boolean)*): Path = js.native
  def makeCurve(points: js.Array[Vector]): Path = js.native
  def makeCurve(points: js.Array[Vector], open: Boolean): Path = js.native
  
  def makeEllipse(x: Double, y: Double, width: Double, height: Double): Ellipse = js.native
  
  def makeGroup(objects: Object*): Group = js.native
  def makeGroup(objects: js.Array[Object]): Group = js.native
  
  def makeLine(x1: Double, y1: Double, x2: Double, y2: Double): Line = js.native
  
  def makePath(coords: (Double | Boolean)*): Path = js.native
  def makePath(points: js.Array[Vector]): Path = js.native
  def makePath(points: js.Array[Vector], open: Boolean): Path = js.native
  
  def makePolygon(x: Double, y: Double, radius: Double, sides: Double): Polygon = js.native
  
  def makeRectangle(x: Double, y: Double, width: Double, height: Double): Rectangle = js.native
  
  def makeRoundedRectangle(x: Double, y: Double, width: Double, height: Double, radius: Double): RoundedRectangle = js.native
  
  def makeStar(ox: Double, oy: Double, or: Double, ir: Double, sides: Double): Star = js.native
  
  def makeText(message: String, x: Double, y: Double, styles: Any): Text = js.native
  
  def pause(): this.type = js.native
  
  def play(): this.type = js.native
  
  var playing: Boolean = js.native
  
  def remove(objects: Object*): this.type = js.native
  def remove(objects: js.Array[Object]): this.type = js.native
  
  def render(): this.type = js.native
  
  var renderer: Renderer = js.native
  
  var scene: Group = js.native
  
  var timeDelta: Double = js.native
  
  var `type`: Types = js.native
  
  def unbind(): this.type = js.native
  def unbind(event: String): this.type = js.native
  def unbind(event: String, callback: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def unbind(event: Null, callback: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  def update(): this.type = js.native
  
  var width: Double = js.native
}
