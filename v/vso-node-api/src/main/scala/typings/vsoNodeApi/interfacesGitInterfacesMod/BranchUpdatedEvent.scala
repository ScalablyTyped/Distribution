package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchUpdatedEvent
  extends StObject
     with RealTimePullRequestEvent {
  
  /**
    * If true, the source branch of the pull request was updated
    */
  var isSourceUpdate: Boolean
}
object BranchUpdatedEvent {
  
  inline def apply(eventId: String, isSourceUpdate: Boolean, pullRequestId: Double): BranchUpdatedEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], isSourceUpdate = isSourceUpdate.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchUpdatedEvent]
  }
  
  extension [Self <: BranchUpdatedEvent](x: Self) {
    
    inline def setIsSourceUpdate(value: Boolean): Self = StObject.set(x, "isSourceUpdate", value.asInstanceOf[js.Any])
  }
}
