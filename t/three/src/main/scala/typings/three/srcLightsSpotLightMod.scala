package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsLightMod.Light
import typings.three.srcLightsSpotLightShadowMod.SpotLightShadow
import typings.three.srcUtilsMod.ColorRepresentation
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsSpotLightMod {
  
  @JSImport("three/src/lights/SpotLight", "SpotLight")
  @js.native
  open class SpotLight protected () extends Light {
    def this(
      color: js.UndefOr[ColorRepresentation],
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
    var target: Object3D[Event] = js.native
  }
}
