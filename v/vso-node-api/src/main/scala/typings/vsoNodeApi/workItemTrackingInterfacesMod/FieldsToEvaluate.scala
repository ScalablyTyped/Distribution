package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsToEvaluate extends js.Object {
  /**
    * Updated field values to evaluate.
    */
  var fieldUpdates: StringDictionary[js.Any]
  /**
    * Initial field values.
    */
  var fieldValues: StringDictionary[js.Any]
  /**
    * List of fields to evaluate.
    */
  var fields: js.Array[String]
  /**
    * URL of the work item type for which the rules need to be executed.
    */
  var rulesFrom: js.Array[String]
}

object FieldsToEvaluate {
  @scala.inline
  def apply(
    fieldUpdates: StringDictionary[js.Any],
    fieldValues: StringDictionary[js.Any],
    fields: js.Array[String],
    rulesFrom: js.Array[String]
  ): FieldsToEvaluate = {
    val __obj = js.Dynamic.literal(fieldUpdates = fieldUpdates.asInstanceOf[js.Any], fieldValues = fieldValues.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], rulesFrom = rulesFrom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldsToEvaluate]
  }
}

