package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneStatistics extends js.Object {
  /**
    * Number of Requirments cloned so far.
    */
  var clonedRequirementsCount: Double
  /**
    * Number of shared steps cloned so far.
    */
  var clonedSharedStepsCount: Double
  /**
    * Number of test cases cloned so far
    */
  var clonedTestCasesCount: Double
  /**
    * Total number of requirements to be cloned
    */
  var totalRequirementsCount: Double
  /**
    * Total number of test cases to be cloned
    */
  var totalTestCasesCount: Double
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
}

