package typings.tensorflowTfjs.distIndexWithPolyfillsMod

import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.distOpsScatterNdUtilMod.ScatterShapeInfo
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterUtil {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "scatter_util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateShapes")(updates.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[ScatterShapeInfo]
  
  inline def validateInput(
    updates: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    shape: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInput")(updates.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateUpdateShape(
    shape: js.Array[Double],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUpdateShape")(shape.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
