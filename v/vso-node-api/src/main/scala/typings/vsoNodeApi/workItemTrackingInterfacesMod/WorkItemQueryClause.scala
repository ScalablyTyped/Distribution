package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemQueryClause extends StObject {
  
  /**
    * Child clauses if the current clause is a logical operator
    */
  var clauses: js.Array[WorkItemQueryClause] = js.native
  
  /**
    * Field associated with condition
    */
  var field: WorkItemFieldReference = js.native
  
  /**
    * Right side of the condition when a field to field comparison
    */
  var fieldValue: WorkItemFieldReference = js.native
  
  /**
    * Determines if this is a field to field comparison
    */
  var isFieldValue: Boolean = js.native
  
  /**
    * Logical operator separating the condition clause
    */
  var logicalOperator: LogicalOperation = js.native
  
  /**
    * The field operator
    */
  var operator: WorkItemFieldOperation = js.native
  
  /**
    * Right side of the condition when a field to value comparison
    */
  var value: String = js.native
}
object WorkItemQueryClause {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class WorkItemQueryClauseMutableBuilder[Self <: WorkItemQueryClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClauses(value: js.Array[WorkItemQueryClause]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClausesVarargs(value: WorkItemQueryClause*): Self = StObject.set(x, "clauses", js.Array(value :_*))
    
    @scala.inline
    def setField(value: WorkItemFieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldValue(value: WorkItemFieldReference): Self = StObject.set(x, "fieldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFieldValue(value: Boolean): Self = StObject.set(x, "isFieldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalOperator(value: LogicalOperation): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: WorkItemFieldOperation): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
