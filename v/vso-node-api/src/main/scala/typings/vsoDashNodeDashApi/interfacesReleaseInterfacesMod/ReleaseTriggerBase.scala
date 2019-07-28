package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTriggerBase extends js.Object {
  var triggerType: ReleaseTriggerType
}

object ReleaseTriggerBase {
  @scala.inline
  def apply(triggerType: ReleaseTriggerType): ReleaseTriggerBase = {
    val __obj = js.Dynamic.literal(triggerType = triggerType)
  
    __obj.asInstanceOf[ReleaseTriggerBase]
  }
}

