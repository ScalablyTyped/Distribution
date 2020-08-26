package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/shared", JSImport.Namespace)
@js.native
object sharedMod extends js.Object {
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(transposeImplCPU) */ val maxImplCPU: js.Function4[
    /* aVals */ TypedArray, 
    /* reduceSize */ Double, 
    /* outShape */ js.Array[Double], 
    /* dtype */ DataType, 
    TypedArray
  ] = js.native
}

