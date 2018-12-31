package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventFieldType extends js.Object {
  /**
    * Gets or sets the unique identifier of this field type.
    */
  var id: java.lang.String
  var operatorConstraints: js.Array[OperatorConstraint]
  /**
    * Gets or sets the list of operators that this type supports.
    */
  var operators: js.Array[NotificationEventFieldOperator]
  var subscriptionFieldType: SubscriptionFieldType
  /**
    * Gets or sets the value definition of this field like the getValuesMethod and template to display in the UI
    */
  var value: ValueDefinition
}

