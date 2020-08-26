package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionFilterClause extends js.Object {
  var fieldName: String = js.native
  /**
    * The order in which this clause appeared in the filter query
    */
  var index: Double = js.native
  /**
    * Logical Operator 'AND', 'OR' or NULL (only for the first clause in the filter)
    */
  var logicalOperator: String = js.native
  var operator: String = js.native
  var value: String = js.native
}

object ExpressionFilterClause {
  @scala.inline
  def apply(fieldName: String, index: Double, logicalOperator: String, operator: String, value: String): ExpressionFilterClause = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], logicalOperator = logicalOperator.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionFilterClause]
  }
  @scala.inline
  implicit class ExpressionFilterClauseOps[Self <: ExpressionFilterClause] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogicalOperator(value: String): Self = this.set("logicalOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

