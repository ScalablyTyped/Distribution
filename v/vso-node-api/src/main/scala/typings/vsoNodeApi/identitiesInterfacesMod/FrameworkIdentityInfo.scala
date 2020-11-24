package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameworkIdentityInfo extends js.Object {
  
  var displayName: String = js.native
  
  var identifier: String = js.native
  
  var identityType: FrameworkIdentityType = js.native
  
  var role: String = js.native
}
object FrameworkIdentityInfo {
  
  @scala.inline
  def apply(displayName: String, identifier: String, identityType: FrameworkIdentityType, role: String): FrameworkIdentityInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], identityType = identityType.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameworkIdentityInfo]
  }
  
  @scala.inline
  implicit class FrameworkIdentityInfoOps[Self <: FrameworkIdentityInfo] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityType(value: FrameworkIdentityType): Self = this.set("identityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
  }
}
