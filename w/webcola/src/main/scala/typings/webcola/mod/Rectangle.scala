package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Rectangle")
@js.native
class Rectangle protected ()
  extends typings.webcola.rectangleMod.Rectangle {
  def this(x: Double, X: Double, y: Double, Y: Double) = this()
}
/* static members */
object Rectangle {
  
  @JSImport("webcola", "Rectangle.empty")
  @js.native
  def empty(): typings.webcola.rectangleMod.Rectangle = js.native
  
  @JSImport("webcola", "Rectangle.lineIntersection")
  @js.native
  def lineIntersection(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): typings.webcola.geomMod.Point = js.native
}
