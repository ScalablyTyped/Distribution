package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValuesQuery
  extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputValuesQuery {
  @JSName("inputValues")
  var inputValues_FieldValuesQuery: js.Array[FieldInputValues]
  var scope: java.lang.String
}

object FieldValuesQuery {
  @scala.inline
  def apply(
    currentValues: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    inputValues: js.Array[FieldInputValues],
    resource: js.Any,
    scope: java.lang.String
  ): FieldValuesQuery = {
    val __obj = js.Dynamic.literal(currentValues = currentValues, inputValues = inputValues, resource = resource, scope = scope)
  
    __obj.asInstanceOf[FieldValuesQuery]
  }
}

