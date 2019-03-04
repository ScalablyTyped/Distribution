package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFilterCondition extends js.Object {
  /**
    * Whether or not to do a case sensitive match
    */
  var caseSensitive: scala.Boolean
  /**
    * The Id of the input to filter on
    */
  var inputId: java.lang.String
  /**
    * The "expected" input value to compare with the actual input value
    */
  var inputValue: java.lang.String
  /**
    * The operator applied between the expected and actual input value
    */
  var operator: InputFilterOperator
}

object InputFilterCondition {
  @scala.inline
  def apply(
    caseSensitive: scala.Boolean,
    inputId: java.lang.String,
    inputValue: java.lang.String,
    operator: InputFilterOperator
  ): InputFilterCondition = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive, inputId = inputId, inputValue = inputValue, operator = operator)
  
    __obj.asInstanceOf[InputFilterCondition]
  }
}

