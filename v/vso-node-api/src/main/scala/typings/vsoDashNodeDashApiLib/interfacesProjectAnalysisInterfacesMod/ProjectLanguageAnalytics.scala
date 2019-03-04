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
    val __obj = js.Dynamic.literal(id = id, languageBreakdown = languageBreakdown, repositoryLanguageAnalytics = repositoryLanguageAnalytics, resultPhase = resultPhase, url = url)
  
    __obj.asInstanceOf[ProjectLanguageAnalytics]
  }
}

