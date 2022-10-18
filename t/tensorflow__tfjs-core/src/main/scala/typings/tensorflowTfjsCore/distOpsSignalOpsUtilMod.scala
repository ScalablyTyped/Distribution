package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSignalOpsUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/signal_ops_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cosineWindow(windowLength: Double, a: Double, b: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineWindow")(windowLength.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  inline def enclosingPowerOfTwo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("enclosingPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
