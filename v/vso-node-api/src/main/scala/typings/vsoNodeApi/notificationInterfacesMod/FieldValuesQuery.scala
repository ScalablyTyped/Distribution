package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.formInputInterfacesMod.InputValuesQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValuesQuery extends InputValuesQuery {
  @JSName("inputValues")
  var inputValues_FieldValuesQuery: js.Array[FieldInputValues]
  var scope: String
}

object FieldValuesQuery {
  @scala.inline
  def apply(
    currentValues: StringDictionary[String],
    inputValues: js.Array[FieldInputValues],
    resource: js.Any,
    scope: String
  ): FieldValuesQuery = {
    val __obj = js.Dynamic.literal(currentValues = currentValues.asInstanceOf[js.Any], inputValues = inputValues.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldValuesQuery]
  }
}

