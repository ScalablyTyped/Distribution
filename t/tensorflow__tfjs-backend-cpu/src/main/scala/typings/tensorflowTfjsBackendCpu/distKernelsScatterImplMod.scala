package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.bool
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.float32
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.int32
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.string
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsScatterImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Scatter_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scatterImpl_int32[R /* <: Rank */, D /* <: float32 | int32 | bool | string */](
    indices: TensorBuffer[R, int32],
    updates: TensorBuffer[R, D],
    shape: js.Array[Double],
    outputSize: Double,
    sliceSize: Double,
    numUpdates: Double,
    sliceRank: Double,
    strides: js.Array[Double],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-backend-cpu.@tensorflow/tfjs-backend-cpu/dist/kernels/Scatter_impl.DefaultValueTypeMap[D] */ js.Any,
    sumDupeIndices: Boolean
  ): TensorBuffer[R, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterImpl")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], outputSize.asInstanceOf[js.Any], sliceSize.asInstanceOf[js.Any], numUpdates.asInstanceOf[js.Any], sliceRank.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], sumDupeIndices.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, D]]
  
  trait DefaultValueTypeMap extends StObject {
    
    var bool: Boolean
    
    var float32: Double
    
    var int32: Double
    
    var string: String
  }
  object DefaultValueTypeMap {
    
    inline def apply(bool: Boolean, float32: Double, int32: Double, string: String): DefaultValueTypeMap = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultValueTypeMap]
    }
    
    extension [Self <: DefaultValueTypeMap](x: Self) {
      
      inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setFloat32(value: Double): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
