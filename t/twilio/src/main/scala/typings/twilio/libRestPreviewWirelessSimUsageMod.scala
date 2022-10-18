package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewWirelessSimUsageMod {
  
  @JSImport("twilio/lib/rest/preview/wireless/sim/usage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/wireless/sim/usage", "UsageContext")
  @js.native
  open class UsageContext protected () extends StObject {
    /**
      * Initialize the UsageContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param simSid - The sim_sid
      */
    def this(version: typings.twilio.libRestPreviewWirelessMod.^, simSid: String) = this()
    
    /**
      * fetch a UsageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UsageInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ UsageInstance, Any]): js.Promise[UsageInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ UsageInstance, Any]): js.Promise[UsageInstance] = js.native
    def fetch(opts: UsageInstanceFetchOptions): js.Promise[UsageInstance] = js.native
    def fetch(
      opts: UsageInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UsageInstance, Any]
    ): js.Promise[UsageInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/sim/usage", "UsageInstance")
  @js.native
  open class UsageInstance protected () extends SerializableClass {
    /**
      * Initialize the UsageContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param simSid - The sim_sid
      */
    def this(version: typings.twilio.libRestPreviewWirelessMod.^, payload: UsagePayload, simSid: String) = this()
    
    /* private */ var _proxy: UsageContext = js.native
    
    var accountSid: String = js.native
    
    var commandsCosts: Any = js.native
    
    var commandsUsage: Any = js.native
    
    var dataCosts: Any = js.native
    
    var dataUsage: Any = js.native
    
    /**
      * fetch a UsageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UsageInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UsageInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UsageInstance] = js.native
    def fetch(opts: UsageInstanceFetchOptions): js.Promise[UsageInstance] = js.native
    def fetch(
      opts: UsageInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[UsageInstance] = js.native
    
    var period: Any = js.native
    
    var simSid: String = js.native
    
    var simUniqueName: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the UsageList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param simSid - The sim_sid
    */
  inline def UsageList(version: typings.twilio.libRestPreviewWirelessMod.^, simSid: String): UsageListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("UsageList")(version.asInstanceOf[js.Any], simSid.asInstanceOf[js.Any])).asInstanceOf[UsageListInstance]
  
  @JSImport("twilio/lib/rest/preview/wireless/sim/usage", "UsagePage")
  @js.native
  open class UsagePage protected ()
    extends typings.twilio.libBasePageMod.^[typings.twilio.libRestPreviewWirelessMod.^, UsagePayload, UsageResource, UsageInstance] {
    /**
      * Initialize the UsagePage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.libRestPreviewWirelessMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
      solution: UsageSolution
    ) = this()
    
    /**
      * Build an instance of UsageInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: UsagePayload): UsageInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property end - The end
    * @property start - The start
    */
  trait UsageInstanceFetchOptions extends StObject {
    
    var end: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[String] = js.undefined
  }
  object UsageInstanceFetchOptions {
    
    inline def apply(): UsageInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageInstanceFetchOptions]
    }
    
    extension [Self <: UsageInstanceFetchOptions](x: Self) {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait UsageListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): UsageContext = js.native
    
    /**
      * Constructs a usage
      */
    def get(): UsageContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait UsagePayload
    extends StObject
       with UsageResource
       with TwilioResponsePayload
  object UsagePayload {
    
    inline def apply(
      account_sid: String,
      commands_costs: js.Object,
      commands_usage: js.Object,
      data_costs: js.Object,
      data_usage: js.Object,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      period: js.Object,
      previous_page_uri: String,
      sim_sid: String,
      sim_unique_name: String,
      uri: String,
      url: String
    ): UsagePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], commands_costs = commands_costs.asInstanceOf[js.Any], commands_usage = commands_usage.asInstanceOf[js.Any], data_costs = data_costs.asInstanceOf[js.Any], data_usage = data_usage.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], sim_unique_name = sim_unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsagePayload]
    }
  }
  
  trait UsageResource extends StObject {
    
    var account_sid: String
    
    var commands_costs: js.Object
    
    var commands_usage: js.Object
    
    var data_costs: js.Object
    
    var data_usage: js.Object
    
    var period: js.Object
    
    var sim_sid: String
    
    var sim_unique_name: String
    
    var url: String
  }
  object UsageResource {
    
    inline def apply(
      account_sid: String,
      commands_costs: js.Object,
      commands_usage: js.Object,
      data_costs: js.Object,
      data_usage: js.Object,
      period: js.Object,
      sim_sid: String,
      sim_unique_name: String,
      url: String
    ): UsageResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], commands_costs = commands_costs.asInstanceOf[js.Any], commands_usage = commands_usage.asInstanceOf[js.Any], data_costs = data_costs.asInstanceOf[js.Any], data_usage = data_usage.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], sim_unique_name = sim_unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageResource]
    }
    
    extension [Self <: UsageResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCommands_costs(value: js.Object): Self = StObject.set(x, "commands_costs", value.asInstanceOf[js.Any])
      
      inline def setCommands_usage(value: js.Object): Self = StObject.set(x, "commands_usage", value.asInstanceOf[js.Any])
      
      inline def setData_costs(value: js.Object): Self = StObject.set(x, "data_costs", value.asInstanceOf[js.Any])
      
      inline def setData_usage(value: js.Object): Self = StObject.set(x, "data_usage", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: js.Object): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
      
      inline def setSim_unique_name(value: String): Self = StObject.set(x, "sim_unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsageSolution extends StObject {
    
    var simSid: js.UndefOr[String] = js.undefined
  }
  object UsageSolution {
    
    inline def apply(): UsageSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageSolution]
    }
    
    extension [Self <: UsageSolution](x: Self) {
      
      inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
      
      inline def setSimSidUndefined: Self = StObject.set(x, "simSid", js.undefined)
    }
  }
}
