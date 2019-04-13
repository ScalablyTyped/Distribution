package typings
package twilioLib.twilioMod

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
    val __obj = js.Dynamic.literal(records = records, triggers = triggers)
  
    __obj.asInstanceOf[UsageIntermediary]
  }
}

