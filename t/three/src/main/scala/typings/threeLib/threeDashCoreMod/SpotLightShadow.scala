package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "SpotLightShadow")
@js.native
class SpotLightShadow () extends LightShadow {
  @JSName("camera")
  var camera_SpotLightShadow: PerspectiveCamera = js.native
  def update(light: Light): scala.Unit = js.native
}

