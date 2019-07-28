package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Commit extends js.Object {
  var commit: Double
  var lastMergeCommit: Double
  var notSet: Double
}

object Anon_Commit {
  @scala.inline
  def apply(commit: Double, lastMergeCommit: Double, notSet: Double): Anon_Commit = {
    val __obj = js.Dynamic.literal(commit = commit, lastMergeCommit = lastMergeCommit, notSet = notSet)
  
    __obj.asInstanceOf[Anon_Commit]
  }
}

