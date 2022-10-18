package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSparseSparseReshapeUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse/sparse_reshape_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSparseReshapeEmptyTensorZeroOutputDimErrorMessage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSparseReshapeEmptyTensorZeroOutputDimErrorMessage")().asInstanceOf[String]
  
  inline def getSparseReshapeInputOutputMismatchErrorMessage(inputShape: js.Array[Double], outputShape: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSparseReshapeInputOutputMismatchErrorMessage")(inputShape.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSparseReshapeInputOutputMultipleErrorMessage(inputShape: js.Array[Double], outputShape: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSparseReshapeInputOutputMultipleErrorMessage")(inputShape.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSparseReshapeMultipleNegativeOneOutputDimErrorMessage(dim1: Double, dim2: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSparseReshapeMultipleNegativeOneOutputDimErrorMessage")(dim1.asInstanceOf[js.Any], dim2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSparseReshapeNegativeOutputDimErrorMessage(dim: Double, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSparseReshapeNegativeOutputDimErrorMessage")(dim.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
}
