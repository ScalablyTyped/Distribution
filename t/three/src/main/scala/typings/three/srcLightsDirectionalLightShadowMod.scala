package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCamerasOrthographicCameraMod.OrthographicCamera
import typings.three.srcLightsLightShadowMod.LightShadow
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsDirectionalLightShadowMod {
  
  @JSImport("three/src/lights/DirectionalLightShadow", "DirectionalLightShadow")
  @js.native
  open class DirectionalLightShadow protected () extends LightShadow {
    def this(camera: Camera) = this()
    
    @JSName("camera")
    var camera_DirectionalLightShadow: OrthographicCamera = js.native
    
    val isDirectionalLightShadow: `true` = js.native
  }
}
