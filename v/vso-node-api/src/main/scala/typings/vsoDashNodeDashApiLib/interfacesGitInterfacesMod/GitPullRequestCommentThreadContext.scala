package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitPullRequestCommentThreadContext extends js.Object {
  /**
       * Used to track a comment across iterations. This value can be found by looking at the iteration's changes list. Must be set for pull requests with iteration support. Otherwise, it's not required for 'legacy' pull requests.
       */
  var changeTrackingId: scala.Double
  /**
       * The iteration context being viewed when the thread was created.
       */
  var iterationContext: CommentIterationContext
  /**
       * The criteria used to track this thread. If this property is filled out when the thread is returned, then the thread has been tracked from its original location using the given criteria.
       */
  var trackingCriteria: CommentTrackingCriteria
}

