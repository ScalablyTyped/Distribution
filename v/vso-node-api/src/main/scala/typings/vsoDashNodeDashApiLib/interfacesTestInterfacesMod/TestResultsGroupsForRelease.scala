package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsGroupsForRelease extends js.Object {
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults]
  /**
    * Release Environment Id for which groupby result is fetched.
    */
  var releaseEnvId: scala.Double
  /**
    * ReleaseId for which groupby result is fetched.
    */
  var releaseId: scala.Double
}

object TestResultsGroupsForRelease {
  @scala.inline
  def apply(fields: js.Array[FieldDetailsForTestResults], releaseEnvId: scala.Double, releaseId: scala.Double): TestResultsGroupsForRelease = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("releaseEnvId")(releaseEnvId)
    __obj.updateDynamic("releaseId")(releaseId)
    __obj.asInstanceOf[TestResultsGroupsForRelease]
  }
}

