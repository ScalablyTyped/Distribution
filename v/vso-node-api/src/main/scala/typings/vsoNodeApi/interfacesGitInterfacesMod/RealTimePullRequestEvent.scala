package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealTimePullRequestEvent extends StObject {
  
  /**
    * The id of this event. Can be used to track send/receive state between client and server.
    */
  var eventId: String
  
  /**
    * The id of the pull request this event was generated for.
    */
  var pullRequestId: Double
}
object RealTimePullRequestEvent {
  
  inline def apply(eventId: String, pullRequestId: Double): RealTimePullRequestEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealTimePullRequestEvent]
  }
  
  extension [Self <: RealTimePullRequestEvent](x: Self) {
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setPullRequestId(value: Double): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
