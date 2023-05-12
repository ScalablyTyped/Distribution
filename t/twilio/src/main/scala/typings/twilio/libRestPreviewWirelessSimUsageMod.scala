package typings.twilio

import typings.twilio.anon.CommandsCosts
import typings.twilio.libRestPreviewWirelessMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewWirelessSimUsageMod {
  
  @JSImport("twilio/lib/rest/preview/wireless/sim/usage", "UsageContextImpl")
  @js.native
  open class UsageContextImpl protected ()
    extends StObject
       with UsageContext {
    def this(_version: default, simSid: String) = this()
    
    /* protected */ var _solution: UsageContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def fetch(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[UsageInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[UsageInstance], Any]
    ): js.Promise[UsageInstance] = js.native
    def fetch(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[UsageInstance], Any]
    ): js.Promise[UsageInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/sim/usage", "UsageInstance")
  @js.native
  open class UsageInstance protected () extends StObject {
    def this(_version: default, payload: UsageResource, simSid: String) = this()
    
    /* protected */ var _context: js.UndefOr[UsageContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: UsageContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var commandsCosts: Any = js.native
    
    var commandsUsage: Any = js.native
    
    var dataCosts: Any = js.native
    
    var dataUsage: Any = js.native
    
    /**
      * Fetch a UsageInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed UsageInstance
      */
    def fetch(): js.Promise[UsageInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[UsageInstance] = js.native
    /**
      * Fetch a UsageInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed UsageInstance
      */
    def fetch(params: UsageContextFetchOptions): js.Promise[UsageInstance] = js.native
    def fetch(
      params: UsageContextFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[UsageInstance] = js.native
    
    var period: Any = js.native
    
    var simSid: String = js.native
    
    var simUniqueName: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): CommandsCosts = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait UsageListInstance extends StObject {
    
    def apply(): UsageContext = js.native
    
    var _solution: UsageSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    def get(): UsageContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object UsageListInstance {
    
    @JSImport("twilio/lib/rest/preview/wireless/sim/usage", "UsageListInstance")
    @js.native
    def apply(version: default, simSid: String): UsageListInstance = js.native
  }
  
  @js.native
  trait UsageContext extends StObject {
    
    /**
      * Fetch a UsageInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed UsageInstance
      */
    def fetch(): js.Promise[UsageInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[UsageInstance], Any]): js.Promise[UsageInstance] = js.native
    /**
      * Fetch a UsageInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed UsageInstance
      */
    def fetch(params: UsageContextFetchOptions): js.Promise[UsageInstance] = js.native
    def fetch(
      params: UsageContextFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[UsageInstance], Any]
    ): js.Promise[UsageInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait UsageContextFetchOptions extends StObject {
    
    /**  */
    var end: js.UndefOr[String] = js.undefined
    
    /**  */
    var start: js.UndefOr[String] = js.undefined
  }
  object UsageContextFetchOptions {
    
    inline def apply(): UsageContextFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageContextFetchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsageContextFetchOptions] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait UsageContextSolution extends StObject {
    
    var simSid: String
  }
  object UsageContextSolution {
    
    inline def apply(simSid: String): UsageContextSolution = {
      val __obj = js.Dynamic.literal(simSid = simSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsageContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsageResource extends StObject {
    
    var account_sid: String
    
    var commands_costs: Any
    
    var commands_usage: Any
    
    var data_costs: Any
    
    var data_usage: Any
    
    var period: Any
    
    var sim_sid: String
    
    var sim_unique_name: String
    
    var url: String
  }
  object UsageResource {
    
    inline def apply(
      account_sid: String,
      commands_costs: Any,
      commands_usage: Any,
      data_costs: Any,
      data_usage: Any,
      period: Any,
      sim_sid: String,
      sim_unique_name: String,
      url: String
    ): UsageResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], commands_costs = commands_costs.asInstanceOf[js.Any], commands_usage = commands_usage.asInstanceOf[js.Any], data_costs = data_costs.asInstanceOf[js.Any], data_usage = data_usage.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], sim_unique_name = sim_unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsageResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCommands_costs(value: Any): Self = StObject.set(x, "commands_costs", value.asInstanceOf[js.Any])
      
      inline def setCommands_usage(value: Any): Self = StObject.set(x, "commands_usage", value.asInstanceOf[js.Any])
      
      inline def setData_costs(value: Any): Self = StObject.set(x, "data_costs", value.asInstanceOf[js.Any])
      
      inline def setData_usage(value: Any): Self = StObject.set(x, "data_usage", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: Any): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
      
      inline def setSim_unique_name(value: String): Self = StObject.set(x, "sim_unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsageSolution extends StObject {
    
    var simSid: String
  }
  object UsageSolution {
    
    inline def apply(simSid: String): UsageSolution = {
      val __obj = js.Dynamic.literal(simSid = simSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsageSolution] (val x: Self) extends AnyVal {
      
      inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
    }
  }
}
