package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Details extends js.Object {
  var details: scala.Double
  var environments: scala.Double
  var issues: scala.Double
  var releaseInfo: scala.Double
  var testResults: scala.Double
  var workItems: scala.Double
}

object Anon_Details {
  @scala.inline
  def apply(
    details: scala.Double,
    environments: scala.Double,
    issues: scala.Double,
    releaseInfo: scala.Double,
    testResults: scala.Double,
    workItems: scala.Double
  ): Anon_Details = {
    val __obj = js.Dynamic.literal(details = details, environments = environments, issues = issues, releaseInfo = releaseInfo, testResults = testResults, workItems = workItems)
  
    __obj.asInstanceOf[Anon_Details]
  }
}

