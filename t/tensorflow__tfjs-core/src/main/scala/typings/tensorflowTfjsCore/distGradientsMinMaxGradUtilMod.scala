package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.X
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGradientsMinMaxGradUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/gradients/min_max_grad_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gradForMinAndMax[T /* <: Tensor[Rank] */](dy: T, y: T, xOrig: Tensor[Rank], origAxes: js.Array[Double]): X = (^.asInstanceOf[js.Dynamic].applyDynamic("gradForMinAndMax")(dy.asInstanceOf[js.Any], y.asInstanceOf[js.Any], xOrig.asInstanceOf[js.Any], origAxes.asInstanceOf[js.Any])).asInstanceOf[X]
}
