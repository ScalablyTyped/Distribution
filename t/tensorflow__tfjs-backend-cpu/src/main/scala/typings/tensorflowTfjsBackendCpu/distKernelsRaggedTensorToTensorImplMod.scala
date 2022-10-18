package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRaggedTensorToTensorImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RaggedTensorToTensor_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def raggedTensorToTensorImpl(
    shape: TypedArray,
    shapesShape: js.Array[Double],
    values: TypedArray,
    valuesShape: js.Array[Double],
    valuesDType: DataType,
    defaultValue: TypedArray,
    defaultValueShape: js.Array[Double],
    rowPartitionValues: js.Array[TypedArray],
    rowPartitionValuesShapes: js.Array[js.Array[Double]],
    rowPartitionTypes: js.Array[String]
  ): js.Tuple2[js.Array[Double], TypedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("raggedTensorToTensorImpl")(shape.asInstanceOf[js.Any], shapesShape.asInstanceOf[js.Any], values.asInstanceOf[js.Any], valuesShape.asInstanceOf[js.Any], valuesDType.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], defaultValueShape.asInstanceOf[js.Any], rowPartitionValues.asInstanceOf[js.Any], rowPartitionValuesShapes.asInstanceOf[js.Any], rowPartitionTypes.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], TypedArray]]
}
