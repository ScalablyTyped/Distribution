package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRepoTrigger extends ReleaseTriggerBase {
  var alias: java.lang.String
  var branchFilters: js.Array[java.lang.String]
}

object SourceRepoTrigger {
  @scala.inline
  def apply(
    alias: java.lang.String,
    branchFilters: js.Array[java.lang.String],
    triggerType: ReleaseTriggerType
  ): SourceRepoTrigger = {
    val __obj = js.Dynamic.literal(alias = alias, branchFilters = branchFilters, triggerType = triggerType)
  
    __obj.asInstanceOf[SourceRepoTrigger]
  }
}

