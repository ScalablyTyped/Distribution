package typings.tensorflowTfjsBackendWebgl

import typings.std.Float32Array
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/shared", JSImport.Namespace)
@js.native
object sharedMod extends js.Object {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(addImplCPU, ceilImplCPU, expImplCPU, expm1ImplCPU, floorImplCPU, logImplCPU, maxImplCPU, multiplyImplCPU, rsqrtImplCPU, sliceImplCPU, subImplCPU, transposeImplCPU, uniqueImplCPU) */ val simpleAbsImplCPU: js.Function1[/* vals */ TypedArray, Float32Array] = js.native
  
  type SimpleBinaryKernelImplCPU = SimpleBinaryKernelImpl
}
