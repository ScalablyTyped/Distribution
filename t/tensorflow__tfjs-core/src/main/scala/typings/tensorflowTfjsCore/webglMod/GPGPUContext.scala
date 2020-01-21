package typings.tensorflowTfjsCore.webglMod

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/webgl", "GPGPUContext")
@js.native
class GPGPUContext ()
  extends typings.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext {
  def this(gl: WebGLRenderingContext) = this()
}

