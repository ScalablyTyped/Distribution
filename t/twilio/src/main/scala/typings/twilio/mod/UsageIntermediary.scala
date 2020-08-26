package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageIntermediary extends js.Object {
  var records: UsageRecordResource = js.native
  var triggers: UsageTriggerResource = js.native
}

object UsageIntermediary {
  @scala.inline
  def apply(records: UsageRecordResource, triggers: UsageTriggerResource): UsageIntermediary = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageIntermediary]
  }
  @scala.inline
  implicit class UsageIntermediaryOps[Self <: UsageIntermediary] (val x: Self) extends AnyVal {
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
    def setRecords(value: UsageRecordResource): Self = this.set("records", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggers(value: UsageTriggerResource): Self = this.set("triggers", value.asInstanceOf[js.Any])
  }
  
}

