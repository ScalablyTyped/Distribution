package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Commit extends js.Object {
  var commit: scala.Double
  var lastMergeCommit: scala.Double
  var notSet: scala.Double
}

object Anon_Commit {
  @scala.inline
  def apply(commit: scala.Double, lastMergeCommit: scala.Double, notSet: scala.Double): Anon_Commit = {
    val __obj = js.Dynamic.literal(commit = commit, lastMergeCommit = lastMergeCommit, notSet = notSet)
  
    __obj.asInstanceOf[Anon_Commit]
  }
}

