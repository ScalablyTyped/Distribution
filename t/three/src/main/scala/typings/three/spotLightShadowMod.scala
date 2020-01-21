package typings.three

import typings.three.lightShadowMod.LightShadow
import typings.three.perspectiveCameraMod.PerspectiveCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/SpotLightShadow", JSImport.Namespace)
@js.native
object spotLightShadowMod extends js.Object {
  @js.native
  class SpotLightShadow () extends LightShadow {
    @JSName("camera")
    var camera_SpotLightShadow: PerspectiveCamera = js.native
  }
  
}

