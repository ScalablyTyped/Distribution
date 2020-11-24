package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumTypeName extends js.Object {
  
  var enumTypeName: js.Any = js.native
  
  var enumTypeSchema: js.Any = js.native
}
object EnumTypeName {
  
  @scala.inline
  def apply(enumTypeName: js.Any, enumTypeSchema: js.Any): EnumTypeName = {
    val __obj = js.Dynamic.literal(enumTypeName = enumTypeName.asInstanceOf[js.Any], enumTypeSchema = enumTypeSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumTypeName]
  }
  
  @scala.inline
  implicit class EnumTypeNameOps[Self <: EnumTypeName] (val x: Self) extends AnyVal {
    
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
    def setEnumTypeName(value: js.Any): Self = this.set("enumTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumTypeSchema(value: js.Any): Self = this.set("enumTypeSchema", value.asInstanceOf[js.Any])
  }
}
