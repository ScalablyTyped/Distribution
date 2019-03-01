package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestTrigger extends BuildTrigger {
  var branchFilters: js.Array[java.lang.String]
  var forks: Forks
}

object PullRequestTrigger {
  @scala.inline
  def apply(branchFilters: js.Array[java.lang.String], forks: Forks, triggerType: DefinitionTriggerType): PullRequestTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("branchFilters")(branchFilters)
    __obj.updateDynamic("forks")(forks)
    __obj.updateDynamic("triggerType")(triggerType)
    __obj.asInstanceOf[PullRequestTrigger]
  }
}

