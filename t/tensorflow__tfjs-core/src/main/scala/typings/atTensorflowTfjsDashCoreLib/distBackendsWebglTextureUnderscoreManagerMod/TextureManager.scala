package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglTextureUnderscoreManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/texture_manager", "TextureManager")
@js.native
class TextureManager protected () extends js.Object {
  def this(gpgpu: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext) = this()
  var freeTextures: js.Any = js.native
  var gpgpu: js.Any = js.native
  var log: js.Any = js.native
  var logEnabled: js.Any = js.native
  var numFreeTextures: js.Any = js.native
  var numUsedTextures: js.Any = js.native
  var usedTextures: js.Any = js.native
  def acquireTexture(
    shapeRC: js.Tuple2[scala.Double, scala.Double],
    usage: atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.TextureUsage,
    isPacked: scala.Boolean
  ): stdLib.WebGLTexture = js.native
  def dispose(): scala.Unit = js.native
  def getNumFreeTextures(): scala.Double = js.native
  def getNumUsedTextures(): scala.Double = js.native
  def releaseTexture(
    texture: stdLib.WebGLTexture,
    shape: js.Tuple2[scala.Double, scala.Double],
    logicalTexType: atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.TextureUsage,
    isPacked: scala.Boolean
  ): scala.Unit = js.native
}

