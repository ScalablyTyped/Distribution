package typings.three

import typings.three.colorMod.Color
import typings.three.lightMod.Light
import typings.three.object3DMod.Object3D
import typings.three.spotLightShadowMod.SpotLightShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/SpotLight", JSImport.Namespace)
@js.native
object spotLightMod extends js.Object {
  @js.native
  class SpotLight protected () extends Light {
    def this(
      color: js.UndefOr[Color | Double | String],
      intensity: js.UndefOr[Double],
      distance: js.UndefOr[Double],
      angle: js.UndefOr[Double],
      exponent: js.UndefOr[Double],
      decay: js.UndefOr[Double]
    ) = this()
    /*
    	 * Maximum extent of the spotlight, in radians, from its direction.
    	 * Default — Math.PI/2.
    	 */
    var angle: Double = js.native
    var decay: Double = js.native
    /**
    	 * If non-zero, light will attenuate linearly from maximum intensity at light position down to zero at distance.
    	 * Default — 0.0.
    	 */
    var distance: Double = js.native
    /**
    	 * Rapidity of the falloff of light from its target direction.
    	 * Default — 10.0.
    	 */
    var exponent: Double = js.native
    var penumbra: Double = js.native
    var power: Double = js.native
    @JSName("shadow")
    var shadow_SpotLight: SpotLightShadow = js.native
    /**
    	 * Spotlight focus points at target.position.
    	 * Default position — (0,0,0).
    	 */
    var target: Object3D = js.native
  }
  
}

