package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestFieldDefinition extends js.Object {
  var fieldId: scala.Double
  var fieldName: java.lang.String
  var fieldType: CustomTestFieldType
  var scope: CustomTestFieldScope
}

object CustomTestFieldDefinition {
  @scala.inline
  def apply(
    fieldId: scala.Double,
    fieldName: java.lang.String,
    fieldType: CustomTestFieldType,
    scope: CustomTestFieldScope
  ): CustomTestFieldDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldId")(fieldId)
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.updateDynamic("fieldType")(fieldType)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[CustomTestFieldDefinition]
  }
}

