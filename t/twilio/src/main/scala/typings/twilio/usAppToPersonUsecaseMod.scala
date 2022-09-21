package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usAppToPersonUsecaseMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/service/usAppToPersonUsecase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/service/usAppToPersonUsecase", "UsAppToPersonUsecaseInstance")
  @js.native
  open class UsAppToPersonUsecaseInstance protected () extends SerializableClass {
    /**
      * Initialize the UsAppToPersonUsecaseContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param messagingServiceSid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      payload: UsAppToPersonUsecasePayload,
      messagingServiceSid: String
    ) = this()
    
    var usAppToPersonUsecases: js.Array[js.Object] = js.native
  }
  
  /**
    * Initialize the UsAppToPersonUsecaseList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param messagingServiceSid - The unique string that identifies the resource
    */
  inline def UsAppToPersonUsecaseList(version: typings.twilio.messagingV1Mod.^, messagingServiceSid: String): UsAppToPersonUsecaseListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("UsAppToPersonUsecaseList")(version.asInstanceOf[js.Any], messagingServiceSid.asInstanceOf[js.Any])).asInstanceOf[UsAppToPersonUsecaseListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/service/usAppToPersonUsecase", "UsAppToPersonUsecasePage")
  @js.native
  open class UsAppToPersonUsecasePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.messagingV1Mod.^, 
          UsAppToPersonUsecasePayload, 
          UsAppToPersonUsecaseResource, 
          UsAppToPersonUsecaseInstance
        ] {
    /**
      * Initialize the UsAppToPersonUsecasePage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: UsAppToPersonUsecaseSolution
    ) = this()
    
    /**
      * Build an instance of UsAppToPersonUsecaseInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: UsAppToPersonUsecasePayload): UsAppToPersonUsecaseInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait UsAppToPersonUsecaseListInstance extends StObject {
    
    /**
      * fetch a UsAppToPersonUsecaseInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UsAppToPersonUsecaseInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UsAppToPersonUsecaseInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UsAppToPersonUsecaseInstance] = js.native
    def fetch(opts: UsAppToPersonUsecaseListInstanceFetchOptions): js.Promise[UsAppToPersonUsecaseInstance] = js.native
    def fetch(
      opts: UsAppToPersonUsecaseListInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[UsAppToPersonUsecaseInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property brandRegistrationSid - A2P Brand Registration SID
    */
  trait UsAppToPersonUsecaseListInstanceFetchOptions extends StObject {
    
    var brandRegistrationSid: js.UndefOr[String] = js.undefined
  }
  object UsAppToPersonUsecaseListInstanceFetchOptions {
    
    inline def apply(): UsAppToPersonUsecaseListInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsAppToPersonUsecaseListInstanceFetchOptions]
    }
    
    extension [Self <: UsAppToPersonUsecaseListInstanceFetchOptions](x: Self) {
      
      inline def setBrandRegistrationSid(value: String): Self = StObject.set(x, "brandRegistrationSid", value.asInstanceOf[js.Any])
      
      inline def setBrandRegistrationSidUndefined: Self = StObject.set(x, "brandRegistrationSid", js.undefined)
    }
  }
  
  trait UsAppToPersonUsecasePayload
    extends StObject
       with UsAppToPersonUsecaseResource
       with TwilioResponsePayload
  object UsAppToPersonUsecasePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      us_app_to_person_usecases: js.Array[js.Object]
    ): UsAppToPersonUsecasePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], us_app_to_person_usecases = us_app_to_person_usecases.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsAppToPersonUsecasePayload]
    }
  }
  
  trait UsAppToPersonUsecaseResource extends StObject {
    
    var us_app_to_person_usecases: js.Array[js.Object]
  }
  object UsAppToPersonUsecaseResource {
    
    inline def apply(us_app_to_person_usecases: js.Array[js.Object]): UsAppToPersonUsecaseResource = {
      val __obj = js.Dynamic.literal(us_app_to_person_usecases = us_app_to_person_usecases.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsAppToPersonUsecaseResource]
    }
    
    extension [Self <: UsAppToPersonUsecaseResource](x: Self) {
      
      inline def setUs_app_to_person_usecases(value: js.Array[js.Object]): Self = StObject.set(x, "us_app_to_person_usecases", value.asInstanceOf[js.Any])
      
      inline def setUs_app_to_person_usecasesVarargs(value: js.Object*): Self = StObject.set(x, "us_app_to_person_usecases", js.Array(value*))
    }
  }
  
  trait UsAppToPersonUsecaseSolution extends StObject {
    
    var messagingServiceSid: js.UndefOr[String] = js.undefined
  }
  object UsAppToPersonUsecaseSolution {
    
    inline def apply(): UsAppToPersonUsecaseSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsAppToPersonUsecaseSolution]
    }
    
    extension [Self <: UsAppToPersonUsecaseSolution](x: Self) {
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSidUndefined: Self = StObject.set(x, "messagingServiceSid", js.undefined)
    }
  }
}
