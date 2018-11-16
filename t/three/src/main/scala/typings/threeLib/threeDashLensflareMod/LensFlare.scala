package typings
package threeLib.threeDashLensflareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-lensflare", "LensFlare")
@js.native
class LensFlare ()
  extends threeLib.threeDashCoreMod.Mesh {
  @JSName("frustumCulled")
  var frustumCulled_LensFlare: threeLib.threeLibNumbers.`false` = js.native
  var isLensflare: threeLib.threeLibNumbers.`true` = js.native
  @JSName("type")
  var type_LensFlare: threeLib.threeLibStrings.LensFlare = js.native
  def addElement(element: LensFlareElement): this.type = js.native
  def dispose(): scala.Unit = js.native
  def onBeforeRender(
    renderer: threeLib.threeDashCoreMod.WebGLRenderer,
    scene: threeLib.threeDashCoreMod.Scene,
    camera: threeLib.threeDashCoreMod.Camera
  ): scala.Unit = js.native
}

