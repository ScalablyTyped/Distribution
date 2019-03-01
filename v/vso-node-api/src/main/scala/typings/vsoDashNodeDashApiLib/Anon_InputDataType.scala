package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputDataType extends js.Object {
  var InputDataType: Anon_EnumValuesAnonBooleanGuid
  var InputDescriptor: Anon_Fields
  var InputFilter: Anon_Fields
  var InputFilterCondition: Anon_Fields
  var InputFilterOperator: Anon_EnumValuesAnonEquals
  var InputMode: Anon_EnumValuesAnonCheckBox
  var InputValidation: Anon_Fields
  var InputValue: Anon_Fields
  var InputValues: Anon_Fields
  var InputValuesError: Anon_Fields
  var InputValuesQuery: Anon_Fields
}

object Anon_InputDataType {
  @scala.inline
  def apply(
    InputDataType: Anon_EnumValuesAnonBooleanGuid,
    InputDescriptor: Anon_Fields,
    InputFilter: Anon_Fields,
    InputFilterCondition: Anon_Fields,
    InputFilterOperator: Anon_EnumValuesAnonEquals,
    InputMode: Anon_EnumValuesAnonCheckBox,
    InputValidation: Anon_Fields,
    InputValue: Anon_Fields,
    InputValues: Anon_Fields,
    InputValuesError: Anon_Fields,
    InputValuesQuery: Anon_Fields
  ): Anon_InputDataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InputDataType")(InputDataType)
    __obj.updateDynamic("InputDescriptor")(InputDescriptor)
    __obj.updateDynamic("InputFilter")(InputFilter)
    __obj.updateDynamic("InputFilterCondition")(InputFilterCondition)
    __obj.updateDynamic("InputFilterOperator")(InputFilterOperator)
    __obj.updateDynamic("InputMode")(InputMode)
    __obj.updateDynamic("InputValidation")(InputValidation)
    __obj.updateDynamic("InputValue")(InputValue)
    __obj.updateDynamic("InputValues")(InputValues)
    __obj.updateDynamic("InputValuesError")(InputValuesError)
    __obj.updateDynamic("InputValuesQuery")(InputValuesQuery)
    __obj.asInstanceOf[Anon_InputDataType]
  }
}

