package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDetailsForTestResults extends js.Object {
  /**
    * Group by field name
    */
  var fieldName: String
  /**
    * Group by field values
    */
  var groupsForField: js.Array[_]
}

object FieldDetailsForTestResults {
  @scala.inline
  def apply(fieldName: String, groupsForField: js.Array[_]): FieldDetailsForTestResults = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], groupsForField = groupsForField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldDetailsForTestResults]
  }
}

