package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestIterationChanges extends js.Object {
  /**
    * Changes made in the iteration.
    */
  var changeEntries: js.Array[GitPullRequestChange]
  /**
    * Value to specify as skip to get the next page of changes.  This will be zero if there are no more changes.
    */
  var nextSkip: Double
  /**
    * Value to specify as top to get the next page of changes.  This will be zero if there are no more changes.
    */
  var nextTop: Double
}

object GitPullRequestIterationChanges {
  @scala.inline
  def apply(changeEntries: js.Array[GitPullRequestChange], nextSkip: Double, nextTop: Double): GitPullRequestIterationChanges = {
    val __obj = js.Dynamic.literal(changeEntries = changeEntries, nextSkip = nextSkip, nextTop = nextTop)
  
    __obj.asInstanceOf[GitPullRequestIterationChanges]
  }
}

