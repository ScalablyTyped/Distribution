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
    val __obj = js.Dynamic.literal(administrators = administrators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isGlobal = isGlobal.asInstanceOf[js.Any], localScopeId = localScopeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any], securingHostId = securingHostId.asInstanceOf[js.Any], subjectDescriptor = subjectDescriptor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentityScope]
  }
}

