package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCheckOptionsMod {
  
  @js.native
  trait TableCheckOptions extends StObject {
    
    /**
      * Column that contains this constraint.
      */
    var columnNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Check expression.
      */
    var expression: js.UndefOr[String] = js.native
    
    /**
      * Constraint name.
      */
    var name: js.UndefOr[String] = js.native
  }
  object TableCheckOptions {
    
    @scala.inline
    def apply(): TableCheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCheckOptions]
    }
    
    @scala.inline
    implicit class TableCheckOptionsMutableBuilder[Self <: TableCheckOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
      
      @scala.inline
      def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      @scala.inline
      def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
