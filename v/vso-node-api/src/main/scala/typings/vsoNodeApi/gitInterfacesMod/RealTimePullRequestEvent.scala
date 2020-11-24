package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealTimePullRequestEvent extends js.Object {
  
  /**
    * The id of this event. Can be used to track send/receive state between client and server.
    */
  var eventId: String = js.native
  
  /**
    * The id of the pull request this event was generated for.
    */
  var pullRequestId: Double = js.native
}
object RealTimePullRequestEvent {
  
  @scala.inline
  def apply(eventId: String, pullRequestId: Double): RealTimePullRequestEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealTimePullRequestEvent]
  }
  
  @scala.inline
  implicit class RealTimePullRequestEventOps[Self <: RealTimePullRequestEvent] (val x: Self) extends AnyVal {
    
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
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestId(value: Double): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
  }
}
