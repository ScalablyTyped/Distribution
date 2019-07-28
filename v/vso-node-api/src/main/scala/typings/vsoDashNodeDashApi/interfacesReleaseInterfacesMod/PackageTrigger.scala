package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageTrigger extends ReleaseTriggerBase {
  var alias: String
}

object PackageTrigger {
  @scala.inline
  def apply(alias: String, triggerType: ReleaseTriggerType): PackageTrigger = {
    val __obj = js.Dynamic.literal(alias = alias, triggerType = triggerType)
  
    __obj.asInstanceOf[PackageTrigger]
  }
}

