package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScopeInfo extends js.Object {
  var adminGroupDescription: String = js.native
  var adminGroupName: String = js.native
  var creatorId: String = js.native
  var parentScopeId: String = js.native
  var scopeName: String = js.native
  var scopeType: GroupScopeType = js.native
}

object CreateScopeInfo {
  @scala.inline
  def apply(
    adminGroupDescription: String,
    adminGroupName: String,
    creatorId: String,
    parentScopeId: String,
    scopeName: String,
    scopeType: GroupScopeType
  ): CreateScopeInfo = {
    val __obj = js.Dynamic.literal(adminGroupDescription = adminGroupDescription.asInstanceOf[js.Any], adminGroupName = adminGroupName.asInstanceOf[js.Any], creatorId = creatorId.asInstanceOf[js.Any], parentScopeId = parentScopeId.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScopeInfo]
  }
  @scala.inline
  implicit class CreateScopeInfoOps[Self <: CreateScopeInfo] (val x: Self) extends AnyVal {
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
    def setAdminGroupDescription(value: String): Self = this.set("adminGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdminGroupName(value: String): Self = this.set("adminGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatorId(value: String): Self = this.set("creatorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentScopeId(value: String): Self = this.set("parentScopeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeName(value: String): Self = this.set("scopeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeType(value: GroupScopeType): Self = this.set("scopeType", value.asInstanceOf[js.Any])
  }
  
}

