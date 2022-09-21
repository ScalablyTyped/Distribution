package typings.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveConfig extends StObject {
  
  /**
    * Whether the optimizer will be saved (if exists).
    *
    * Default: `false`.
    */
  var includeOptimizer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to save only the trainable weights of the model, ignoring the
    * non-trainable ones.
    */
  var trainableOnly: js.UndefOr[Boolean] = js.undefined
}
object SaveConfig {
  
  inline def apply(): SaveConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveConfig]
  }
  
  extension [Self <: SaveConfig](x: Self) {
    
    inline def setIncludeOptimizer(value: Boolean): Self = StObject.set(x, "includeOptimizer", value.asInstanceOf[js.Any])
    
    inline def setIncludeOptimizerUndefined: Self = StObject.set(x, "includeOptimizer", js.undefined)
    
    inline def setTrainableOnly(value: Boolean): Self = StObject.set(x, "trainableOnly", value.asInstanceOf[js.Any])
    
    inline def setTrainableOnlyUndefined: Self = StObject.set(x, "trainableOnly", js.undefined)
  }
}
