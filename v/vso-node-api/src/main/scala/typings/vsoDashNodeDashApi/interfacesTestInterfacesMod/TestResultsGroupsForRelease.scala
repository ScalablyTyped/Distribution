package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
  var releaseEnvId: Double
  /**
    * ReleaseId for which groupby result is fetched.
    */
  var releaseId: Double
}

object TestResultsGroupsForRelease {
  @scala.inline
  def apply(fields: js.Array[FieldDetailsForTestResults], releaseEnvId: Double, releaseId: Double): TestResultsGroupsForRelease = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], releaseEnvId = releaseEnvId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResultsGroupsForRelease]
  }
}

