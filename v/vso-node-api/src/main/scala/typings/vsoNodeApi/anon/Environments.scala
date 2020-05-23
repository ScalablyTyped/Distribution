package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environments extends js.Object {
  var details: scala.Double
  var environments: scala.Double
  var issues: scala.Double
  var releaseInfo: scala.Double
  var testResults: scala.Double
  var workItems: scala.Double
}

object Environments {
  @scala.inline
  def apply(
    details: scala.Double,
    environments: scala.Double,
    issues: scala.Double,
    releaseInfo: scala.Double,
    testResults: scala.Double,
    workItems: scala.Double
  ): Environments = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], releaseInfo = releaseInfo.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environments]
  }
}

