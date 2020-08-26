package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitySnapshot extends js.Object {
  var groups: js.Array[Identity] = js.native
  var identityIds: js.Array[String] = js.native
  var memberships: js.Array[GroupMembership] = js.native
  var scopeId: String = js.native
  var scopes: js.Array[IdentityScope] = js.native
}

object IdentitySnapshot {
  @scala.inline
  def apply(
    groups: js.Array[Identity],
    identityIds: js.Array[String],
    memberships: js.Array[GroupMembership],
    scopeId: String,
    scopes: js.Array[IdentityScope]
  ): IdentitySnapshot = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], identityIds = identityIds.asInstanceOf[js.Any], memberships = memberships.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitySnapshot]
  }
  @scala.inline
  implicit class IdentitySnapshotOps[Self <: IdentitySnapshot] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: Identity*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[Identity]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityIdsVarargs(value: String*): Self = this.set("identityIds", js.Array(value :_*))
    @scala.inline
    def setIdentityIds(value: js.Array[String]): Self = this.set("identityIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembershipsVarargs(value: GroupMembership*): Self = this.set("memberships", js.Array(value :_*))
    @scala.inline
    def setMemberships(value: js.Array[GroupMembership]): Self = this.set("memberships", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeId(value: String): Self = this.set("scopeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: IdentityScope*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[IdentityScope]): Self = this.set("scopes", value.asInstanceOf[js.Any])
  }
  
}

