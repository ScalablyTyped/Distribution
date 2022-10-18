package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.mod.Optimizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptimizersMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/optimizers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOptimizer(identifier: String): Optimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptimizer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Optimizer]
}
