package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionFilterClause extends js.Object {
  var fieldName: java.lang.String
  /**
    * The order in which this clause appeared in the filter query
    */
  var index: scala.Double
  /**
    * Logical Operator 'AND', 'OR' or NULL (only for the first clause in the filter)
    */
  var logicalOperator: java.lang.String
  var operator: java.lang.String
  var value: java.lang.String
}

object ExpressionFilterClause {
  @scala.inline
  def apply(
    fieldName: java.lang.String,
    index: scala.Double,
    logicalOperator: java.lang.String,
    operator: java.lang.String,
    value: java.lang.String
  ): ExpressionFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("logicalOperator")(logicalOperator)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExpressionFilterClause]
  }
}

