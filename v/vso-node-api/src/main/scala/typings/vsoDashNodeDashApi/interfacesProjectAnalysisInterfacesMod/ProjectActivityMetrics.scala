package typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectActivityMetrics extends js.Object {
  var authorsCount: Double
  var codeChangesCount: Double
  var codeChangesTrend: js.Array[CodeChangeTrendItem]
  var projectId: String
  var pullRequestsCompletedCount: Double
  var pullRequestsCreatedCount: Double
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
}

