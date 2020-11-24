package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetentionPolicy extends js.Object {
  
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
  implicit class RetentionPolicyOps[Self <: RetentionPolicy] (val x: Self) extends AnyVal {
    
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
    def setArtifactTypesToDeleteVarargs(value: String*): Self = this.set("artifactTypesToDelete", js.Array(value :_*))
    
    @scala.inline
    def setArtifactTypesToDelete(value: js.Array[String]): Self = this.set("artifactTypesToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsVarargs(value: String*): Self = this.set("artifacts", js.Array(value :_*))
    
    @scala.inline
    def setArtifacts(value: js.Array[String]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesVarargs(value: String*): Self = this.set("branches", js.Array(value :_*))
    
    @scala.inline
    def setBranches(value: js.Array[String]): Self = this.set("branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysToKeep(value: Double): Self = this.set("daysToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteBuildRecord(value: Boolean): Self = this.set("deleteBuildRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTestResults(value: Boolean): Self = this.set("deleteTestResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumToKeep(value: Double): Self = this.set("minimumToKeep", value.asInstanceOf[js.Any])
  }
}
