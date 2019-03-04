package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitDiffs extends js.Object {
  var aheadCount: scala.Double
  var allChangesIncluded: scala.Boolean
  var baseCommit: java.lang.String
  var behindCount: scala.Double
  var changeCounts: org.scalablytyped.runtime.NumberDictionary[scala.Double]
  var changes: js.Array[GitChange]
  var commonCommit: java.lang.String
  var targetCommit: java.lang.String
}

object GitCommitDiffs {
  @scala.inline
  def apply(
    aheadCount: scala.Double,
    allChangesIncluded: scala.Boolean,
    baseCommit: java.lang.String,
    behindCount: scala.Double,
    changeCounts: org.scalablytyped.runtime.NumberDictionary[scala.Double],
    changes: js.Array[GitChange],
    commonCommit: java.lang.String,
    targetCommit: java.lang.String
  ): GitCommitDiffs = {
    val __obj = js.Dynamic.literal(aheadCount = aheadCount, allChangesIncluded = allChangesIncluded, baseCommit = baseCommit, behindCount = behindCount, changeCounts = changeCounts, changes = changes, commonCommit = commonCommit, targetCommit = targetCommit)
  
    __obj.asInstanceOf[GitCommitDiffs]
  }
}

