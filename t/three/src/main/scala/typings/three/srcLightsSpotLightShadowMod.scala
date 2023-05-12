package typings.three

import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typings.three.srcLightsLightShadowMod.LightShadow
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsSpotLightShadowMod {
  
  @JSImport("three/src/lights/SpotLightShadow", "SpotLightShadow")
  @js.native
  open class SpotLightShadow protected () extends LightShadow[PerspectiveCamera] {
    /**
      * Create a new instance of {@link LightShadow}
      * @param camera The light's view of the world.
      */
    def this(camera: PerspectiveCamera) = this()
    
    /**
      * Used to focus the shadow camera.
      * @remarks The camera's field of view is set as a percentage of the spotlight's field-of-view. Range is `[0, 1]`. 0`.
      * @defaultValue `1`
      */
    var focus: Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link SpotLightShadow}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isSpotLightShadow: `true` = js.native
  }
}
