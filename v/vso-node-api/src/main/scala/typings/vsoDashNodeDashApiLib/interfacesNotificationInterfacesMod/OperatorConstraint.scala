package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatorConstraint extends js.Object {
  var operator: java.lang.String
  /**
    * Gets or sets the list of scopes that this type supports.
    */
  var supportedScopes: js.Array[java.lang.String]
}

object OperatorConstraint {
  @scala.inline
  def apply(operator: java.lang.String, supportedScopes: js.Array[java.lang.String]): OperatorConstraint = {
    val __obj = js.Dynamic.literal(operator = operator, supportedScopes = supportedScopes)
  
    __obj.asInstanceOf[OperatorConstraint]
  }
}

