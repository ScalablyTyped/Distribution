package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "PointLight")
@js.native
class PointLight () extends Light {
  def this(color: java.lang.String) = this()
  def this(color: scala.Double) = this()
  def this(color: Color) = this()
  def this(color: java.lang.String, intensity: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double) = this()
  def this(color: Color, intensity: scala.Double) = this()
  def this(color: java.lang.String, intensity: scala.Double, distance: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double, distance: scala.Double) = this()
  def this(color: Color, intensity: scala.Double, distance: scala.Double) = this()
  def this(color: java.lang.String, intensity: scala.Double, distance: scala.Double, decay: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double, distance: scala.Double, decay: scala.Double) = this()
  def this(color: Color, intensity: scala.Double, distance: scala.Double, decay: scala.Double) = this()
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

