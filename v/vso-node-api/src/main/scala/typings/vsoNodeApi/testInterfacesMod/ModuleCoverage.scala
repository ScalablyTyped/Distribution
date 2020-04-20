package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleCoverage extends js.Object {
  var blockCount: Double
  var blockData: js.Array[Double]
  var functions: js.Array[FunctionCoverage]
  var name: String
  var signature: String
  var signatureAge: Double
  var statistics: CoverageStatistics
}

object ModuleCoverage {
  @scala.inline
  def apply(
    blockCount: Double,
    blockData: js.Array[Double],
    functions: js.Array[FunctionCoverage],
    name: String,
    signature: String,
    signatureAge: Double,
    statistics: CoverageStatistics
  ): ModuleCoverage = {
    val __obj = js.Dynamic.literal(blockCount = blockCount.asInstanceOf[js.Any], blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAge = signatureAge.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleCoverage]
  }
}

