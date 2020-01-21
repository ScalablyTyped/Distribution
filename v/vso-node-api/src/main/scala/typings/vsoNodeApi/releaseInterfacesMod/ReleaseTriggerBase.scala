package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTriggerBase extends js.Object {
  var triggerType: ReleaseTriggerType
}

object ReleaseTriggerBase {
  @scala.inline
  def apply(triggerType: ReleaseTriggerType): ReleaseTriggerBase = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseTriggerBase]
  }
}

