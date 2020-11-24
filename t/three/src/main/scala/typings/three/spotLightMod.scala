package typings.three

import typings.three.colorMod.Color
import typings.three.lightMod.Light
import typings.three.object3DMod.Object3D
import typings.three.spotLightShadowMod.SpotLightShadow
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/lights/SpotLight", JSImport.Namespace)
@js.native
object spotLightMod extends js.Object {
  
  @js.native
  class SpotLight protected () extends Light {
    def this(
      color: js.UndefOr[Color | String | Double],
      intensity: js.UndefOr[Double],
      distance: js.UndefOr[Double],
      angle: js.UndefOr[Double],
      penumbra: js.UndefOr[Double],
      decay: js.UndefOr[Double]
    ) = this()
    
    /**
    	 * Maximum extent of the spotlight, in radians, from its direction.
    	 * @default Math.PI / 3.
    	 */
    var angle: Double = js.native
    
    /**
    	 * @default 1
    	 */
    var decay: Double = js.native
    
    /**
    	 * If non-zero, light will attenuate linearly from maximum intensity at light position down to zero at distance.
    	 * @default 0
    	 */
    var distance: Double = js.native
    
    val isSpotLight: `true` = js.native
    
    /**
    	 * @default 0
    	 */
    var penumbra: Double = js.native
    
    var power: Double = js.native
    
    /**
    	 * @default new THREE.SpotLightShadow()
    	 */
    @JSName("shadow")
    var shadow_SpotLight: SpotLightShadow = js.native
    
    /**
    	 * Spotlight focus points at target.position.
    	 * @default new THREE.Object3D()
    	 */
    var target: Object3D = js.native
  }
}
