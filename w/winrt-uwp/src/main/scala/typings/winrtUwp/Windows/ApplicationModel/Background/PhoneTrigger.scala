package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a phone event that triggers a background task. */
@js.native
trait PhoneTrigger extends js.Object {
  /** Gets a Boolean value indicating if the trigger is a one-shot notification. */
  var oneShot: Boolean = js.native
  /** Gets the type of phone event indicated by the trigger. */
  var triggerType: PhoneTriggerType = js.native
}

object PhoneTrigger {
  @scala.inline
  def apply(oneShot: Boolean, triggerType: PhoneTriggerType): PhoneTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneTrigger]
  }
  @scala.inline
  implicit class PhoneTriggerOps[Self <: PhoneTrigger] (val x: Self) extends AnyVal {
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
    def setOneShot(value: Boolean): Self = this.set("oneShot", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerType(value: PhoneTriggerType): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
  
}

