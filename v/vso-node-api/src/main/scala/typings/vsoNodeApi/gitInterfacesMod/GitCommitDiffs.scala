package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCommitDiffs extends StObject {
  
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
  implicit class GitCommitDiffsMutableBuilder[Self <: GitCommitDiffs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAheadCount(value: Double): Self = StObject.set(x, "aheadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllChangesIncluded(value: Boolean): Self = StObject.set(x, "allChangesIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseCommit(value: String): Self = StObject.set(x, "baseCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehindCount(value: Double): Self = StObject.set(x, "behindCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeCounts(value: NumberDictionary[Double]): Self = StObject.set(x, "changeCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanges(value: js.Array[GitChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: GitChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setCommonCommit(value: String): Self = StObject.set(x, "commonCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCommit(value: String): Self = StObject.set(x, "targetCommit", value.asInstanceOf[js.Any])
  }
}
