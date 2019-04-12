package typings
package threeLib.srcLightsSpotLightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/SpotLight", "SpotLight")
@js.native
class SpotLight protected ()
  extends threeLib.srcLightsLightMod.Light {
  def this(color: js.UndefOr[threeLib.srcMathColorMod.Color | scala.Double | java.lang.String], intensity: js.UndefOr[scala.Double], distance: js.UndefOr[scala.Double], angle: js.UndefOr[scala.Double], exponent: js.UndefOr[scala.Double], decay: js.UndefOr[scala.Double]) = this()
  /*
    * Maximum extent of the spotlight, in radians, from its direction.
    * Default — Math.PI/2.
    */
  var angle: scala.Double = js.native
  var decay: scala.Double = js.native
  /**
    * If non-zero, light will attenuate linearly from maximum intensity at light position down to zero at distance.
    * Default — 0.0.
    */
  var distance: scala.Double = js.native
  /**
    * Rapidity of the falloff of light from its target direction.
    * Default — 10.0.
    */
  var exponent: scala.Double = js.native
  var penumbra: scala.Double = js.native
  var power: scala.Double = js.native
  @JSName("shadow")
  var shadow_SpotLight: threeLib.srcLightsSpotLightShadowMod.SpotLightShadow = js.native
  /**
    * Spotlight focus points at target.position.
    * Default position — (0,0,0).
    */
  var target: threeLib.srcCoreObject3DMod.Object3D = js.native
}

