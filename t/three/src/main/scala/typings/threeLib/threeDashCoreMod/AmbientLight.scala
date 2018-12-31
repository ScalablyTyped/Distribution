package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "AmbientLight")
@js.native
/**
  * This creates a Ambientlight with a color.
  * @param color Numeric value of the RGB component of the color or a Color instance.
  */
class AmbientLight () extends Light {
  def this(color: java.lang.String) = this()
  def this(color: scala.Double) = this()
  def this(color: Color) = this()
  def this(color: java.lang.String, intensity: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double) = this()
  def this(color: Color, intensity: scala.Double) = this()
}

