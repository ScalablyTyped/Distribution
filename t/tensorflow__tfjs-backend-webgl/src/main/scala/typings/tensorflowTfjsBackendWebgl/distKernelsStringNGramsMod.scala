package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsStringNGramsAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsStringNGramsMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StringNGrams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringNGrams(args: AttrsStringNGramsAttrs): js.Tuple2[TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StringNGrams", "stringNGramsConfig")
  @js.native
  val stringNGramsConfig: KernelConfig = js.native
}
