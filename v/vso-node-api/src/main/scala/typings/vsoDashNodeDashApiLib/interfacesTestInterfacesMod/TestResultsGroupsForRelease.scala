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

