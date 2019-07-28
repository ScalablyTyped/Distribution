package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitDiffs extends js.Object {
  var aheadCount: Double
  var allChangesIncluded: Boolean
  var baseCommit: String
  var behindCount: Double
  var changeCounts: NumberDictionary[Double]
  var changes: js.Array[GitChange]
  var commonCommit: String
  var targetCommit: String
}

object GitCommitDiffs {
  @scala.inline
  def apply(
    aheadCount: Double,
    allChangesIncluded: Boolean,
    baseCommit: String,
    behindCount: Double,
    changeCounts: NumberDictionary[Double],
    changes: js.Array[GitChange],
    commonCommit: String,
    targetCommit: String
  ): GitCommitDiffs = {
    val __obj = js.Dynamic.literal(aheadCount = aheadCount, allChangesIncluded = allChangesIncluded, baseCommit = baseCommit, behindCount = behindCount, changeCounts = changeCounts, changes = changes, commonCommit = commonCommit, targetCommit = targetCommit)
  
    __obj.asInstanceOf[GitCommitDiffs]
  }
}

