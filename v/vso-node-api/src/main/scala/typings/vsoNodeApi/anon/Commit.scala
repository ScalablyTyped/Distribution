package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends js.Object {
  var commit: scala.Double
  var lastMergeCommit: scala.Double
  var notSet: scala.Double
}

object Commit {
  @scala.inline
  def apply(commit: scala.Double, lastMergeCommit: scala.Double, notSet: scala.Double): Commit = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], lastMergeCommit = lastMergeCommit.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
}

