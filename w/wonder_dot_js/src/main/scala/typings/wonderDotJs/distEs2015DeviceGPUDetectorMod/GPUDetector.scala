package typings.wonderDotJs.distEs2015DeviceGPUDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/device/GPUDetector", "GPUDetector")
@js.native
class GPUDetector () extends js.Object {
  var extensionCompressedTextureS3TC: js.Any = js.native
  var extensionDepthTexture: Boolean = js.native
  var extensionInstancedArrays: js.Any = js.native
  var extensionStandardDerivatives: Boolean = js.native
  var extensionTextureFilterAnisotropic: js.Any = js.native
  var extensionUintIndices: Boolean = js.native
  var extensionVAO: js.Any = js.native
  val gl: js.Any = js.native
  var maxAnisotropy: Double = js.native
  var maxBoneCount: Double = js.native
  var maxCubemapTextureSize: Double = js.native
  var maxTextureSize: Double = js.native
  var maxTextureUnit: Double = js.native
  var precision: Double = js.native
  def detect(): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/device/GPUDetector", "GPUDetector")
@js.native
object GPUDetector extends js.Object {
  def getInstance(): js.Any = js.native
}

