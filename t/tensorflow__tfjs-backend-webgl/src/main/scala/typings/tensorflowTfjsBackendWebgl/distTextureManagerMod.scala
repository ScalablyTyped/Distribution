package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLRenderingContext
import typings.tensorflowTfjsBackendWebgl.distGpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.distTexUtilMod.PhysicalTextureType
import typings.tensorflowTfjsBackendWebgl.distTexUtilMod.Texture
import typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureConfig
import typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextureManagerMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/texture_manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/texture_manager", "TextureManager")
  @js.native
  open class TextureManager protected () extends StObject {
    def this(gpgpu: GPGPUContext) = this()
    
    /* private */ var _numBytesAllocated: Any = js.native
    
    /* private */ var _numBytesFree: Any = js.native
    
    def acquireTexture(shapeRC: js.Tuple2[Double, Double], usage: TextureUsage, isPacked: Boolean): Texture = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ var freeTextures: Any = js.native
    
    def getNumFreeTextures(): Double = js.native
    
    def getNumUsedTextures(): Double = js.native
    
    /* private */ val gpgpu: Any = js.native
    
    /* private */ var log: Any = js.native
    
    /* private */ var logEnabled: Any = js.native
    
    def numBytesAllocated: Double = js.native
    
    def numBytesFree: Double = js.native
    
    /* private */ var numFreeTextures: Any = js.native
    
    /* private */ var numUsedTextures: Any = js.native
    
    def releaseTexture(
      texture: Texture,
      shape: js.Tuple2[Double, Double],
      logicalTexType: TextureUsage,
      isPacked: Boolean
    ): Unit = js.native
    
    /* private */ var usedTextures: Any = js.native
  }
  
  inline def computeBytes(
    shape: js.Tuple2[Double, Double],
    physicalTexType: PhysicalTextureType,
    gl: WebGLRenderingContext,
    textureConfig: TextureConfig,
    isPacked: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBytes")(shape.asInstanceOf[js.Any], physicalTexType.asInstanceOf[js.Any], gl.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any], isPacked.asInstanceOf[js.Any])).asInstanceOf[Double]
}
