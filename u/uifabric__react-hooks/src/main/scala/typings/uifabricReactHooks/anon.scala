package typings.uifabricReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Condition extends StObject {
    
    /** Whether the condition is met */
    var condition: Boolean = js.native
    
    /** Name of the prop that the condition is based on */
    var conditionalPropName: String = js.native
    
    /** Props required when the condition is met */
    var requiredProps: js.Array[String] = js.native
  }
  object Condition {
    
    @scala.inline
    def apply(condition: Boolean, conditionalPropName: String, requiredProps: js.Array[String]): Condition = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], conditionalPropName = conditionalPropName.asInstanceOf[js.Any], requiredProps = requiredProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    @scala.inline
    implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: Boolean): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalPropName(value: String): Self = StObject.set(x, "conditionalPropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredProps(value: js.Array[String]): Self = StObject.set(x, "requiredProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredPropsVarargs(value: String*): Self = StObject.set(x, "requiredProps", js.Array(value :_*))
    }
  }
}
