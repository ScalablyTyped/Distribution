package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneStatistics extends js.Object {
  /**
    * Number of Requirments cloned so far.
    */
  var clonedRequirementsCount: scala.Double
  /**
    * Number of shared steps cloned so far.
    */
  var clonedSharedStepsCount: scala.Double
  /**
    * Number of test cases cloned so far
    */
  var clonedTestCasesCount: scala.Double
  /**
    * Total number of requirements to be cloned
    */
  var totalRequirementsCount: scala.Double
  /**
    * Total number of test cases to be cloned
    */
  var totalTestCasesCount: scala.Double
}

object CloneStatistics {
  @scala.inline
  def apply(
    clonedRequirementsCount: scala.Double,
    clonedSharedStepsCount: scala.Double,
    clonedTestCasesCount: scala.Double,
    totalRequirementsCount: scala.Double,
    totalTestCasesCount: scala.Double
  ): CloneStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clonedRequirementsCount")(clonedRequirementsCount)
    __obj.updateDynamic("clonedSharedStepsCount")(clonedSharedStepsCount)
    __obj.updateDynamic("clonedTestCasesCount")(clonedTestCasesCount)
    __obj.updateDynamic("totalRequirementsCount")(totalRequirementsCount)
    __obj.updateDynamic("totalTestCasesCount")(totalTestCasesCount)
    __obj.asInstanceOf[CloneStatistics]
  }
}

