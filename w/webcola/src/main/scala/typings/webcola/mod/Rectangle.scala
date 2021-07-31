package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Rectangle")
@js.native
class Rectangle protected ()
  extends typings.webcola.rectangleMod.Rectangle {
  def this(x: Double, X: Double, y: Double, Y: Double) = this()
}
/* static members */
object Rectangle {
  
  @JSImport("webcola", "Rectangle")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def empty(): typings.webcola.rectangleMod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.webcola.rectangleMod.Rectangle]
  
  @scala.inline
  def lineIntersection(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): typings.webcola.geomMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("lineIntersection")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.geomMod.Point]
}
