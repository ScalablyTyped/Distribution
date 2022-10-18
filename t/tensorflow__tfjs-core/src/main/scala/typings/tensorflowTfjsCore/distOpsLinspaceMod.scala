package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLinspaceMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/linspace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linspace(start: Double, stop: Double, num: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("linspace")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
}
