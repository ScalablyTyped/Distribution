package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemQueryClause extends js.Object {
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
    val __obj = js.Dynamic.literal(clauses = clauses, field = field, fieldValue = fieldValue, isFieldValue = isFieldValue, logicalOperator = logicalOperator, operator = operator, value = value)
  
    __obj.asInstanceOf[WorkItemQueryClause]
  }
}

