package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BranchUpdatedEvent extends RealTimePullRequestEvent {
  
  /**
    * If true, the source branch of the pull request was updated
    */
  var isSourceUpdate: Boolean = js.native
}
object BranchUpdatedEvent {
  
  @scala.inline
  def apply(eventId: String, isSourceUpdate: Boolean, pullRequestId: Double): BranchUpdatedEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], isSourceUpdate = isSourceUpdate.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchUpdatedEvent]
  }
  
  @scala.inline
  implicit class BranchUpdatedEventOps[Self <: BranchUpdatedEvent] (val x: Self) extends AnyVal {
    
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
    def setIsSourceUpdate(value: Boolean): Self = this.set("isSourceUpdate", value.asInstanceOf[js.Any])
  }
}
