package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.Real
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsBinaryTypesMod {
  
  type ComplexBinaryKernelImpl = js.Function6[
    /* aShape */ js.Array[Double], 
    /* bShape */ js.Array[Double], 
    /* aRealVals */ js.typedarray.Float32Array, 
    /* aImagVals */ js.typedarray.Float32Array, 
    /* bRealVals */ js.typedarray.Float32Array, 
    /* bImagVals */ js.typedarray.Float32Array, 
    js.Tuple3[TypedArray, TypedArray, js.Array[Double]]
  ]
  
  type ComplexBinaryOperation = js.Function4[/* aReal */ Double, /* aImag */ Double, /* bReal */ Double, /* bImag */ Double, Real]
  
  type SimpleBinaryKernelImpl = js.Function5[
    /* aShape */ js.Array[Double], 
    /* bShape */ js.Array[Double], 
    /* aVals */ TypedArray | js.Array[String], 
    /* bVals */ TypedArray | js.Array[String], 
    /* dtype */ DataType, 
    js.Tuple2[TypedArray, js.Array[Double]]
  ]
  
  type SimpleBinaryOperation = js.Function2[/* a */ Double | String, /* b */ Double | String, Double]
}
