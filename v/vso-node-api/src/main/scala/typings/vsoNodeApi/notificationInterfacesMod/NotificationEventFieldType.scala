package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventFieldType extends StObject {
  
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
  
  inline def apply(
    id: String,
    operatorConstraints: js.Array[OperatorConstraint],
    operators: js.Array[NotificationEventFieldOperator],
    subscriptionFieldType: SubscriptionFieldType,
    value: ValueDefinition
  ): NotificationEventFieldType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], operatorConstraints = operatorConstraints.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], subscriptionFieldType = subscriptionFieldType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventFieldType]
  }
  
  extension [Self <: NotificationEventFieldType](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOperatorConstraints(value: js.Array[OperatorConstraint]): Self = StObject.set(x, "operatorConstraints", value.asInstanceOf[js.Any])
    
    inline def setOperatorConstraintsVarargs(value: OperatorConstraint*): Self = StObject.set(x, "operatorConstraints", js.Array(value :_*))
    
    inline def setOperators(value: js.Array[NotificationEventFieldOperator]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsVarargs(value: NotificationEventFieldOperator*): Self = StObject.set(x, "operators", js.Array(value :_*))
    
    inline def setSubscriptionFieldType(value: SubscriptionFieldType): Self = StObject.set(x, "subscriptionFieldType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ValueDefinition): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
