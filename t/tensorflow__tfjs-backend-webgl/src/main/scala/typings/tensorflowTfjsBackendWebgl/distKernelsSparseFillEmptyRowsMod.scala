package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsSparseFillEmptyRowsInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSparseFillEmptyRowsMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SparseFillEmptyRows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseFillEmptyRows(args: InputsSparseFillEmptyRowsInputs): js.Tuple4[TensorInfo, TensorInfo, TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[TensorInfo, TensorInfo, TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SparseFillEmptyRows", "sparseFillEmptyRowsConfig")
  @js.native
  val sparseFillEmptyRowsConfig: KernelConfig = js.native
}
