package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestTrigger extends BuildTrigger {
  var branchFilters: js.Array[String]
  var forks: Forks
}

object PullRequestTrigger {
  @scala.inline
  def apply(branchFilters: js.Array[String], forks: Forks, triggerType: DefinitionTriggerType): PullRequestTrigger = {
    val __obj = js.Dynamic.literal(branchFilters = branchFilters, forks = forks, triggerType = triggerType)
  
    __obj.asInstanceOf[PullRequestTrigger]
  }
}

