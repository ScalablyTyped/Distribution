package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterClause extends js.Object {
  var fieldName: java.lang.String
  var index: scala.Double
  var logicalOperator: java.lang.String
  var operator: java.lang.String
  var value: java.lang.String
}

object FilterClause {
  @scala.inline
  def apply(
    fieldName: java.lang.String,
    index: scala.Double,
    logicalOperator: java.lang.String,
    operator: java.lang.String,
    value: java.lang.String
  ): FilterClause = {
    val __obj = js.Dynamic.literal(fieldName = fieldName, index = index, logicalOperator = logicalOperator, operator = operator, value = value)
  
    __obj.asInstanceOf[FilterClause]
  }
}

