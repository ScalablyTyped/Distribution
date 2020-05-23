package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasMemberGroupRole extends js.Object {
  var aliasMemberGroupRole: scala.Double
  var directMember: scala.Double
  var directMemberGroupRole: scala.Double
  var follows: scala.Double
  var groupAlias: scala.Double
  var inDirectMemberGroupRole: scala.Double
  var indirectMember: scala.Double
  var personal: scala.Double
  var personalAlias: scala.Double
  var singleRole: scala.Double
  var subscriptionAlias: scala.Double
  var unknown: scala.Double
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
}

