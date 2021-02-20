package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsTableExclusionOptionsMod {
  
  @js.native
  trait TableExclusionOptions extends StObject {
    
    /**
      * Exclusion expression.
      */
    var expression: js.UndefOr[String] = js.native
    
    /**
      * Constraint name.
      */
    var name: js.UndefOr[String] = js.native
  }
  object TableExclusionOptions {
    
    @scala.inline
    def apply(): TableExclusionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableExclusionOptions]
    }
    
    @scala.inline
    implicit class TableExclusionOptionsMutableBuilder[Self <: TableExclusionOptions] (val x: Self) extends AnyVal {
      
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
