package typings.typeorm

import typings.typeorm.mod.Connection
import typings.typeorm.mod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsViewOptionsMod {
  
  @js.native
  trait ViewOptions extends StObject {
    
    /**
      * View expression.
      */
    var expression: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]]) = js.native
    
    /**
      * Indicates if view is materialized
      */
    var materialized: js.UndefOr[Boolean] = js.native
    
    /**
      * View name.
      */
    var name: String = js.native
  }
  object ViewOptions {
    
    @scala.inline
    def apply(
      expression: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]]),
      name: String
    ): ViewOptions = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewOptions]
    }
    
    @scala.inline
    implicit class ViewOptionsMutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]])): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionFunction1(value: /* connection */ Connection => SelectQueryBuilder[_]): Self = StObject.set(x, "expression", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaterialized(value: Boolean): Self = StObject.set(x, "materialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaterializedUndefined: Self = StObject.set(x, "materialized", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
