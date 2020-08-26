package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasMemberGroupRole extends js.Object {
  var aliasMemberGroupRole: scala.Double = js.native
  var directMember: scala.Double = js.native
  var directMemberGroupRole: scala.Double = js.native
  var follows: scala.Double = js.native
  var groupAlias: scala.Double = js.native
  var inDirectMemberGroupRole: scala.Double = js.native
  var indirectMember: scala.Double = js.native
  var personal: scala.Double = js.native
  var personalAlias: scala.Double = js.native
  var singleRole: scala.Double = js.native
  var subscriptionAlias: scala.Double = js.native
  var unknown: scala.Double = js.native
}

object AliasMemberGroupRole {
  @scala.inline
  def apply(
    aliasMemberGroupRole: scala.Double,
    directMember: scala.Double,
    directMemberGroupRole: scala.Double,
    follows: scala.Double,
    groupAlias: scala.Double,
    inDirectMemberGroupRole: scala.Double,
    indirectMember: scala.Double,
    personal: scala.Double,
    personalAlias: scala.Double,
    singleRole: scala.Double,
    subscriptionAlias: scala.Double,
    unknown: scala.Double
  ): AliasMemberGroupRole = {
    val __obj = js.Dynamic.literal(aliasMemberGroupRole = aliasMemberGroupRole.asInstanceOf[js.Any], directMember = directMember.asInstanceOf[js.Any], directMemberGroupRole = directMemberGroupRole.asInstanceOf[js.Any], follows = follows.asInstanceOf[js.Any], groupAlias = groupAlias.asInstanceOf[js.Any], inDirectMemberGroupRole = inDirectMemberGroupRole.asInstanceOf[js.Any], indirectMember = indirectMember.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any], personalAlias = personalAlias.asInstanceOf[js.Any], singleRole = singleRole.asInstanceOf[js.Any], subscriptionAlias = subscriptionAlias.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasMemberGroupRole]
  }
  @scala.inline
  implicit class AliasMemberGroupRoleOps[Self <: AliasMemberGroupRole] (val x: Self) extends AnyVal {
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
    def setAliasMemberGroupRole(value: scala.Double): Self = this.set("aliasMemberGroupRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectMember(value: scala.Double): Self = this.set("directMember", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectMemberGroupRole(value: scala.Double): Self = this.set("directMemberGroupRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollows(value: scala.Double): Self = this.set("follows", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupAlias(value: scala.Double): Self = this.set("groupAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def setInDirectMemberGroupRole(value: scala.Double): Self = this.set("inDirectMemberGroupRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndirectMember(value: scala.Double): Self = this.set("indirectMember", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonal(value: scala.Double): Self = this.set("personal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonalAlias(value: scala.Double): Self = this.set("personalAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleRole(value: scala.Double): Self = this.set("singleRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionAlias(value: scala.Double): Self = this.set("subscriptionAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknown(value: scala.Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
  }
  
}

