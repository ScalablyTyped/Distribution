package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultTrendFilter extends js.Object {
  var branchNames: js.Array[String] = js.native
  var buildCount: Double = js.native
  var definitionIds: js.Array[Double] = js.native
  var envDefinitionIds: js.Array[Double] = js.native
  var maxCompleteDate: Date = js.native
  var publishContext: String = js.native
  var testRunTitles: js.Array[String] = js.native
  var trendDays: Double = js.native
}

object TestResultTrendFilter {
  @scala.inline
  def apply(
    branchNames: js.Array[String],
    buildCount: Double,
    definitionIds: js.Array[Double],
    envDefinitionIds: js.Array[Double],
    maxCompleteDate: Date,
    publishContext: String,
    testRunTitles: js.Array[String],
    trendDays: Double
  ): TestResultTrendFilter = {
    val __obj = js.Dynamic.literal(branchNames = branchNames.asInstanceOf[js.Any], buildCount = buildCount.asInstanceOf[js.Any], definitionIds = definitionIds.asInstanceOf[js.Any], envDefinitionIds = envDefinitionIds.asInstanceOf[js.Any], maxCompleteDate = maxCompleteDate.asInstanceOf[js.Any], publishContext = publishContext.asInstanceOf[js.Any], testRunTitles = testRunTitles.asInstanceOf[js.Any], trendDays = trendDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultTrendFilter]
  }
  @scala.inline
  implicit class TestResultTrendFilterOps[Self <: TestResultTrendFilter] (val x: Self) extends AnyVal {
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
    def setBranchNamesVarargs(value: String*): Self = this.set("branchNames", js.Array(value :_*))
    @scala.inline
    def setBranchNames(value: js.Array[String]): Self = this.set("branchNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildCount(value: Double): Self = this.set("buildCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionIdsVarargs(value: Double*): Self = this.set("definitionIds", js.Array(value :_*))
    @scala.inline
    def setDefinitionIds(value: js.Array[Double]): Self = this.set("definitionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvDefinitionIdsVarargs(value: Double*): Self = this.set("envDefinitionIds", js.Array(value :_*))
    @scala.inline
    def setEnvDefinitionIds(value: js.Array[Double]): Self = this.set("envDefinitionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCompleteDate(value: Date): Self = this.set("maxCompleteDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishContext(value: String): Self = this.set("publishContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestRunTitlesVarargs(value: String*): Self = this.set("testRunTitles", js.Array(value :_*))
    @scala.inline
    def setTestRunTitles(value: js.Array[String]): Self = this.set("testRunTitles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrendDays(value: Double): Self = this.set("trendDays", value.asInstanceOf[js.Any])
  }
  
}

