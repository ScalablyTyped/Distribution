package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCoverage extends js.Object {
  var `class`: java.lang.String
  var name: java.lang.String
  var namespace: java.lang.String
  var sourceFile: java.lang.String
  var statistics: CoverageStatistics
}

object FunctionCoverage {
  @scala.inline
  def apply(
    `class`: java.lang.String,
    name: java.lang.String,
    namespace: java.lang.String,
    sourceFile: java.lang.String,
    statistics: CoverageStatistics
  ): FunctionCoverage = {
    val __obj = js.Dynamic.literal(`class` = `class`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("sourceFile")(sourceFile)
    __obj.updateDynamic("statistics")(statistics)
    __obj.asInstanceOf[FunctionCoverage]
  }
}

