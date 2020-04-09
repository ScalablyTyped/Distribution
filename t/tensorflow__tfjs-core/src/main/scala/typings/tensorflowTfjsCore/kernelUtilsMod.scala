package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/cpu/utils/kernel_utils", JSImport.Namespace)
@js.native
object kernelUtilsMod extends js.Object {
  def createBinaryKernelConfig(
    name: String,
    op: js.Function5[
      /* aShape */ js.Array[Double], 
      /* bShape */ js.Array[Double], 
      /* aVals */ TypedArray, 
      /* bVals */ TypedArray, 
      /* dtype */ DataType, 
      js.Tuple2[TypedArray, js.Array[Double]]
    ]
  ): KernelConfig = js.native
  def createBinaryKernelImpl(op: js.Function2[/* a */ Double, /* b */ Double, Double]): js.Function5[
    /* aShape */ js.Array[Double], 
    /* bShape */ js.Array[Double], 
    /* aVals */ TypedArray, 
    /* bVals */ TypedArray, 
    /* dtype */ string | float32 | int32 | bool | complex64, 
    js.Tuple2[TypedArray, js.Array[Double]]
  ] = js.native
}

