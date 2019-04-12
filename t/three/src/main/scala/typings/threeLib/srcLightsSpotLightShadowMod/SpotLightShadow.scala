package typings
package threeLib.srcLightsSpotLightShadowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/SpotLightShadow", "SpotLightShadow")
@js.native
class SpotLightShadow ()
  extends threeLib.srcLightsLightShadowMod.LightShadow {
  @JSName("camera")
  var camera_SpotLightShadow: threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera = js.native
  def update(light: threeLib.srcLightsLightMod.Light): scala.Unit = js.native
}

