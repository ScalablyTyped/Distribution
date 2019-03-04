package typings
package vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectActivityMetrics extends js.Object {
  var authorsCount: scala.Double
  var codeChangesCount: scala.Double
  var codeChangesTrend: js.Array[CodeChangeTrendItem]
  var projectId: java.lang.String
  var pullRequestsCompletedCount: scala.Double
  var pullRequestsCreatedCount: scala.Double
}

object ProjectActivityMetrics {
  @scala.inline
  def apply(
    authorsCount: scala.Double,
    codeChangesCount: scala.Double,
    codeChangesTrend: js.Array[CodeChangeTrendItem],
    projectId: java.lang.String,
    pullRequestsCompletedCount: scala.Double,
    pullRequestsCreatedCount: scala.Double
  ): ProjectActivityMetrics = {
    val __obj = js.Dynamic.literal(authorsCount = authorsCount, codeChangesCount = codeChangesCount, codeChangesTrend = codeChangesTrend, projectId = projectId, pullRequestsCompletedCount = pullRequestsCompletedCount, pullRequestsCreatedCount = pullRequestsCreatedCount)
  
    __obj.asInstanceOf[ProjectActivityMetrics]
  }
}

