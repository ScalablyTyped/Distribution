package typings.uifabricReactHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends js.Object {
  
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
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCondition(value: Boolean): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalPropName(value: String): Self = this.set("conditionalPropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredPropsVarargs(value: String*): Self = this.set("requiredProps", js.Array(value :_*))
    
    @scala.inline
    def setRequiredProps(value: js.Array[String]): Self = this.set("requiredProps", value.asInstanceOf[js.Any])
  }
}
