package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanOptOut extends js.Object {
  
  var canOptOut: scala.Double = js.native
  
  var contributedSubscription: scala.Double = js.native
  
  var groupSubscription: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var teamSubscription: scala.Double = js.native
}
object CanOptOut {
  
  @scala.inline
  def apply(
    canOptOut: scala.Double,
    contributedSubscription: scala.Double,
    groupSubscription: scala.Double,
    none: scala.Double,
    teamSubscription: scala.Double
  ): CanOptOut = {
    val __obj = js.Dynamic.literal(canOptOut = canOptOut.asInstanceOf[js.Any], contributedSubscription = contributedSubscription.asInstanceOf[js.Any], groupSubscription = groupSubscription.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], teamSubscription = teamSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanOptOut]
  }
  
  @scala.inline
  implicit class CanOptOutOps[Self <: CanOptOut] (val x: Self) extends AnyVal {
    
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
    def setCanOptOut(value: scala.Double): Self = this.set("canOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributedSubscription(value: scala.Double): Self = this.set("contributedSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSubscription(value: scala.Double): Self = this.set("groupSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamSubscription(value: scala.Double): Self = this.set("teamSubscription", value.asInstanceOf[js.Any])
  }
}
