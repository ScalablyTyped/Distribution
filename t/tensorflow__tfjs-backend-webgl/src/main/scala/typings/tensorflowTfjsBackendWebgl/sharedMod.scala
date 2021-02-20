package typings.tensorflowTfjsBackendWebgl

import typings.std.Float32Array
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  /* was `typeof shared.simpleAbsImpl` */
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/shared", "simpleAbsImplCPU")
  @js.native
  def simpleAbsImplCPU(vals: TypedArray): Float32Array = js.native
  
  type SimpleBinaryKernelImplCPU = SimpleBinaryKernelImpl
}
