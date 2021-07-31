package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.variablesMod.LayerVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/variable_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def countParamsInWeights(weights: js.Array[LayerVariable]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countParamsInWeights")(weights.asInstanceOf[js.Any]).asInstanceOf[Double]
}
