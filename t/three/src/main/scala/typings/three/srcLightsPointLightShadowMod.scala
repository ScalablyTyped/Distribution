package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typings.three.srcLightsLightMod.Light
import typings.three.srcLightsLightShadowMod.LightShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsPointLightShadowMod {
  
  @JSImport("three/src/lights/PointLightShadow", "PointLightShadow")
  @js.native
  open class PointLightShadow protected () extends LightShadow[PerspectiveCamera] {
    /**
      * Create a new instance of {@link LightShadow}
      * @param camera The light's view of the world.
      */
    def this(camera: PerspectiveCamera) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link PointLightShadow}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isPointLightShadow: /* true */ Boolean = js.native
    
    def updateMatrices(light: Light[js.UndefOr[LightShadow[Camera]]], viewportIndex: Double): Unit = js.native
  }
}
