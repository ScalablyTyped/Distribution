package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemQueryClause extends js.Object {
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
  implicit class WorkItemQueryClauseOps[Self <: WorkItemQueryClause] (val x: Self) extends AnyVal {
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
    def setClausesVarargs(value: WorkItemQueryClause*): Self = this.set("clauses", js.Array(value :_*))
    @scala.inline
    def setClauses(value: js.Array[WorkItemQueryClause]): Self = this.set("clauses", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: WorkItemFieldReference): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldValue(value: WorkItemFieldReference): Self = this.set("fieldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFieldValue(value: Boolean): Self = this.set("isFieldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogicalOperator(value: LogicalOperation): Self = this.set("logicalOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: WorkItemFieldOperation): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

