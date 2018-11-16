package typings
package threeLib.threeDashEffectcomposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-effectcomposer", "EffectComposer")
@js.native
class EffectComposer protected () extends js.Object {
  def this(renderer: threeLib.threeDashCoreMod.WebGLRenderer) = this()
  def this(renderer: threeLib.threeDashCoreMod.WebGLRenderer, renderTarget: threeLib.threeDashCoreMod.WebGLRenderTarget) = this()
  var copyPass: threeLib.threeDashShaderpassMod.ShaderPass = js.native
  var passes: js.Array[Pass] = js.native
  var readBuffer: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  var renderTarget1: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  var renderTarget2: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  var writeBuffer: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  def addPass(pass: js.Any): scala.Unit = js.native
  def insertPass(pass: js.Any, index: scala.Double): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def render(delta: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def reset(renderTarget: threeLib.threeDashCoreMod.WebGLRenderTarget): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def swapBuffers(): scala.Unit = js.native
}

