package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatorConstraint extends js.Object {
  
  var operator: String = js.native
  
  /**
    * Gets or sets the list of scopes that this type supports.
    */
  var supportedScopes: js.Array[String] = js.native
}
object OperatorConstraint {
  
  @scala.inline
  def apply(operator: String, supportedScopes: js.Array[String]): OperatorConstraint = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorConstraint]
  }
  
  @scala.inline
  implicit class OperatorConstraintOps[Self <: OperatorConstraint] (val x: Self) extends AnyVal {
    
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
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopesVarargs(value: String*): Self = this.set("supportedScopes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedScopes(value: js.Array[String]): Self = this.set("supportedScopes", value.asInstanceOf[js.Any])
  }
}
