package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneStatistics extends js.Object {
  /**
    * Number of Requirments cloned so far.
    */
  var clonedRequirementsCount: Double = js.native
  /**
    * Number of shared steps cloned so far.
    */
  var clonedSharedStepsCount: Double = js.native
  /**
    * Number of test cases cloned so far
    */
  var clonedTestCasesCount: Double = js.native
  /**
    * Total number of requirements to be cloned
    */
  var totalRequirementsCount: Double = js.native
  /**
    * Total number of test cases to be cloned
    */
  var totalTestCasesCount: Double = js.native
}

object CloneStatistics {
  @scala.inline
  def apply(
    clonedRequirementsCount: Double,
    clonedSharedStepsCount: Double,
    clonedTestCasesCount: Double,
    totalRequirementsCount: Double,
    totalTestCasesCount: Double
  ): CloneStatistics = {
    val __obj = js.Dynamic.literal(clonedRequirementsCount = clonedRequirementsCount.asInstanceOf[js.Any], clonedSharedStepsCount = clonedSharedStepsCount.asInstanceOf[js.Any], clonedTestCasesCount = clonedTestCasesCount.asInstanceOf[js.Any], totalRequirementsCount = totalRequirementsCount.asInstanceOf[js.Any], totalTestCasesCount = totalTestCasesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneStatistics]
  }
  @scala.inline
  implicit class CloneStatisticsOps[Self <: CloneStatistics] (val x: Self) extends AnyVal {
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
    def setClonedRequirementsCount(value: Double): Self = this.set("clonedRequirementsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setClonedSharedStepsCount(value: Double): Self = this.set("clonedSharedStepsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setClonedTestCasesCount(value: Double): Self = this.set("clonedTestCasesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalRequirementsCount(value: Double): Self = this.set("totalRequirementsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalTestCasesCount(value: Double): Self = this.set("totalTestCasesCount", value.asInstanceOf[js.Any])
  }
  
}

