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
    val __obj = js.Dynamic.literal(fieldId = fieldId, fieldName = fieldName, fieldType = fieldType, scope = scope)
  
    __obj.asInstanceOf[CustomTestFieldDefinition]
  }
}

