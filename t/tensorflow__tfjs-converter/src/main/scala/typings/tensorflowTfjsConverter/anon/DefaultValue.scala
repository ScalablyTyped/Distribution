package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultValue extends js.Object {
  
  var defaultValue: AnyOf = js.native
  
  var end: Type = js.native
  
  var name: Type = js.native
  
  var notSupported: Type = js.native
  
  var start: Type = js.native
  
  var `type`: Ref = js.native
}
object DefaultValue {
  
  @scala.inline
  def apply(defaultValue: AnyOf, end: Type, name: Type, notSupported: Type, start: Type, `type`: Ref): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit class DefaultValueOps[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Type): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Type): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSupported(value: Type): Self = this.set("notSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Type): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Ref): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
