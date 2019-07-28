package typings.three.srcLightsSpotLightShadowMod

import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typings.three.srcLightsLightMod.Light
import typings.three.srcLightsLightShadowMod.LightShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/SpotLightShadow", "SpotLightShadow")
@js.native
class SpotLightShadow () extends LightShadow {
  @JSName("camera")
  var camera_SpotLightShadow: PerspectiveCamera = js.native
  def update(light: Light): Unit = js.native
}

