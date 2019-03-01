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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("languageBreakdown")(languageBreakdown)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("resultPhase")(resultPhase)
    __obj.updateDynamic("updatedTime")(updatedTime)
    __obj.asInstanceOf[RepositoryLanguageAnalytics]
  }
}

