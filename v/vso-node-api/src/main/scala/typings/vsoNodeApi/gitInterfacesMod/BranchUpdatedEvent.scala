package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
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
  implicit class BranchUpdatedEventMutableBuilder[Self <: BranchUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSourceUpdate(value: Boolean): Self = StObject.set(x, "isSourceUpdate", value.asInstanceOf[js.Any])
  }
}
