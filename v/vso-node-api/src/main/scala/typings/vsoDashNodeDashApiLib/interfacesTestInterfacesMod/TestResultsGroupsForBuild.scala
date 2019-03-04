package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsGroupsForBuild extends js.Object {
  /**
    * BuildId for which groupby result is fetched.
    */
  var buildId: scala.Double
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults]
}

object TestResultsGroupsForBuild {
  @scala.inline
  def apply(buildId: scala.Double, fields: js.Array[FieldDetailsForTestResults]): TestResultsGroupsForBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId, fields = fields)
  
    __obj.asInstanceOf[TestResultsGroupsForBuild]
  }
}

