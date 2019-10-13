package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecordResource
  extends BaseMappedResource[UsageRecordInstance]
     with Resource {
  var allTime: UsageRecordRange = js.native
  var daily: UsageRecordRange = js.native
  var lastMonth: UsageRecordRange = js.native
  var monthly: UsageRecordRange = js.native
  var thisMonth: UsageRecordRange = js.native
  var today: UsageRecordRange = js.native
  var yearly: UsageRecordRange = js.native
  var yesterday: UsageRecordRange = js.native
  /* InferMemberOverrides */
  override def apply(T0: /* resourceSid */ String): UsageRecordInstance = js.native
}

