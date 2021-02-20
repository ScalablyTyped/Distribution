package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasMemberGroupRole extends StObject {
  
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
  implicit class AliasMemberGroupRoleMutableBuilder[Self <: AliasMemberGroupRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasMemberGroupRole(value: scala.Double): Self = StObject.set(x, "aliasMemberGroupRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectMember(value: scala.Double): Self = StObject.set(x, "directMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectMemberGroupRole(value: scala.Double): Self = StObject.set(x, "directMemberGroupRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollows(value: scala.Double): Self = StObject.set(x, "follows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupAlias(value: scala.Double): Self = StObject.set(x, "groupAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDirectMemberGroupRole(value: scala.Double): Self = StObject.set(x, "inDirectMemberGroupRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndirectMember(value: scala.Double): Self = StObject.set(x, "indirectMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonal(value: scala.Double): Self = StObject.set(x, "personal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalAlias(value: scala.Double): Self = StObject.set(x, "personalAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleRole(value: scala.Double): Self = StObject.set(x, "singleRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionAlias(value: scala.Double): Self = StObject.set(x, "subscriptionAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
