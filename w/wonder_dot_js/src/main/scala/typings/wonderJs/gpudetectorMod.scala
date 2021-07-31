package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpudetectorMod {
  
  @js.native
  sealed trait EGPUPrecision extends StObject
  @JSImport("wonder.js/dist/es2015/device/GPUDetector", "EGPUPrecision")
  @js.native
  object EGPUPrecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EGPUPrecision & Double] = js.native
    
    @js.native
    sealed trait HIGHP
      extends StObject
         with EGPUPrecision
    /* 0 */ val HIGHP: typings.wonderJs.gpudetectorMod.EGPUPrecision.HIGHP & Double = js.native
    
    @js.native
    sealed trait LOWP
      extends StObject
         with EGPUPrecision
    /* 2 */ val LOWP: typings.wonderJs.gpudetectorMod.EGPUPrecision.LOWP & Double = js.native
    
    @js.native
    sealed trait MEDIUMP
      extends StObject
         with EGPUPrecision
    /* 1 */ val MEDIUMP: typings.wonderJs.gpudetectorMod.EGPUPrecision.MEDIUMP & Double = js.native
  }
  
  @JSImport("wonder.js/dist/es2015/device/GPUDetector", "GPUDetector")
  @js.native
  class GPUDetector () extends StObject {
    
    def detect(): Unit = js.native
    
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
  }
  /* static members */
  object GPUDetector {
    
    @JSImport("wonder.js/dist/es2015/device/GPUDetector", "GPUDetector")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getInstance(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Any]
  }
}
