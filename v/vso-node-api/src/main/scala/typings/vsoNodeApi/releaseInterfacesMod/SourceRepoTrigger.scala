package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRepoTrigger extends ReleaseTriggerBase {
  var alias: String
  var branchFilters: js.Array[String]
}

object SourceRepoTrigger {
  @scala.inline
  def apply(alias: String, branchFilters: js.Array[String], triggerType: ReleaseTriggerType): SourceRepoTrigger = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], branchFilters = branchFilters.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceRepoTrigger]
  }
}

