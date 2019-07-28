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
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, sourceFile = sourceFile, statistics = statistics)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[FunctionCoverage]
  }
}

