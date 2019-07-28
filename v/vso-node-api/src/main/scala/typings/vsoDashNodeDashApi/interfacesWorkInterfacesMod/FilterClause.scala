package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterClause extends js.Object {
  var fieldName: String
  var index: Double
  var logicalOperator: String
  var operator: String
  var value: String
}

object FilterClause {
  @scala.inline
  def apply(fieldName: String, index: Double, logicalOperator: String, operator: String, value: String): FilterClause = {
    val __obj = js.Dynamic.literal(fieldName = fieldName, index = index, logicalOperator = logicalOperator, operator = operator, value = value)
  
    __obj.asInstanceOf[FilterClause]
  }
}

