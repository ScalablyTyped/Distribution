package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatorConstraint extends js.Object {
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
}

