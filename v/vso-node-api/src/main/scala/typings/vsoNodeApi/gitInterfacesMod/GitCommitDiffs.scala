package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCommitDiffs extends js.Object {
  var aheadCount: Double = js.native
  var allChangesIncluded: Boolean = js.native
  var baseCommit: String = js.native
  var behindCount: Double = js.native
  var changeCounts: NumberDictionary[Double] = js.native
  var changes: js.Array[GitChange] = js.native
  var commonCommit: String = js.native
  var targetCommit: String = js.native
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
    val __obj = js.Dynamic.literal(aheadCount = aheadCount.asInstanceOf[js.Any], allChangesIncluded = allChangesIncluded.asInstanceOf[js.Any], baseCommit = baseCommit.asInstanceOf[js.Any], behindCount = behindCount.asInstanceOf[js.Any], changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], commonCommit = commonCommit.asInstanceOf[js.Any], targetCommit = targetCommit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitDiffs]
  }
  @scala.inline
  implicit class GitCommitDiffsOps[Self <: GitCommitDiffs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAheadCount(value: Double): Self = this.set("aheadCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllChangesIncluded(value: Boolean): Self = this.set("allChangesIncluded", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseCommit(value: String): Self = this.set("baseCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setBehindCount(value: Double): Self = this.set("behindCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeCounts(value: NumberDictionary[Double]): Self = this.set("changeCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangesVarargs(value: GitChange*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[GitChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommonCommit(value: String): Self = this.set("commonCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetCommit(value: String): Self = this.set("targetCommit", value.asInstanceOf[js.Any])
  }
  
}

