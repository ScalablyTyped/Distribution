package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.texUtilMod.PhysicalTextureType
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureConfig
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textureManagerMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/texture_manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/texture_manager", "TextureManager")
  @js.native
  class TextureManager protected () extends StObject {
    def this(gpgpu: GPGPUContext) = this()
    
    /* private */ var _numBytesAllocated: js.Any = js.native
    
    /* private */ var _numBytesFree: js.Any = js.native
    
    def acquireTexture(shapeRC: js.Tuple2[Double, Double], usage: TextureUsage, isPacked: Boolean): WebGLTexture = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ var freeTextures: js.Any = js.native
    
    def getNumFreeTextures(): Double = js.native
    
    def getNumUsedTextures(): Double = js.native
    
    /* private */ var gpgpu: js.Any = js.native
    
    /* private */ var log: js.Any = js.native
    
    /* private */ var logEnabled: js.Any = js.native
    
    val numBytesAllocated: Double = js.native
    
    val numBytesFree: Double = js.native
    
    /* private */ var numFreeTextures: js.Any = js.native
    
    /* private */ var numUsedTextures: js.Any = js.native
    
    def releaseTexture(
      texture: WebGLTexture,
      shape: js.Tuple2[Double, Double],
      logicalTexType: TextureUsage,
      isPacked: Boolean
    ): Unit = js.native
    
    /* private */ var usedTextures: js.Any = js.native
  }
  
  inline def computeBytes(
    shape: js.Tuple2[Double, Double],
    physicalTexType: PhysicalTextureType,
    gl: WebGLRenderingContext,
    textureConfig: TextureConfig,
    isPacked: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBytes")(shape.asInstanceOf[js.Any], physicalTexType.asInstanceOf[js.Any], gl.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any], isPacked.asInstanceOf[js.Any])).asInstanceOf[Double]
}
