package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.Axes
import typings.tensorflowTfjsBackendWasm.backendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/kernel_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def permuteAxesAndTranspose(x: TensorInfo, axis: js.Array[Double], backend: BackendWasm): Axes = (^.asInstanceOf[js.Dynamic].applyDynamic("permuteAxesAndTranspose")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[Axes]
  inline def permuteAxesAndTranspose(x: TensorInfo, axis: Double, backend: BackendWasm): Axes = (^.asInstanceOf[js.Dynamic].applyDynamic("permuteAxesAndTranspose")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[Axes]
}
