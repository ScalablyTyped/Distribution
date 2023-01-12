package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionPolicy extends StObject {
  
  var artifactTypesToDelete: js.Array[String]
  
  var artifacts: js.Array[String]
  
  var branches: js.Array[String]
  
  /**
    * The number of days to keep builds.
    */
  var daysToKeep: Double
  
  /**
    * Indicates whether the build record itself should be deleted.
    */
  var deleteBuildRecord: Boolean
  
  /**
    * Indicates whether to delete test results associated with the build.
    */
  var deleteTestResults: Boolean
  
  /**
    * The minimum number of builds to keep.
    */
  var minimumToKeep: Double
}
object RetentionPolicy {
  
  inline def apply(
    artifactTypesToDelete: js.Array[String],
    artifacts: js.Array[String],
    branches: js.Array[String],
    daysToKeep: Double,
    deleteBuildRecord: Boolean,
    deleteTestResults: Boolean,
    minimumToKeep: Double
  ): RetentionPolicy = {
    val __obj = js.Dynamic.literal(artifactTypesToDelete = artifactTypesToDelete.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], branches = branches.asInstanceOf[js.Any], daysToKeep = daysToKeep.asInstanceOf[js.Any], deleteBuildRecord = deleteBuildRecord.asInstanceOf[js.Any], deleteTestResults = deleteTestResults.asInstanceOf[js.Any], minimumToKeep = minimumToKeep.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetentionPolicy] (val x: Self) extends AnyVal {
    
    inline def setArtifactTypesToDelete(value: js.Array[String]): Self = StObject.set(x, "artifactTypesToDelete", value.asInstanceOf[js.Any])
    
    inline def setArtifactTypesToDeleteVarargs(value: String*): Self = StObject.set(x, "artifactTypesToDelete", js.Array(value*))
    
    inline def setArtifacts(value: js.Array[String]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsVarargs(value: String*): Self = StObject.set(x, "artifacts", js.Array(value*))
    
    inline def setBranches(value: js.Array[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    inline def setBranchesVarargs(value: String*): Self = StObject.set(x, "branches", js.Array(value*))
    
    inline def setDaysToKeep(value: Double): Self = StObject.set(x, "daysToKeep", value.asInstanceOf[js.Any])
    
    inline def setDeleteBuildRecord(value: Boolean): Self = StObject.set(x, "deleteBuildRecord", value.asInstanceOf[js.Any])
    
    inline def setDeleteTestResults(value: Boolean): Self = StObject.set(x, "deleteTestResults", value.asInstanceOf[js.Any])
    
    inline def setMinimumToKeep(value: Double): Self = StObject.set(x, "minimumToKeep", value.asInstanceOf[js.Any])
  }
}
