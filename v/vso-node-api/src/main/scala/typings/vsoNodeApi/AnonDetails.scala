package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetails extends js.Object {
  var details: Double
  var environments: Double
  var issues: Double
  var releaseInfo: Double
  var testResults: Double
  var workItems: Double
}

object AnonDetails {
  @scala.inline
  def apply(
    details: Double,
    environments: Double,
    issues: Double,
    releaseInfo: Double,
    testResults: Double,
    workItems: Double
  ): AnonDetails = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], releaseInfo = releaseInfo.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDetails]
  }
}

