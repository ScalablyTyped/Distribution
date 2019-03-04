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
    val __obj = js.Dynamic.literal(blockCount = blockCount, blockData = blockData, functions = functions, name = name, signature = signature, signatureAge = signatureAge, statistics = statistics)
  
    __obj.asInstanceOf[ModuleCoverage]
  }
}

