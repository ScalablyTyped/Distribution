package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsStringNGramsAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringNGramsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StringNGrams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringNGrams(args: AttrsStringNGramsAttrs): js.Tuple2[TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StringNGrams", "stringNGramsConfig")
  @js.native
  val stringNGramsConfig: KernelConfig = js.native
}
