package typings
package threeLib.threeDashEffectcomposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-effectcomposer", "Pass")
@js.native
class Pass () extends js.Object {
  // if set to true, the pass clears its buffer before rendering
  var clear: scala.Boolean = js.native
  // if set to true, the pass is processed by the composer
  var enabled: scala.Boolean = js.native
  // if set to true, the pass indicates to swap read and write buffer after rendering
  var needsSwap: scala.Boolean = js.native
  // if set to true, the result of the pass is rendered to screen
  var renderToScreen: scala.Boolean = js.native
  def render(
    renderer: threeLib.threeDashCoreMod.WebGLRenderer,
    writeBuffer: threeLib.threeDashCoreMod.WebGLRenderTarget,
    readBuffer: threeLib.threeDashCoreMod.WebGLRenderTarget,
    delta: scala.Double
  ): scala.Unit = js.native
  def render(
    renderer: threeLib.threeDashCoreMod.WebGLRenderer,
    writeBuffer: threeLib.threeDashCoreMod.WebGLRenderTarget,
    readBuffer: threeLib.threeDashCoreMod.WebGLRenderTarget,
    delta: scala.Double,
    maskActive: scala.Boolean
  ): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

