package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDetailsForTestResults extends js.Object {
  /**
    * Group by field name
    */
  var fieldName: java.lang.String
  /**
    * Group by field values
    */
  var groupsForField: js.Array[_]
}

object FieldDetailsForTestResults {
  @scala.inline
  def apply(fieldName: java.lang.String, groupsForField: js.Array[_]): FieldDetailsForTestResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.updateDynamic("groupsForField")(groupsForField)
    __obj.asInstanceOf[FieldDetailsForTestResults]
  }
}

