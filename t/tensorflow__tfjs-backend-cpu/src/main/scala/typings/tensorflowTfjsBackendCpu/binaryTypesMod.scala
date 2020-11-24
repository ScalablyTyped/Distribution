package typings.tensorflowTfjsBackendCpu

import typings.std.Float32Array
import typings.tensorflowTfjsBackendCpu.anon.Real
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/binary_types", JSImport.Namespace)
@js.native
object binaryTypesMod extends js.Object {
  
  type ComplexBinaryKernelImpl = js.Function6[
    /* aShape */ js.Array[Double], 
    /* bShape */ js.Array[Double], 
    /* aRealVals */ Float32Array, 
    /* aImagVals */ Float32Array, 
    /* bRealVals */ Float32Array, 
    /* bImagVals */ Float32Array, 
    js.Tuple3[TypedArray, TypedArray, js.Array[Double]]
  ]
  
  type ComplexBinaryOperation = js.Function4[/* aReal */ Double, /* aImag */ Double, /* bReal */ Double, /* bImag */ Double, Real]
  
  type SimpleBinaryKernelImpl = js.Function5[
    /* aShape */ js.Array[Double], 
    /* bShape */ js.Array[Double], 
    /* aVals */ TypedArray, 
    /* bVals */ TypedArray, 
    /* dtype */ DataType, 
    js.Tuple2[TypedArray, js.Array[Double]]
  ]
  
  type SimpleBinaryOperation = js.Function2[/* a */ Double, /* b */ Double, Double]
}
