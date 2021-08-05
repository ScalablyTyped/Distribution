package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCommitDiffs extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: GitCommitDiffs](x: Self) {
    
    inline def setAheadCount(value: Double): Self = StObject.set(x, "aheadCount", value.asInstanceOf[js.Any])
    
    inline def setAllChangesIncluded(value: Boolean): Self = StObject.set(x, "allChangesIncluded", value.asInstanceOf[js.Any])
    
    inline def setBaseCommit(value: String): Self = StObject.set(x, "baseCommit", value.asInstanceOf[js.Any])
    
    inline def setBehindCount(value: Double): Self = StObject.set(x, "behindCount", value.asInstanceOf[js.Any])
    
    inline def setChangeCounts(value: NumberDictionary[Double]): Self = StObject.set(x, "changeCounts", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: js.Array[GitChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: GitChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    inline def setCommonCommit(value: String): Self = StObject.set(x, "commonCommit", value.asInstanceOf[js.Any])
    
    inline def setTargetCommit(value: String): Self = StObject.set(x, "targetCommit", value.asInstanceOf[js.Any])
  }
}
