package typings.three

import typings.three.cameraMod.Camera
import typings.three.lightShadowMod.LightShadow
import typings.three.perspectiveCameraMod.PerspectiveCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointLightShadowMod {
  
  @JSImport("three/src/lights/PointLightShadow", "PointLightShadow")
  @js.native
  open class PointLightShadow protected () extends LightShadow {
    def this(camera: Camera) = this()
    
    @JSName("camera")
    var camera_PointLightShadow: PerspectiveCamera = js.native
  }
}
