package typings.swcCore.typesMod

import typings.swcCore.anon.MinCost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizerConfig extends StObject {
  
  var globals: js.UndefOr[GlobalPassOption] = js.undefined
  
  var jsonify: js.UndefOr[MinCost] = js.undefined
  
  var simplify: js.UndefOr[Boolean] = js.undefined
}
object OptimizerConfig {
  
  inline def apply(): OptimizerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizerConfig]
  }
  
  extension [Self <: OptimizerConfig](x: Self) {
    
    inline def setGlobals(value: GlobalPassOption): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setJsonify(value: MinCost): Self = StObject.set(x, "jsonify", value.asInstanceOf[js.Any])
    
    inline def setJsonifyUndefined: Self = StObject.set(x, "jsonify", js.undefined)
    
    inline def setSimplify(value: Boolean): Self = StObject.set(x, "simplify", value.asInstanceOf[js.Any])
    
    inline def setSimplifyUndefined: Self = StObject.set(x, "simplify", js.undefined)
  }
}
