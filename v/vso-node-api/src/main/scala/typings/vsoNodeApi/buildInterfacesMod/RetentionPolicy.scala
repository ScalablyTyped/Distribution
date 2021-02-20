package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetentionPolicy extends StObject {
  
  var artifactTypesToDelete: js.Array[String] = js.native
  
  var artifacts: js.Array[String] = js.native
  
  var branches: js.Array[String] = js.native
  
  /**
    * The number of days to keep builds.
    */
  var daysToKeep: Double = js.native
  
  /**
    * Indicates whether the build record itself should be deleted.
    */
  var deleteBuildRecord: Boolean = js.native
  
  /**
    * Indicates whether to delete test results associated with the build.
    */
  var deleteTestResults: Boolean = js.native
  
  /**
    * The minimum number of builds to keep.
    */
  var minimumToKeep: Double = js.native
}
object RetentionPolicy {
  
  @scala.inline
  def apply(
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
  implicit class RetentionPolicyMutableBuilder[Self <: RetentionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactTypesToDelete(value: js.Array[String]): Self = StObject.set(x, "artifactTypesToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactTypesToDeleteVarargs(value: String*): Self = StObject.set(x, "artifactTypesToDelete", js.Array(value :_*))
    
    @scala.inline
    def setArtifacts(value: js.Array[String]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsVarargs(value: String*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setBranches(value: js.Array[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesVarargs(value: String*): Self = StObject.set(x, "branches", js.Array(value :_*))
    
    @scala.inline
    def setDaysToKeep(value: Double): Self = StObject.set(x, "daysToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteBuildRecord(value: Boolean): Self = StObject.set(x, "deleteBuildRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTestResults(value: Boolean): Self = StObject.set(x, "deleteTestResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumToKeep(value: Double): Self = StObject.set(x, "minimumToKeep", value.asInstanceOf[js.Any])
  }
}
