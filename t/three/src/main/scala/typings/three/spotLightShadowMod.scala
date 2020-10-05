package typings.three

import typings.three.lightShadowMod.LightShadow
import typings.three.perspectiveCameraMod.PerspectiveCamera
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/lights/SpotLightShadow", JSImport.Namespace)
@js.native
object spotLightShadowMod extends js.Object {
  @js.native
  class SpotLightShadow () extends LightShadow {
    @JSName("camera")
    var camera_SpotLightShadow: PerspectiveCamera = js.native
    val isSpotLightShadow: `true` = js.native
  }
  
}

