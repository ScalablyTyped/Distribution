package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommit extends js.Object {
  var commit: Double
  var lastMergeCommit: Double
  var notSet: Double
}

object AnonCommit {
  @scala.inline
  def apply(commit: Double, lastMergeCommit: Double, notSet: Double): AnonCommit = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], lastMergeCommit = lastMergeCommit.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommit]
  }
}

