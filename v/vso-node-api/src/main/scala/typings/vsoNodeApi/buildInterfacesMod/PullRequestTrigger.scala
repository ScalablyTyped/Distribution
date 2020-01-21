package typings.vsoNodeApi.buildInterfacesMod

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
    val __obj = js.Dynamic.literal(branchFilters = branchFilters.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullRequestTrigger]
  }
}

