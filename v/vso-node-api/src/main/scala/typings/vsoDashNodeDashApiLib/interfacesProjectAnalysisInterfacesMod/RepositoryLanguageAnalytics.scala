package typings
package vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryLanguageAnalytics extends js.Object {
  var id: java.lang.String
  var languageBreakdown: js.Array[LanguageStatistics]
  var name: java.lang.String
  var resultPhase: ResultPhase
  var updatedTime: stdLib.Date
}

object RepositoryLanguageAnalytics {
  @scala.inline
  def apply(
    id: java.lang.String,
    languageBreakdown: js.Array[LanguageStatistics],
    name: java.lang.String,
    resultPhase: ResultPhase,
    updatedTime: stdLib.Date
  ): RepositoryLanguageAnalytics = {
    val __obj = js.Dynamic.literal(id = id, languageBreakdown = languageBreakdown, name = name, resultPhase = resultPhase, updatedTime = updatedTime)
  
    __obj.asInstanceOf[RepositoryLanguageAnalytics]
  }
}

