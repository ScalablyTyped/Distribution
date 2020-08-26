package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleCoverage extends js.Object {
  var blockCount: Double = js.native
  var blockData: js.Array[Double] = js.native
  var functions: js.Array[FunctionCoverage] = js.native
  var name: String = js.native
  var signature: String = js.native
  var signatureAge: Double = js.native
  var statistics: CoverageStatistics = js.native
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
  @scala.inline
  implicit class ModuleCoverageOps[Self <: ModuleCoverage] (val x: Self) extends AnyVal {
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
    def setBlockCount(value: Double): Self = this.set("blockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockDataVarargs(value: Double*): Self = this.set("blockData", js.Array(value :_*))
    @scala.inline
    def setBlockData(value: js.Array[Double]): Self = this.set("blockData", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionsVarargs(value: FunctionCoverage*): Self = this.set("functions", js.Array(value :_*))
    @scala.inline
    def setFunctions(value: js.Array[FunctionCoverage]): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureAge(value: Double): Self = this.set("signatureAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatistics(value: CoverageStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
  }
  
}

