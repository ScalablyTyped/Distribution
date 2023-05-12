package typings.three

import typings.three.srcCamerasOrthographicCameraMod.OrthographicCamera
import typings.three.srcLightsLightShadowMod.LightShadow
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsDirectionalLightShadowMod {
  
  @JSImport("three/src/lights/DirectionalLightShadow", "DirectionalLightShadow")
  @js.native
  /**
    * Create a new instance of {@link DirectionalLightShadow}
    */
  open class DirectionalLightShadow () extends LightShadow[OrthographicCamera] {
    
    /**
      * Read-only flag to check if a given object is of type {@link DirectionalLightShadow}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isDirectionalLightShadow: `true` = js.native
  }
}
