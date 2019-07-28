package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionFilterClause extends js.Object {
  var fieldName: String
  /**
    * The order in which this clause appeared in the filter query
    */
  var index: Double
  /**
    * Logical Operator 'AND', 'OR' or NULL (only for the first clause in the filter)
    */
  var logicalOperator: String
  var operator: String
  var value: String
}

object ExpressionFilterClause {
  @scala.inline
  def apply(fieldName: String, index: Double, logicalOperator: String, operator: String, value: String): ExpressionFilterClause = {
    val __obj = js.Dynamic.literal(fieldName = fieldName, index = index, logicalOperator = logicalOperator, operator = operator, value = value)
  
    __obj.asInstanceOf[ExpressionFilterClause]
  }
}

