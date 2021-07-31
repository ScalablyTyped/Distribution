package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaCheckOptionsMod {
  
  trait EntitySchemaCheckOptions extends StObject {
    
    /**
      * Check expression.
      */
    var expression: String
    
    /**
      * Check constraint name.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object EntitySchemaCheckOptions {
    
    @scala.inline
    def apply(expression: String): EntitySchemaCheckOptions = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntitySchemaCheckOptions]
    }
    
    @scala.inline
    implicit class EntitySchemaCheckOptionsMutableBuilder[Self <: EntitySchemaCheckOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
