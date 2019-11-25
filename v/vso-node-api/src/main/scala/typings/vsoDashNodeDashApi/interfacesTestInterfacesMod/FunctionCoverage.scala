package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCoverage extends js.Object {
  var `class`: String
  var name: String
  var namespace: String
  var sourceFile: String
  var statistics: CoverageStatistics
}

object FunctionCoverage {
  @scala.inline
  def apply(
    `class`: String,
    name: String,
    namespace: String,
    sourceFile: String,
    statistics: CoverageStatistics
  ): FunctionCoverage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCoverage]
  }
}

