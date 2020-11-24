package typings.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectActivityMetrics extends js.Object {
  
  var authorsCount: Double = js.native
  
  var codeChangesCount: Double = js.native
  
  var codeChangesTrend: js.Array[CodeChangeTrendItem] = js.native
  
  var projectId: String = js.native
  
  var pullRequestsCompletedCount: Double = js.native
  
  var pullRequestsCreatedCount: Double = js.native
}
object ProjectActivityMetrics {
  
  @scala.inline
  def apply(
    authorsCount: Double,
    codeChangesCount: Double,
    codeChangesTrend: js.Array[CodeChangeTrendItem],
    projectId: String,
    pullRequestsCompletedCount: Double,
    pullRequestsCreatedCount: Double
  ): ProjectActivityMetrics = {
    val __obj = js.Dynamic.literal(authorsCount = authorsCount.asInstanceOf[js.Any], codeChangesCount = codeChangesCount.asInstanceOf[js.Any], codeChangesTrend = codeChangesTrend.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], pullRequestsCompletedCount = pullRequestsCompletedCount.asInstanceOf[js.Any], pullRequestsCreatedCount = pullRequestsCreatedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectActivityMetrics]
  }
  
  @scala.inline
  implicit class ProjectActivityMetricsOps[Self <: ProjectActivityMetrics] (val x: Self) extends AnyVal {
    
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
    def setAuthorsCount(value: Double): Self = this.set("authorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeChangesCount(value: Double): Self = this.set("codeChangesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeChangesTrendVarargs(value: CodeChangeTrendItem*): Self = this.set("codeChangesTrend", js.Array(value :_*))
    
    @scala.inline
    def setCodeChangesTrend(value: js.Array[CodeChangeTrendItem]): Self = this.set("codeChangesTrend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestsCompletedCount(value: Double): Self = this.set("pullRequestsCompletedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestsCreatedCount(value: Double): Self = this.set("pullRequestsCreatedCount", value.asInstanceOf[js.Any])
  }
}
