package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeCoverageSummary extends js.Object {
  /**
    * Uri of build for which data is retrieved/published
    */
  var build: ShallowReference = js.native
  /**
    * List of coverage data and details for the build
    */
  var coverageData: js.Array[CodeCoverageData] = js.native
  /**
    * Uri of build against which difference in coverage is computed
    */
  var deltaBuild: ShallowReference = js.native
}

object CodeCoverageSummary {
  @scala.inline
  def apply(build: ShallowReference, coverageData: js.Array[CodeCoverageData], deltaBuild: ShallowReference): CodeCoverageSummary = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], coverageData = coverageData.asInstanceOf[js.Any], deltaBuild = deltaBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageSummary]
  }
  @scala.inline
  implicit class CodeCoverageSummaryOps[Self <: CodeCoverageSummary] (val x: Self) extends AnyVal {
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
    def setBuild(value: ShallowReference): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoverageDataVarargs(value: CodeCoverageData*): Self = this.set("coverageData", js.Array(value :_*))
    @scala.inline
    def setCoverageData(value: js.Array[CodeCoverageData]): Self = this.set("coverageData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaBuild(value: ShallowReference): Self = this.set("deltaBuild", value.asInstanceOf[js.Any])
  }
  
}

