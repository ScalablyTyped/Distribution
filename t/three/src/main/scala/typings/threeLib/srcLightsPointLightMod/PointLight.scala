package typings
package threeLib.srcLightsPointLightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/PointLight", "PointLight")
@js.native
class PointLight ()
  extends threeLib.srcLightsLightMod.Light {
  def this(color: java.lang.String) = this()
  def this(color: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color) = this()
  def this(color: java.lang.String, intensity: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color, intensity: scala.Double) = this()
  def this(color: java.lang.String, intensity: scala.Double, distance: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double, distance: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color, intensity: scala.Double, distance: scala.Double) = this()
  def this(color: java.lang.String, intensity: scala.Double, distance: scala.Double, decay: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double, distance: scala.Double, decay: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color, intensity: scala.Double, distance: scala.Double, decay: scala.Double) = this()
  var decay: scala.Double = js.native
  /**
    * If non-zero, light will attenuate linearly from maximum intensity at light position down to zero at distance.
    * Default — 0.0.
    */
  var distance: scala.Double = js.native
  var power: scala.Double = js.native
  @JSName("shadow")
  var shadow_PointLight: PointLightShadow = js.native
}

