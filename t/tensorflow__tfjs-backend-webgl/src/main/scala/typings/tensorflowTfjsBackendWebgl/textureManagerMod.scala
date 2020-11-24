package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.texUtilMod.PhysicalTextureType
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureConfig
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/texture_manager", JSImport.Namespace)
@js.native
object textureManagerMod extends js.Object {
  
  def computeBytes(
    shape: js.Tuple2[Double, Double],
    physicalTexType: PhysicalTextureType,
    gl: WebGLRenderingContext,
    textureConfig: TextureConfig,
    isPacked: Boolean
  ): Double = js.native
  
  @js.native
  class TextureManager protected () extends js.Object {
    def this(gpgpu: GPGPUContext) = this()
    
    var _numBytesAllocated: js.Any = js.native
    
    var _numBytesFree: js.Any = js.native
    
    def acquireTexture(shapeRC: js.Tuple2[Double, Double], usage: TextureUsage, isPacked: Boolean): WebGLTexture = js.native
    
    def dispose(): Unit = js.native
    
    var freeTextures: js.Any = js.native
    
    def getNumFreeTextures(): Double = js.native
    
    def getNumUsedTextures(): Double = js.native
    
    var gpgpu: js.Any = js.native
    
    var log: js.Any = js.native
    
    var logEnabled: js.Any = js.native
    
    val numBytesAllocated: Double = js.native
    
    val numBytesFree: Double = js.native
    
    var numFreeTextures: js.Any = js.native
    
    var numUsedTextures: js.Any = js.native
    
    def releaseTexture(
      texture: WebGLTexture,
      shape: js.Tuple2[Double, Double],
      logicalTexType: TextureUsage,
      isPacked: Boolean
    ): Unit = js.native
    
    var usedTextures: js.Any = js.native
  }
}
