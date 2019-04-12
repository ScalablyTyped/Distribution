package typings
package threeLib.srcHelpersGridHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/GridHelper", "GridHelper")
@js.native
class GridHelper protected ()
  extends threeLib.srcObjectsLineSegmentsMod.LineSegments {
  def this(size: scala.Double, divisions: scala.Double) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: scala.Double) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: threeLib.srcMathColorMod.Color) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: scala.Double, color2: scala.Double) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: scala.Double, color2: threeLib.srcMathColorMod.Color) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: threeLib.srcMathColorMod.Color, color2: scala.Double) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: threeLib.srcMathColorMod.Color, color2: threeLib.srcMathColorMod.Color) = this()
  /**
    * @deprecated Colors should be specified in the constructor.
    */
  def setColors(): scala.Unit = js.native
  def setColors(color1: scala.Double): scala.Unit = js.native
  def setColors(color1: scala.Double, color2: scala.Double): scala.Unit = js.native
  def setColors(color1: scala.Double, color2: threeLib.srcMathColorMod.Color): scala.Unit = js.native
  def setColors(color1: threeLib.srcMathColorMod.Color): scala.Unit = js.native
  def setColors(color1: threeLib.srcMathColorMod.Color, color2: scala.Double): scala.Unit = js.native
  def setColors(color1: threeLib.srcMathColorMod.Color, color2: threeLib.srcMathColorMod.Color): scala.Unit = js.native
}

