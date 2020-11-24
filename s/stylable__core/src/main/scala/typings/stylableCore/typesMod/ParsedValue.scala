package typings.stylableCore.typesMod

import typings.stylableCore.customValuesMod.Box_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedValue extends js.Object {
  
  var nodes: js.UndefOr[js.Any] = js.native
  
  var resolvedValue: js.UndefOr[String | (Box_[String, _])] = js.native
  
  var `type`: String = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var value: String = js.native
}
object ParsedValue {
  
  @scala.inline
  def apply(`type`: String, value: String): ParsedValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedValue]
  }
  
  @scala.inline
  implicit class ParsedValueOps[Self <: ParsedValue] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: js.Any): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setResolvedValue(value: String | (Box_[String, _])): Self = this.set("resolvedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedValue: Self = this.set("resolvedValue", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
