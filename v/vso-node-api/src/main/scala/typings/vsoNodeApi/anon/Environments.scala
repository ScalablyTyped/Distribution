package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environments extends js.Object {
  var details: scala.Double = js.native
  var environments: scala.Double = js.native
  var issues: scala.Double = js.native
  var releaseInfo: scala.Double = js.native
  var testResults: scala.Double = js.native
  var workItems: scala.Double = js.native
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
  @scala.inline
  implicit class EnvironmentsOps[Self <: Environments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetails(value: scala.Double): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironments(value: scala.Double): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssues(value: scala.Double): Self = this.set("issues", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseInfo(value: scala.Double): Self = this.set("releaseInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestResults(value: scala.Double): Self = this.set("testResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItems(value: scala.Double): Self = this.set("workItems", value.asInstanceOf[js.Any])
  }
  
}

