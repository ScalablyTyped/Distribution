package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelUtilsReduceMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduce(x: TensorInfo, dtype: DataType, reductionType: ReduceTypes, backend: MathBackendWebGL): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], reductionType.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.mean
  */
  trait ReduceTypes extends StObject
  object ReduceTypes {
    
    inline def all: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all = "all".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all]
    
    inline def any: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any = "any".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any]
    
    inline def max: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max = "max".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max]
    
    inline def mean: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.mean = "mean".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.mean]
    
    inline def min: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min = "min".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min]
    
    inline def prod: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod = "prod".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod]
    
    inline def sum: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum = "sum".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum]
  }
}
