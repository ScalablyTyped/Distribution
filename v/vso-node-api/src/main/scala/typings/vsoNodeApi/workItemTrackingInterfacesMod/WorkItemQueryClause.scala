package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemQueryClause extends StObject {
  
  /**
    * Child clauses if the current clause is a logical operator
    */
  var clauses: js.Array[WorkItemQueryClause]
  
  /**
    * Field associated with condition
    */
  var field: WorkItemFieldReference
  
  /**
    * Right side of the condition when a field to field comparison
    */
  var fieldValue: WorkItemFieldReference
  
  /**
    * Determines if this is a field to field comparison
    */
  var isFieldValue: Boolean
  
  /**
    * Logical operator separating the condition clause
    */
  var logicalOperator: LogicalOperation
  
  /**
    * The field operator
    */
  var operator: WorkItemFieldOperation
  
  /**
    * Right side of the condition when a field to value comparison
    */
  var value: String
}
object WorkItemQueryClause {
  
  inline def apply(
    clauses: js.Array[WorkItemQueryClause],
    field: WorkItemFieldReference,
    fieldValue: WorkItemFieldReference,
    isFieldValue: Boolean,
    logicalOperator: LogicalOperation,
    operator: WorkItemFieldOperation,
    value: String
  ): WorkItemQueryClause = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldValue = fieldValue.asInstanceOf[js.Any], isFieldValue = isFieldValue.asInstanceOf[js.Any], logicalOperator = logicalOperator.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemQueryClause]
  }
  
  extension [Self <: WorkItemQueryClause](x: Self) {
    
    inline def setClauses(value: js.Array[WorkItemQueryClause]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setClausesVarargs(value: WorkItemQueryClause*): Self = StObject.set(x, "clauses", js.Array(value*))
    
    inline def setField(value: WorkItemFieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldValue(value: WorkItemFieldReference): Self = StObject.set(x, "fieldValue", value.asInstanceOf[js.Any])
    
    inline def setIsFieldValue(value: Boolean): Self = StObject.set(x, "isFieldValue", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperator(value: LogicalOperation): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: WorkItemFieldOperation): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
