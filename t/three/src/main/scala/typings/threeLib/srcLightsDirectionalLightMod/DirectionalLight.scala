package typings
package threeLib.srcLightsDirectionalLightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/DirectionalLight", "DirectionalLight")
@js.native
class DirectionalLight ()
  extends threeLib.srcLightsLightMod.Light {
  def this(color: java.lang.String) = this()
  def this(color: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color) = this()
  def this(color: java.lang.String, intensity: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color, intensity: scala.Double) = this()
  @JSName("shadow")
  var shadow_DirectionalLight: threeLib.srcLightsDirectionalLightShadowMod.DirectionalLightShadow = js.native
  /**
    * Target used for shadow camera orientation.
    */
  var target: threeLib.srcCoreObject3DMod.Object3D = js.native
}

