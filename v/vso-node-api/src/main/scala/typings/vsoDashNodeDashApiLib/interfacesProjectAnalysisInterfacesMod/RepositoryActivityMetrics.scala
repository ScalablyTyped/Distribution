package typings
package vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryActivityMetrics extends js.Object {
  var codeChangesCount: scala.Double
  var codeChangesTrend: js.Array[CodeChangeTrendItem]
  var repositoryId: java.lang.String
}

object RepositoryActivityMetrics {
  @scala.inline
  def apply(
    codeChangesCount: scala.Double,
    codeChangesTrend: js.Array[CodeChangeTrendItem],
    repositoryId: java.lang.String
  ): RepositoryActivityMetrics = {
    val __obj = js.Dynamic.literal(codeChangesCount = codeChangesCount, codeChangesTrend = codeChangesTrend, repositoryId = repositoryId)
  
    __obj.asInstanceOf[RepositoryActivityMetrics]
  }
}

