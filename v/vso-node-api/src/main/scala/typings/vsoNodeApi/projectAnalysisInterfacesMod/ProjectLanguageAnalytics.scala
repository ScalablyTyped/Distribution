package typings.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectLanguageAnalytics extends js.Object {
  var id: String
  var languageBreakdown: js.Array[LanguageStatistics]
  var repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics]
  var resultPhase: ResultPhase
  var url: String
}

object ProjectLanguageAnalytics {
  @scala.inline
  def apply(
    id: String,
    languageBreakdown: js.Array[LanguageStatistics],
    repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics],
    resultPhase: ResultPhase,
    url: String
  ): ProjectLanguageAnalytics = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], languageBreakdown = languageBreakdown.asInstanceOf[js.Any], repositoryLanguageAnalytics = repositoryLanguageAnalytics.asInstanceOf[js.Any], resultPhase = resultPhase.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectLanguageAnalytics]
  }
}

