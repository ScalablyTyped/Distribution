package typings.uifabricReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Condition extends StObject {
    
    /** Whether the condition is met */
    var condition: Boolean
    
    /** Name of the prop that the condition is based on */
    var conditionalPropName: String
    
    /** Props required when the condition is met */
    var requiredProps: js.Array[String]
  }
  object Condition {
    
    inline def apply(condition: Boolean, conditionalPropName: String, requiredProps: js.Array[String]): Condition = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], conditionalPropName = conditionalPropName.asInstanceOf[js.Any], requiredProps = requiredProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    extension [Self <: Condition](x: Self) {
      
      inline def setCondition(value: Boolean): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionalPropName(value: String): Self = StObject.set(x, "conditionalPropName", value.asInstanceOf[js.Any])
      
      inline def setRequiredProps(value: js.Array[String]): Self = StObject.set(x, "requiredProps", value.asInstanceOf[js.Any])
      
      inline def setRequiredPropsVarargs(value: String*): Self = StObject.set(x, "requiredProps", js.Array(value :_*))
    }
  }
}
