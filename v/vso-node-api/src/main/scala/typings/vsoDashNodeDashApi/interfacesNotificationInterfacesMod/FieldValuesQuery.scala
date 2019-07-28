package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputValuesQuery
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
    val __obj = js.Dynamic.literal(currentValues = currentValues, inputValues = inputValues, resource = resource, scope = scope)
  
    __obj.asInstanceOf[FieldValuesQuery]
  }
}

