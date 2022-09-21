package typings.three

import typings.three.cameraMod.Camera
import typings.three.lightShadowMod.LightShadow
import typings.three.perspectiveCameraMod.PerspectiveCamera
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotLightShadowMod {
  
  @JSImport("three/src/lights/SpotLightShadow", "SpotLightShadow")
  @js.native
  open class SpotLightShadow protected () extends LightShadow {
    def this(camera: Camera) = this()
    
    @JSName("camera")
    var camera_SpotLightShadow: PerspectiveCamera = js.native
    
    /**
      * @default 1
      */
    var focus: Double = js.native
    
    val isSpotLightShadow: `true` = js.native
  }
}
