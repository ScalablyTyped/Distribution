package typings.three

import typings.three.srcMathColorMod.Color
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/GridHelper", JSImport.Namespace)
@js.native
object srcHelpersGridHelperMod extends js.Object {
  @js.native
  class GridHelper protected () extends LineSegments {
    def this(size: Double, divisions: Double) = this()
    def this(size: Double, divisions: Double, color1: Double) = this()
    def this(size: Double, divisions: Double, color1: Color) = this()
    def this(size: Double, divisions: Double, color1: Double, color2: Double) = this()
    def this(size: Double, divisions: Double, color1: Double, color2: Color) = this()
    def this(size: Double, divisions: Double, color1: Color, color2: Double) = this()
    def this(size: Double, divisions: Double, color1: Color, color2: Color) = this()
    /**
    	 * @deprecated Colors should be specified in the constructor.
    	 */
    def setColors(): Unit = js.native
    def setColors(color1: Double): Unit = js.native
    def setColors(color1: Double, color2: Double): Unit = js.native
    def setColors(color1: Double, color2: Color): Unit = js.native
    def setColors(color1: Color): Unit = js.native
    def setColors(color1: Color, color2: Double): Unit = js.native
    def setColors(color1: Color, color2: Color): Unit = js.native
  }
  
}

