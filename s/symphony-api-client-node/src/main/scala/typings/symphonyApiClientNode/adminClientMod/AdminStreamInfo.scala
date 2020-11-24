package typings.symphonyApiClientNode.adminClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminStreamInfo extends js.Object {
  
  var attributes: AdminStreamAttributes = js.native
  
  var id: String = js.native
  
  var isActive: Boolean = js.native
  
  var isExternal: Boolean = js.native
  
  var isPublic: Boolean = js.native
  
  var `type`: String = js.native
}
object AdminStreamInfo {
  
  @scala.inline
  def apply(
    attributes: AdminStreamAttributes,
    id: String,
    isActive: Boolean,
    isExternal: Boolean,
    isPublic: Boolean,
    `type`: String
  ): AdminStreamInfo = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isExternal = isExternal.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminStreamInfo]
  }
  
  @scala.inline
  implicit class AdminStreamInfoOps[Self <: AdminStreamInfo] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: AdminStreamAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExternal(value: Boolean): Self = this.set("isExternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
