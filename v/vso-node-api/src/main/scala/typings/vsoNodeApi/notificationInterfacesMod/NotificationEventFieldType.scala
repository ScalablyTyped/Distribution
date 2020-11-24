package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventFieldType extends js.Object {
  
  /**
    * Gets or sets the unique identifier of this field type.
    */
  var id: String = js.native
  
  var operatorConstraints: js.Array[OperatorConstraint] = js.native
  
  /**
    * Gets or sets the list of operators that this type supports.
    */
  var operators: js.Array[NotificationEventFieldOperator] = js.native
  
  var subscriptionFieldType: SubscriptionFieldType = js.native
  
  /**
    * Gets or sets the value definition of this field like the getValuesMethod and template to display in the UI
    */
  var value: ValueDefinition = js.native
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
  
  @scala.inline
  implicit class NotificationEventFieldTypeOps[Self <: NotificationEventFieldType] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorConstraintsVarargs(value: OperatorConstraint*): Self = this.set("operatorConstraints", js.Array(value :_*))
    
    @scala.inline
    def setOperatorConstraints(value: js.Array[OperatorConstraint]): Self = this.set("operatorConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsVarargs(value: NotificationEventFieldOperator*): Self = this.set("operators", js.Array(value :_*))
    
    @scala.inline
    def setOperators(value: js.Array[NotificationEventFieldOperator]): Self = this.set("operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionFieldType(value: SubscriptionFieldType): Self = this.set("subscriptionFieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ValueDefinition): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
