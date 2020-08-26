package typings.vsoNodeApi.projectAnalysisInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryLanguageAnalytics extends js.Object {
  var id: String = js.native
  var languageBreakdown: js.Array[LanguageStatistics] = js.native
  var name: String = js.native
  var resultPhase: ResultPhase = js.native
  var updatedTime: Date = js.native
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], languageBreakdown = languageBreakdown.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resultPhase = resultPhase.asInstanceOf[js.Any], updatedTime = updatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryLanguageAnalytics]
  }
  @scala.inline
  implicit class RepositoryLanguageAnalyticsOps[Self <: RepositoryLanguageAnalytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageBreakdownVarargs(value: LanguageStatistics*): Self = this.set("languageBreakdown", js.Array(value :_*))
    @scala.inline
    def setLanguageBreakdown(value: js.Array[LanguageStatistics]): Self = this.set("languageBreakdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultPhase(value: ResultPhase): Self = this.set("resultPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedTime(value: Date): Self = this.set("updatedTime", value.asInstanceOf[js.Any])
  }
  
}

