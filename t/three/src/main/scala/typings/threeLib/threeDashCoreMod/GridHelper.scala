package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "GridHelper")
@js.native
class GridHelper protected () extends LineSegments {
  def this(size: scala.Double, divisions: scala.Double) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: scala.Double) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: Color) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: scala.Double, color2: scala.Double) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: scala.Double, color2: Color) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: Color, color2: scala.Double) = this()
  def this(size: scala.Double, divisions: scala.Double, color1: Color, color2: Color) = this()
  /**
    * @deprecated Colors should be specified in the constructor.
    */
  def setColors(): scala.Unit = js.native
  def setColors(color1: scala.Double): scala.Unit = js.native
  def setColors(color1: scala.Double, color2: scala.Double): scala.Unit = js.native
  def setColors(color1: scala.Double, color2: Color): scala.Unit = js.native
  def setColors(color1: Color): scala.Unit = js.native
  def setColors(color1: Color, color2: scala.Double): scala.Unit = js.native
  def setColors(color1: Color, color2: Color): scala.Unit = js.native
}

