package typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryLanguageAnalytics extends js.Object {
  var id: String
  var languageBreakdown: js.Array[LanguageStatistics]
  var name: String
  var resultPhase: ResultPhase
  var updatedTime: Date
}

object RepositoryLanguageAnalytics {
  @scala.inline
  def apply(
    id: String,
    languageBreakdown: js.Array[LanguageStatistics],
    name: String,
    resultPhase: ResultPhase,
    updatedTime: Date
  ): RepositoryLanguageAnalytics = {
    val __obj = js.Dynamic.literal(id = id, languageBreakdown = languageBreakdown, name = name, resultPhase = resultPhase, updatedTime = updatedTime)
  
    __obj.asInstanceOf[RepositoryLanguageAnalytics]
  }
}

