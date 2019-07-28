package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityScope extends js.Object {
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
    val __obj = js.Dynamic.literal(administrators = administrators, id = id, isActive = isActive, isGlobal = isGlobal, localScopeId = localScopeId, name = name, parentId = parentId, scopeType = scopeType, securingHostId = securingHostId, subjectDescriptor = subjectDescriptor)
  
    __obj.asInstanceOf[IdentityScope]
  }
}

