package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPullRequestCommentThreadContext extends StObject {
  
  /**
    * Used to track a comment across iterations. This value can be found by looking at the iteration's changes list. Must be set for pull requests with iteration support. Otherwise, it's not required for 'legacy' pull requests.
    */
  var changeTrackingId: Double
  
  /**
    * The iteration context being viewed when the thread was created.
    */
  var iterationContext: CommentIterationContext
  
  /**
    * The criteria used to track this thread. If this property is filled out when the thread is returned, then the thread has been tracked from its original location using the given criteria.
    */
  var trackingCriteria: CommentTrackingCriteria
}
object GitPullRequestCommentThreadContext {
  
  inline def apply(
    changeTrackingId: Double,
    iterationContext: CommentIterationContext,
    trackingCriteria: CommentTrackingCriteria
  ): GitPullRequestCommentThreadContext = {
    val __obj = js.Dynamic.literal(changeTrackingId = changeTrackingId.asInstanceOf[js.Any], iterationContext = iterationContext.asInstanceOf[js.Any], trackingCriteria = trackingCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestCommentThreadContext]
  }
  
  extension [Self <: GitPullRequestCommentThreadContext](x: Self) {
    
    inline def setChangeTrackingId(value: Double): Self = StObject.set(x, "changeTrackingId", value.asInstanceOf[js.Any])
    
    inline def setIterationContext(value: CommentIterationContext): Self = StObject.set(x, "iterationContext", value.asInstanceOf[js.Any])
    
    inline def setTrackingCriteria(value: CommentTrackingCriteria): Self = StObject.set(x, "trackingCriteria", value.asInstanceOf[js.Any])
  }
}
