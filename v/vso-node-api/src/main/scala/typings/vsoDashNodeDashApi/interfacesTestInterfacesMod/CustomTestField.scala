package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal(fieldName = fieldName, value = value)
  
    __obj.asInstanceOf[CustomTestField]
  }
}

