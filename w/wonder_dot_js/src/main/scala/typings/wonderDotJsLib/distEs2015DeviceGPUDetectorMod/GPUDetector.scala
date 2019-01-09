package typings
package wonderDotJsLib.distEs2015DeviceGPUDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/device/GPUDetector", "GPUDetector")
@js.native
class GPUDetector () extends js.Object {
  var extensionCompressedTextureS3TC: js.Any = js.native
  var extensionDepthTexture: scala.Boolean = js.native
  var extensionInstancedArrays: js.Any = js.native
  var extensionStandardDerivatives: scala.Boolean = js.native
  var extensionTextureFilterAnisotropic: js.Any = js.native
  var extensionUintIndices: scala.Boolean = js.native
  var extensionVAO: js.Any = js.native
  val gl: js.Any = js.native
  var maxAnisotropy: scala.Double = js.native
  var maxBoneCount: scala.Double = js.native
  var maxCubemapTextureSize: scala.Double = js.native
  var maxTextureSize: scala.Double = js.native
  var maxTextureUnit: scala.Double = js.native
  var precision: scala.Double = js.native
  def detect(): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/device/GPUDetector", "GPUDetector")
@js.native
object GPUDetector extends js.Object {
  def getInstance(): js.Any = js.native
}

