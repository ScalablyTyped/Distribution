package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMetadataArgsMod {
  
  trait CheckMetadataArgs extends StObject {
    
    /**
      * Check expression.
      */
    var expression: String
    
    /**
      * Check constraint name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Class to which index is applied.
      */
    var target: js.Function | String
  }
  object CheckMetadataArgs {
    
    inline def apply(expression: String, target: js.Function | String): CheckMetadataArgs = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckMetadataArgs]
    }
    
    extension [Self <: CheckMetadataArgs](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
