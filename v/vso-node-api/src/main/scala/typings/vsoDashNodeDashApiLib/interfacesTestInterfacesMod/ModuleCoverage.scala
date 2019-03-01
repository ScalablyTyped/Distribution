package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleCoverage extends js.Object {
  var blockCount: scala.Double
  var blockData: js.Array[scala.Double]
  var functions: js.Array[FunctionCoverage]
  var name: java.lang.String
  var signature: java.lang.String
  var signatureAge: scala.Double
  var statistics: CoverageStatistics
}

object ModuleCoverage {
  @scala.inline
  def apply(
    blockCount: scala.Double,
    blockData: js.Array[scala.Double],
    functions: js.Array[FunctionCoverage],
    name: java.lang.String,
    signature: java.lang.String,
    signatureAge: scala.Double,
    statistics: CoverageStatistics
  ): ModuleCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockCount")(blockCount)
    __obj.updateDynamic("blockData")(blockData)
    __obj.updateDynamic("functions")(functions)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("signature")(signature)
    __obj.updateDynamic("signatureAge")(signatureAge)
    __obj.updateDynamic("statistics")(statistics)
    __obj.asInstanceOf[ModuleCoverage]
  }
}

