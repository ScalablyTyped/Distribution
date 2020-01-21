package typings.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryActivityMetrics extends js.Object {
  var codeChangesCount: Double
  var codeChangesTrend: js.Array[CodeChangeTrendItem]
  var repositoryId: String
}

object RepositoryActivityMetrics {
  @scala.inline
  def apply(codeChangesCount: Double, codeChangesTrend: js.Array[CodeChangeTrendItem], repositoryId: String): RepositoryActivityMetrics = {
    val __obj = js.Dynamic.literal(codeChangesCount = codeChangesCount.asInstanceOf[js.Any], codeChangesTrend = codeChangesTrend.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RepositoryActivityMetrics]
  }
}

