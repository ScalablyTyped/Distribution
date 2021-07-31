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
    
    @scala.inline
    def apply(expression: String, target: js.Function | String): CheckMetadataArgs = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckMetadataArgs]
    }
    
    @scala.inline
    implicit class CheckMetadataArgsMutableBuilder[Self <: CheckMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
