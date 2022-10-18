package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsLinSpaceImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LinSpace_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linSpaceImpl(start: Double, stop: Double, num: Double): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("linSpaceImpl")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
}
