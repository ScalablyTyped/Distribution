package typings.typeorm

import typings.typeorm.browserMod.Connection
import typings.typeorm.browserMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewOptionsMod {
  
  trait ViewOptions extends StObject {
    
    /**
      * View expression.
      */
    var expression: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[js.Any]])
    
    /**
      * Indicates if view is materialized
      */
    var materialized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * View name.
      */
    var name: String
  }
  object ViewOptions {
    
    inline def apply(
      expression: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[js.Any]]),
      name: String
    ): ViewOptions = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewOptions]
    }
    
    extension [Self <: ViewOptions](x: Self) {
      
      inline def setExpression(value: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[js.Any]])): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionFunction1(value: /* connection */ Connection => SelectQueryBuilder[js.Any]): Self = StObject.set(x, "expression", js.Any.fromFunction1(value))
      
      inline def setMaterialized(value: Boolean): Self = StObject.set(x, "materialized", value.asInstanceOf[js.Any])
      
      inline def setMaterializedUndefined: Self = StObject.set(x, "materialized", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
