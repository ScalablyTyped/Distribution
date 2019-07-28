package typings.three.srcLightsPointLightMod

import typings.three.srcLightsLightMod.Light
import typings.three.srcMathColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/PointLight", "PointLight")
@js.native
class PointLight () extends Light {
  def this(color: String) = this()
  def this(color: Double) = this()
  def this(color: Color) = this()
  def this(color: String, intensity: Double) = this()
  def this(color: Double, intensity: Double) = this()
  def this(color: Color, intensity: Double) = this()
  def this(color: String, intensity: Double, distance: Double) = this()
  def this(color: Double, intensity: Double, distance: Double) = this()
  def this(color: Color, intensity: Double, distance: Double) = this()
  def this(color: String, intensity: Double, distance: Double, decay: Double) = this()
  def this(color: Double, intensity: Double, distance: Double, decay: Double) = this()
  def this(color: Color, intensity: Double, distance: Double, decay: Double) = this()
  var decay: Double = js.native
  /**
  	 * If non-zero, light will attenuate linearly from maximum intensity at light position down to zero at distance.
  	 * Default — 0.0.
  	 */
  var distance: Double = js.native
  var power: Double = js.native
  @JSName("shadow")
  var shadow_PointLight: PointLightShadow = js.native
}

