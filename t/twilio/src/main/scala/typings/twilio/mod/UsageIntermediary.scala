package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageIntermediary extends StObject {
  
  var records: UsageRecordResource
  
  var triggers: UsageTriggerResource
}
object UsageIntermediary {
  
  inline def apply(records: UsageRecordResource, triggers: UsageTriggerResource): UsageIntermediary = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageIntermediary]
  }
  
  extension [Self <: UsageIntermediary](x: Self) {
    
    inline def setRecords(value: UsageRecordResource): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setTriggers(value: UsageTriggerResource): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
  }
}
