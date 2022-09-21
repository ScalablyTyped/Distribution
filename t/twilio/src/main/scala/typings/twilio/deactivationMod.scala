package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deactivationMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/deactivation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/deactivation", "DeactivationsContext")
  @js.native
  open class DeactivationsContext protected () extends StObject {
    /**
      * Initialize the DeactivationsContext
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.messagingV1Mod.^) = this()
    
    /**
      * fetch a DeactivationsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeactivationsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeactivationsInstance, Any]): js.Promise[DeactivationsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeactivationsInstance, Any]
    ): js.Promise[DeactivationsInstance] = js.native
    def fetch(opts: DeactivationsInstanceFetchOptions): js.Promise[DeactivationsInstance] = js.native
    def fetch(
      opts: DeactivationsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeactivationsInstance, Any]
    ): js.Promise[DeactivationsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/messaging/v1/deactivation", "DeactivationsInstance")
  @js.native
  open class DeactivationsInstance protected () extends SerializableClass {
    /**
      * Initialize the DeactivationsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.messagingV1Mod.^, payload: DeactivationsPayload) = this()
    
    /* private */ var _proxy: DeactivationsContext = js.native
    
    /**
      * fetch a DeactivationsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeactivationsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeactivationsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeactivationsInstance] = js.native
    def fetch(opts: DeactivationsInstanceFetchOptions): js.Promise[DeactivationsInstance] = js.native
    def fetch(
      opts: DeactivationsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[DeactivationsInstance] = js.native
    
    var redirectTo: String = js.native
  }
  
  /**
    * Initialize the DeactivationsList
    *
    * @param version - Version of the resource
    */
  inline def DeactivationsList(version: typings.twilio.messagingV1Mod.^): DeactivationsListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("DeactivationsList")(version.asInstanceOf[js.Any]).asInstanceOf[DeactivationsListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/deactivation", "DeactivationsPage")
  @js.native
  open class DeactivationsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.messagingV1Mod.^, 
          DeactivationsPayload, 
          DeactivationsResource, 
          DeactivationsInstance
        ] {
    /**
      * Initialize the DeactivationsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: DeactivationsSolution
    ) = this()
    
    /**
      * Build an instance of DeactivationsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DeactivationsPayload): DeactivationsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property date - The date to retrieve deactivated numbers for.
    */
  trait DeactivationsInstanceFetchOptions extends StObject {
    
    var date: js.UndefOr[js.Date] = js.undefined
  }
  object DeactivationsInstanceFetchOptions {
    
    inline def apply(): DeactivationsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeactivationsInstanceFetchOptions]
    }
    
    extension [Self <: DeactivationsInstanceFetchOptions](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    }
  }
  
  @js.native
  trait DeactivationsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DeactivationsContext = js.native
    
    /**
      * Constructs a deactivations
      */
    def get(): DeactivationsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait DeactivationsPayload
    extends StObject
       with DeactivationsResource
       with TwilioResponsePayload
  object DeactivationsPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      redirect_to: String,
      uri: String
    ): DeactivationsPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], redirect_to = redirect_to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeactivationsPayload]
    }
  }
  
  trait DeactivationsResource extends StObject {
    
    var redirect_to: String
  }
  object DeactivationsResource {
    
    inline def apply(redirect_to: String): DeactivationsResource = {
      val __obj = js.Dynamic.literal(redirect_to = redirect_to.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeactivationsResource]
    }
    
    extension [Self <: DeactivationsResource](x: Self) {
      
      inline def setRedirect_to(value: String): Self = StObject.set(x, "redirect_to", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeactivationsSolution extends StObject
}
