package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageIntermediary extends StObject {
  
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
  implicit class UsageIntermediaryMutableBuilder[Self <: UsageIntermediary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecords(value: UsageRecordResource): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggers(value: UsageTriggerResource): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
  }
}
