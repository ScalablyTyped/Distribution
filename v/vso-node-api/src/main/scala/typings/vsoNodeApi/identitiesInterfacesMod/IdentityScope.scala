package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityScope extends StObject {
  
  var administrators: IdentityDescriptor
  
  var id: String
  
  var isActive: Boolean
  
  var isGlobal: Boolean
  
  var localScopeId: String
  
  var name: String
  
  var parentId: String
  
  var scopeType: GroupScopeType
  
  var securingHostId: String
  
  var subjectDescriptor: String
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
  implicit class IdentityScopeMutableBuilder[Self <: IdentityScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministrators(value: IdentityDescriptor): Self = StObject.set(x, "administrators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGlobal(value: Boolean): Self = StObject.set(x, "isGlobal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalScopeId(value: String): Self = StObject.set(x, "localScopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeType(value: GroupScopeType): Self = StObject.set(x, "scopeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecuringHostId(value: String): Self = StObject.set(x, "securingHostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectDescriptor(value: String): Self = StObject.set(x, "subjectDescriptor", value.asInstanceOf[js.Any])
  }
}
