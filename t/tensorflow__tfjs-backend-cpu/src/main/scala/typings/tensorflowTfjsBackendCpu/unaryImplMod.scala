package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unaryImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createSimpleUnaryImpl(op: SimpleUnaryOperation): SimpleUnaryImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleUnaryImpl")(op.asInstanceOf[js.Any]).asInstanceOf[SimpleUnaryImpl]
}
