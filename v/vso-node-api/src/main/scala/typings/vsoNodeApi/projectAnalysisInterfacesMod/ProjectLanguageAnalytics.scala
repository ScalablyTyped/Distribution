package typings.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectLanguageAnalytics extends js.Object {
  var id: String = js.native
  var languageBreakdown: js.Array[LanguageStatistics] = js.native
  var repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics] = js.native
  var resultPhase: ResultPhase = js.native
  var url: String = js.native
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
  @scala.inline
  implicit class ProjectLanguageAnalyticsOps[Self <: ProjectLanguageAnalytics] (val x: Self) extends AnyVal {
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
    def setRepositoryLanguageAnalyticsVarargs(value: RepositoryLanguageAnalytics*): Self = this.set("repositoryLanguageAnalytics", js.Array(value :_*))
    @scala.inline
    def setRepositoryLanguageAnalytics(value: js.Array[RepositoryLanguageAnalytics]): Self = this.set("repositoryLanguageAnalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultPhase(value: ResultPhase): Self = this.set("resultPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

