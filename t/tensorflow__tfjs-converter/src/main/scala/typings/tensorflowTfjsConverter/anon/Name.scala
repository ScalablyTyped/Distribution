package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends js.Object {
  
  var defaultValue: AnyOf = js.native
  
  var name: Type = js.native
  
  var notSupported: Type = js.native
  
  var tfDeprecatedName: Type = js.native
  
  var tfName: Type = js.native
  
  var `type`: Ref = js.native
}
object Name {
  
  @scala.inline
  def apply(
    defaultValue: AnyOf,
    name: Type,
    notSupported: Type,
    tfDeprecatedName: Type,
    tfName: Type,
    `type`: Ref
  ): Name = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], tfDeprecatedName = tfDeprecatedName.asInstanceOf[js.Any], tfName = tfName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: AnyOf): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Type): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSupported(value: Type): Self = this.set("notSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfDeprecatedName(value: Type): Self = this.set("tfDeprecatedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfName(value: Type): Self = this.set("tfName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Ref): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
