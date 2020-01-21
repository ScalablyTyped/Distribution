package typings.tensorflowTfjsCore

import typings.std.WebGLTexture
import typings.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsCore.texUtilMod.TextureUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/texture_manager", JSImport.Namespace)
@js.native
object textureManagerMod extends js.Object {
  @js.native
  class TextureManager protected () extends js.Object {
    def this(gpgpu: GPGPUContext) = this()
    var freeTextures: js.Any = js.native
    var gpgpu: js.Any = js.native
    var log: js.Any = js.native
    var logEnabled: js.Any = js.native
    var numFreeTextures: js.Any = js.native
    var numUsedTextures: js.Any = js.native
    var usedTextures: js.Any = js.native
    def acquireTexture(shapeRC: js.Tuple2[Double, Double], usage: TextureUsage, isPacked: Boolean): WebGLTexture = js.native
    def dispose(): Unit = js.native
    def getNumFreeTextures(): Double = js.native
    def getNumUsedTextures(): Double = js.native
    def releaseTexture(
      texture: WebGLTexture,
      shape: js.Tuple2[Double, Double],
      logicalTexType: TextureUsage,
      isPacked: Boolean
    ): Unit = js.native
  }
  
}

