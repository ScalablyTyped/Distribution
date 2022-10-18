package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.Backend
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAbsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abs(args: Backend): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(args.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", "absConfig")
  @js.native
  val absConfig: KernelConfig = js.native
  
  inline def simpleAbsImpl(vals: TypedArray): js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleAbsImpl")(vals.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array]
}
