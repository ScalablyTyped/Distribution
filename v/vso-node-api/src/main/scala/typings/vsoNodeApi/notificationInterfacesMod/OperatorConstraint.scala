package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatorConstraint extends StObject {
  
  var operator: String
  
  /**
    * Gets or sets the list of scopes that this type supports.
    */
  var supportedScopes: js.Array[String]
}
object OperatorConstraint {
  
  @scala.inline
  def apply(operator: String, supportedScopes: js.Array[String]): OperatorConstraint = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorConstraint]
  }
  
  @scala.inline
  implicit class OperatorConstraintMutableBuilder[Self <: OperatorConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopes(value: js.Array[String]): Self = StObject.set(x, "supportedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopesVarargs(value: String*): Self = StObject.set(x, "supportedScopes", js.Array(value :_*))
  }
}
