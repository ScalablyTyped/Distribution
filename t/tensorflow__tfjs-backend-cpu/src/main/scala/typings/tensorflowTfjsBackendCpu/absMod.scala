package typings.tensorflowTfjsBackendCpu

import typings.std.Float32Array
import typings.tensorflowTfjsBackendCpu.anon.Backend
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abs(args: Backend): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(args.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", "absConfig")
  @js.native
  val absConfig: KernelConfig = js.native
  
  inline def simpleAbsImpl(vals: TypedArray): Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleAbsImpl")(vals.asInstanceOf[js.Any]).asInstanceOf[Float32Array]
}
