package typings.wonderDotJs

import typings.wonderDotJs.distEs2015DeviceGPUDetectorMod.EGPUPrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/device/GPUDetector", JSImport.Namespace)
@js.native
object distEs2015DeviceGPUDetectorMod extends js.Object {
  @js.native
  sealed trait EGPUPrecision extends js.Object
  
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
  
  @js.native
  object EGPUPrecision extends js.Object {
    @js.native
    sealed trait HIGHP extends EGPUPrecision
    
    @js.native
    sealed trait LOWP extends EGPUPrecision
    
    @js.native
    sealed trait MEDIUMP extends EGPUPrecision
    
    /* 0 */ val HIGHP: typings.wonderDotJs.distEs2015DeviceGPUDetectorMod.EGPUPrecision.HIGHP with Double = js.native
    /* 2 */ val LOWP: typings.wonderDotJs.distEs2015DeviceGPUDetectorMod.EGPUPrecision.LOWP with Double = js.native
    /* 1 */ val MEDIUMP: typings.wonderDotJs.distEs2015DeviceGPUDetectorMod.EGPUPrecision.MEDIUMP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EGPUPrecision with Double] = js.native
  }
  
  /* static members */
  @js.native
  object GPUDetector extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

