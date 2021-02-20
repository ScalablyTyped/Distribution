package typings.tensorflowTfjsBackendCpu

import typings.std.Float32Array
import typings.tensorflowTfjsBackendCpu.anon.Backend
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", "abs")
  @js.native
  def abs(args: Backend): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", "absConfig")
  @js.native
  val absConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", "simpleAbsImpl")
  @js.native
  def simpleAbsImpl(vals: TypedArray): Float32Array = js.native
}
