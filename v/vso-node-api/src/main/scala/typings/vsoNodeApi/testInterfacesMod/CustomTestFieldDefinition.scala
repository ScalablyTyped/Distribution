package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestFieldDefinition extends js.Object {
  var fieldId: Double
  var fieldName: String
  var fieldType: CustomTestFieldType
  var scope: CustomTestFieldScope
}

object CustomTestFieldDefinition {
  @scala.inline
  def apply(fieldId: Double, fieldName: String, fieldType: CustomTestFieldType, scope: CustomTestFieldScope): CustomTestFieldDefinition = {
    val __obj = js.Dynamic.literal(fieldId = fieldId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestFieldDefinition]
  }
}

