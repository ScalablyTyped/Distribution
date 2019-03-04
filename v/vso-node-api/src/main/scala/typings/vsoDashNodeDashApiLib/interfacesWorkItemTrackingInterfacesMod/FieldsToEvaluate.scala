package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsToEvaluate extends js.Object {
  /**
    * Updated field values to evaluate.
    */
  var fieldUpdates: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Initial field values.
    */
  var fieldValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * List of fields to evaluate.
    */
  var fields: js.Array[java.lang.String]
  /**
    * URL of the work item type for which the rules need to be executed.
    */
  var rulesFrom: js.Array[java.lang.String]
}

object FieldsToEvaluate {
  @scala.inline
  def apply(
    fieldUpdates: org.scalablytyped.runtime.StringDictionary[js.Any],
    fieldValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    fields: js.Array[java.lang.String],
    rulesFrom: js.Array[java.lang.String]
  ): FieldsToEvaluate = {
    val __obj = js.Dynamic.literal(fieldUpdates = fieldUpdates, fieldValues = fieldValues, fields = fields, rulesFrom = rulesFrom)
  
    __obj.asInstanceOf[FieldsToEvaluate]
  }
}

