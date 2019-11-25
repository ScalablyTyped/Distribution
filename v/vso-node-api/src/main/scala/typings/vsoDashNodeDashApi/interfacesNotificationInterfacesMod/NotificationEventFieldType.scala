package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventFieldType extends js.Object {
  /**
    * Gets or sets the unique identifier of this field type.
    */
  var id: String
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

object NotificationEventFieldType {
  @scala.inline
  def apply(
    id: String,
    operatorConstraints: js.Array[OperatorConstraint],
    operators: js.Array[NotificationEventFieldOperator],
    subscriptionFieldType: SubscriptionFieldType,
    value: ValueDefinition
  ): NotificationEventFieldType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], operatorConstraints = operatorConstraints.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], subscriptionFieldType = subscriptionFieldType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationEventFieldType]
  }
}

