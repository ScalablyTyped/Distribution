package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageIntermediary extends js.Object {
  var records: UsageRecordResource
  var triggers: UsageTriggerResource
}

object UsageIntermediary {
  @scala.inline
  def apply(records: UsageRecordResource, triggers: UsageTriggerResource): UsageIntermediary = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageIntermediary]
  }
}

