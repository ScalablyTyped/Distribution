package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/signal_ops_util", JSImport.Namespace)
@js.native
object signalOpsUtilMod extends js.Object {
  
  def cosineWindow(windowLength: Double, a: Double, b: Double): Tensor1D = js.native
  
  def enclosingPowerOfTwo(value: Double): Double = js.native
}
