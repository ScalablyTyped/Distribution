package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AggregationType extends js.Object {
  var AggregationType: Anon_EnumValuesAnonDailyHourly
  var CodeChangeTrendItem: js.Any
  var ProjectActivityMetrics: js.Any
  var ProjectLanguageAnalytics: js.Any
  var RepositoryActivityMetrics: js.Any
  var RepositoryLanguageAnalytics: js.Any
  var ResultPhase: Anon_EnumValuesAnonFullPreliminary
}

object Anon_AggregationType {
  @scala.inline
  def apply(
    AggregationType: Anon_EnumValuesAnonDailyHourly,
    CodeChangeTrendItem: js.Any,
    ProjectActivityMetrics: js.Any,
    ProjectLanguageAnalytics: js.Any,
    RepositoryActivityMetrics: js.Any,
    RepositoryLanguageAnalytics: js.Any,
    ResultPhase: Anon_EnumValuesAnonFullPreliminary
  ): Anon_AggregationType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AggregationType")(AggregationType)
    __obj.updateDynamic("CodeChangeTrendItem")(CodeChangeTrendItem)
    __obj.updateDynamic("ProjectActivityMetrics")(ProjectActivityMetrics)
    __obj.updateDynamic("ProjectLanguageAnalytics")(ProjectLanguageAnalytics)
    __obj.updateDynamic("RepositoryActivityMetrics")(RepositoryActivityMetrics)
    __obj.updateDynamic("RepositoryLanguageAnalytics")(RepositoryLanguageAnalytics)
    __obj.updateDynamic("ResultPhase")(ResultPhase)
    __obj.asInstanceOf[Anon_AggregationType]
  }
}

