package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultTrendFilter extends js.Object {
  var branchNames: js.Array[String]
  var buildCount: Double
  var definitionIds: js.Array[Double]
  var envDefinitionIds: js.Array[Double]
  var maxCompleteDate: Date
  var publishContext: String
  var testRunTitles: js.Array[String]
  var trendDays: Double
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
    val __obj = js.Dynamic.literal(branchNames = branchNames, buildCount = buildCount, definitionIds = definitionIds, envDefinitionIds = envDefinitionIds, maxCompleteDate = maxCompleteDate, publishContext = publishContext, testRunTitles = testRunTitles, trendDays = trendDays)
  
    __obj.asInstanceOf[TestResultTrendFilter]
  }
}

