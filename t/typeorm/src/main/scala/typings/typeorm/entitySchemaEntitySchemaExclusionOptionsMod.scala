package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaEntitySchemaExclusionOptionsMod {
  
  trait EntitySchemaExclusionOptions extends StObject {
    
    /**
      * Exclusion expression.
      */
    var expression: String
    
    /**
      * Exclusion constraint name.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object EntitySchemaExclusionOptions {
    
    inline def apply(expression: String): EntitySchemaExclusionOptions = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntitySchemaExclusionOptions]
    }
    
    extension [Self <: EntitySchemaExclusionOptions](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
