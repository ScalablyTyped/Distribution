package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distVariablesMod.LayerVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsVariableUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/variable_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def countParamsInWeights(weights: js.Array[LayerVariable]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countParamsInWeights")(weights.asInstanceOf[js.Any]).asInstanceOf[Double]
}
