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
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], lastMergeCommit = lastMergeCommit.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Commit]
  }
}

