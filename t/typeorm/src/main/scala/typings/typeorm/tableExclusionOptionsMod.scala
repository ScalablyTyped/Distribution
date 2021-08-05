package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableExclusionOptionsMod {
  
  trait TableExclusionOptions extends StObject {
    
    /**
      * Exclusion expression.
      */
    var expression: js.UndefOr[String] = js.undefined
    
    /**
      * Constraint name.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object TableExclusionOptions {
    
    inline def apply(): TableExclusionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableExclusionOptions]
    }
    
    extension [Self <: TableExclusionOptions](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
