package typings.tensorflowTfjs.distIndexWithPolyfillsMod

import typings.std.HTMLCanvasElement
import typings.std.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "MathBackendWebGL")
@js.native
open class MathBackendWebGL ()
  extends typings.tensorflowTfjs.mod.MathBackendWebGL {
  def this(gpuResource: HTMLCanvasElement) = this()
  def this(gpuResource: OffscreenCanvas) = this()
  def this(gpuResource: typings.tensorflowTfjsBackendWebgl.distGpgpuContextMod.GPGPUContext) = this()
}
/* static members */
object MathBackendWebGL {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "MathBackendWebGL")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "MathBackendWebGL.nextDataId")
  @js.native
  def nextDataId: Any = js.native
  inline def nextDataId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextDataId")(x.asInstanceOf[js.Any])
}
