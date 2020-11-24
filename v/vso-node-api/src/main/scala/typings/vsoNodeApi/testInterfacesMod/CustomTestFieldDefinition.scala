package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTestFieldDefinition extends js.Object {
  
  var fieldId: Double = js.native
  
  var fieldName: String = js.native
  
  var fieldType: CustomTestFieldType = js.native
  
  var scope: CustomTestFieldScope = js.native
}
object CustomTestFieldDefinition {
  
  @scala.inline
  def apply(fieldId: Double, fieldName: String, fieldType: CustomTestFieldType, scope: CustomTestFieldScope): CustomTestFieldDefinition = {
    val __obj = js.Dynamic.literal(fieldId = fieldId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestFieldDefinition]
  }
  
  @scala.inline
  implicit class CustomTestFieldDefinitionOps[Self <: CustomTestFieldDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldId(value: Double): Self = this.set("fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: CustomTestFieldType): Self = this.set("fieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: CustomTestFieldScope): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
}
