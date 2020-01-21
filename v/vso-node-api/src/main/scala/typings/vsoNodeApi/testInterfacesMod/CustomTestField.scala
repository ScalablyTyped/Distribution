package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestField extends js.Object {
  var fieldName: String
  var value: js.Any
}

object CustomTestField {
  @scala.inline
  def apply(fieldName: String, value: js.Any): CustomTestField = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomTestField]
  }
}

