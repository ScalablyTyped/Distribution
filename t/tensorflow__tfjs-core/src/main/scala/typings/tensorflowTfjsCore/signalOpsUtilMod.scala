package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signalOpsUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/signal_ops_util", "cosineWindow")
  @js.native
  def cosineWindow(windowLength: Double, a: Double, b: Double): Tensor1D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/signal_ops_util", "enclosingPowerOfTwo")
  @js.native
  def enclosingPowerOfTwo(value: Double): Double = js.native
}
