package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestField extends js.Object {
  var fieldName: java.lang.String
  var value: js.Any
}

object CustomTestField {
  @scala.inline
  def apply(fieldName: java.lang.String, value: js.Any): CustomTestField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomTestField]
  }
}

