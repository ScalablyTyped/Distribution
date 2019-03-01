package typings
package vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectLanguageAnalytics extends js.Object {
  var id: java.lang.String
  var languageBreakdown: js.Array[LanguageStatistics]
  var repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics]
  var resultPhase: ResultPhase
  var url: java.lang.String
}

object ProjectLanguageAnalytics {
  @scala.inline
  def apply(
    id: java.lang.String,
    languageBreakdown: js.Array[LanguageStatistics],
    repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics],
    resultPhase: ResultPhase,
    url: java.lang.String
  ): ProjectLanguageAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("languageBreakdown")(languageBreakdown)
    __obj.updateDynamic("repositoryLanguageAnalytics")(repositoryLanguageAnalytics)
    __obj.updateDynamic("resultPhase")(resultPhase)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ProjectLanguageAnalytics]
  }
}

