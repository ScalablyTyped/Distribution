package typings.twilio

import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.recordMod.RecordListInstance
import typings.twilio.triggerMod.TriggerListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/usage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize the UsageList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def UsageList(version: typings.twilio.v2010Mod.^, accountSid: String): UsageListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("UsageList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[UsageListInstance]
  
  trait UsageListInstance extends StObject {
    
    var records: js.UndefOr[RecordListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
    
    var triggers: js.UndefOr[TriggerListInstance] = js.undefined
  }
  object UsageListInstance {
    
    inline def apply(toJSON: () => Any): UsageListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[UsageListInstance]
    }
    
    extension [Self <: UsageListInstance](x: Self) {
      
      inline def setRecords(value: RecordListInstance): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setTriggers(value: TriggerListInstance): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    }
  }
  
  trait UsagePayload
    extends StObject
       with UsageResource
       with TwilioResponsePayload
  object UsagePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): UsagePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsagePayload]
    }
  }
  
  trait UsageResource extends StObject
  
  trait UsageSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object UsageSolution {
    
    inline def apply(): UsageSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageSolution]
    }
    
    extension [Self <: UsageSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
