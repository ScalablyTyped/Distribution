package typings.webcola.rectangleMod

import typings.webcola.geomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola/dist/src/rectangle", "Rectangle")
@js.native
class Rectangle protected () extends js.Object {
  def this(x: Double, X: Double, y: Double, Y: Double) = this()
  
  var X: Double = js.native
  
  var Y: Double = js.native
  
  def cx(): Double = js.native
  
  def cy(): Double = js.native
  
  def height(): Double = js.native
  
  def inflate(pad: Double): Rectangle = js.native
  
  def lineIntersections(x1: Double, y1: Double, x2: Double, y2: Double): js.Array[Point] = js.native
  
  def overlapX(r: Rectangle): Double = js.native
  
  def overlapY(r: Rectangle): Double = js.native
  
  def rayIntersection(x2: Double, y2: Double): Point = js.native
  
  def setXCentre(cx: Double): Unit = js.native
  
  def setYCentre(cy: Double): Unit = js.native
  
  def union(r: Rectangle): Rectangle = js.native
  
  def vertices(): js.Array[Point] = js.native
  
  def width(): Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
/* static members */
@JSImport("webcola/dist/src/rectangle", "Rectangle")
@js.native
object Rectangle extends js.Object {
  
  def empty(): Rectangle = js.native
  
  def lineIntersection(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Point = js.native
}
