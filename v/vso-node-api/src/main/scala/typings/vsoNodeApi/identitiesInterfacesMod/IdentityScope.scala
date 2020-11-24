package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityScope extends js.Object {
  
  var administrators: IdentityDescriptor = js.native
  
  var id: String = js.native
  
  var isActive: Boolean = js.native
  
  var isGlobal: Boolean = js.native
  
  var localScopeId: String = js.native
  
  var name: String = js.native
  
  var parentId: String = js.native
  
  var scopeType: GroupScopeType = js.native
  
  var securingHostId: String = js.native
  
  var subjectDescriptor: String = js.native
}
object IdentityScope {
  
  @scala.inline
  def apply(
    administrators: IdentityDescriptor,
    id: String,
    isActive: Boolean,
    isGlobal: Boolean,
    localScopeId: String,
    name: String,
    parentId: String,
    scopeType: GroupScopeType,
    securingHostId: String,
    subjectDescriptor: String
  ): IdentityScope = {
    val __obj = js.Dynamic.literal(administrators = administrators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isGlobal = isGlobal.asInstanceOf[js.Any], localScopeId = localScopeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any], securingHostId = securingHostId.asInstanceOf[js.Any], subjectDescriptor = subjectDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityScope]
  }
  
  @scala.inline
  implicit class IdentityScopeOps[Self <: IdentityScope] (val x: Self) extends AnyVal {
    
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
    def setAdministrators(value: IdentityDescriptor): Self = this.set("administrators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGlobal(value: Boolean): Self = this.set("isGlobal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalScopeId(value: String): Self = this.set("localScopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeType(value: GroupScopeType): Self = this.set("scopeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecuringHostId(value: String): Self = this.set("securingHostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectDescriptor(value: String): Self = this.set("subjectDescriptor", value.asInstanceOf[js.Any])
  }
}
