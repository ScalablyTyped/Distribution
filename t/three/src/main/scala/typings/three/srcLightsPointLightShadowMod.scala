package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typings.three.srcLightsLightShadowMod.LightShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsPointLightShadowMod {
  
  @JSImport("three/src/lights/PointLightShadow", "PointLightShadow")
  @js.native
  open class PointLightShadow protected () extends LightShadow {
    def this(camera: Camera) = this()
    
    @JSName("camera")
    var camera_PointLightShadow: PerspectiveCamera = js.native
  }
}
