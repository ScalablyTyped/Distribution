package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultTrendFilter extends js.Object {
  var branchNames: js.Array[java.lang.String]
  var buildCount: scala.Double
  var definitionIds: js.Array[scala.Double]
  var envDefinitionIds: js.Array[scala.Double]
  var maxCompleteDate: stdLib.Date
  var publishContext: java.lang.String
  var testRunTitles: js.Array[java.lang.String]
  var trendDays: scala.Double
}

object TestResultTrendFilter {
  @scala.inline
  def apply(
    branchNames: js.Array[java.lang.String],
    buildCount: scala.Double,
    definitionIds: js.Array[scala.Double],
    envDefinitionIds: js.Array[scala.Double],
    maxCompleteDate: stdLib.Date,
    publishContext: java.lang.String,
    testRunTitles: js.Array[java.lang.String],
    trendDays: scala.Double
  ): TestResultTrendFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("branchNames")(branchNames)
    __obj.updateDynamic("buildCount")(buildCount)
    __obj.updateDynamic("definitionIds")(definitionIds)
    __obj.updateDynamic("envDefinitionIds")(envDefinitionIds)
    __obj.updateDynamic("maxCompleteDate")(maxCompleteDate)
    __obj.updateDynamic("publishContext")(publishContext)
    __obj.updateDynamic("testRunTitles")(testRunTitles)
    __obj.updateDynamic("trendDays")(trendDays)
    __obj.asInstanceOf[TestResultTrendFilter]
  }
}

