package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUnaryImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSimpleUnaryImpl[I /* <: Double | String */, O /* <: Double | String */](op: SimpleUnaryOperation[I, O]): SimpleUnaryImpl[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleUnaryImpl")(op.asInstanceOf[js.Any]).asInstanceOf[SimpleUnaryImpl[I, O]]
}
