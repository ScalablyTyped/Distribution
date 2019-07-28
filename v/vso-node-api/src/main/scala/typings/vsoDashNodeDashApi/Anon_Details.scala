package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Details extends js.Object {
  var details: Double
  var environments: Double
  var issues: Double
  var releaseInfo: Double
  var testResults: Double
  var workItems: Double
}

object Anon_Details {
  @scala.inline
  def apply(
    details: Double,
    environments: Double,
    issues: Double,
    releaseInfo: Double,
    testResults: Double,
    workItems: Double
  ): Anon_Details = {
    val __obj = js.Dynamic.literal(details = details, environments = environments, issues = issues, releaseInfo = releaseInfo, testResults = testResults, workItems = workItems)
  
    __obj.asInstanceOf[Anon_Details]
  }
}

