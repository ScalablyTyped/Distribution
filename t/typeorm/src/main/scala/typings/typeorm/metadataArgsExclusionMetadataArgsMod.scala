package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsExclusionMetadataArgsMod {
  
  trait ExclusionMetadataArgs extends StObject {
    
    /**
      * Exclusion expression.
      */
    var expression: String
    
    /**
      * Exclusion constraint name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Class to which index is applied.
      */
    var target: js.Function | String
  }
  object ExclusionMetadataArgs {
    
    @scala.inline
    def apply(expression: String, target: js.Function | String): ExclusionMetadataArgs = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExclusionMetadataArgs]
    }
    
    @scala.inline
    implicit class ExclusionMetadataArgsMutableBuilder[Self <: ExclusionMetadataArgs] (val x: Self) extends AnyVal {
      
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
