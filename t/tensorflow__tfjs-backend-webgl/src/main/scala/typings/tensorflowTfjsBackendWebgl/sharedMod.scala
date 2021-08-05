package typings.tensorflowTfjsBackendWebgl

import typings.std.Float32Array
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof shared.simpleAbsImpl` */
  inline def simpleAbsImplCPU(vals: TypedArray): Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleAbsImplCPU")(vals.asInstanceOf[js.Any]).asInstanceOf[Float32Array]
  
  type SimpleBinaryKernelImplCPU = SimpleBinaryKernelImpl
}
