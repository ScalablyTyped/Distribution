package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaEntitySchemaExclusionOptionsMod {
  
  @js.native
  trait EntitySchemaExclusionOptions extends StObject {
    
    /**
      * Exclusion expression.
      */
    var expression: String = js.native
    
    /**
      * Exclusion constraint name.
      */
    var name: js.UndefOr[String] = js.native
  }
  object EntitySchemaExclusionOptions {
    
    @scala.inline
    def apply(expression: String): EntitySchemaExclusionOptions = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntitySchemaExclusionOptions]
    }
    
    @scala.inline
    implicit class EntitySchemaExclusionOptionsMutableBuilder[Self <: EntitySchemaExclusionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
