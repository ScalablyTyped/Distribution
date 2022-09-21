package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archivedCallMod {
  
  @JSImport("twilio/lib/rest/voice/v1/archivedCall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/archivedCall", "ArchivedCallContext")
  @js.native
  open class ArchivedCallContext protected () extends StObject {
    /**
      * Initialize the ArchivedCallContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param date - The date of the Call in UTC.
      * @param sid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, date: js.Date, sid: String) = this()
    
    /**
      * remove a ArchivedCallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ArchivedCallInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/voice/v1/archivedCall", "ArchivedCallInstance")
  @js.native
  open class ArchivedCallInstance protected () extends SerializableClass {
    /**
      * Initialize the ArchivedCallContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param date - The date of the Call in UTC.
      * @param sid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, payload: ArchivedCallPayload, date: js.Date, sid: String) = this()
    
    /* private */ var _proxy: ArchivedCallContext = js.native
    
    var date: js.Date = js.native
    
    /**
      * remove a ArchivedCallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ArchivedCallList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def ArchivedCallList(version: typings.twilio.voiceV1Mod.^): ArchivedCallListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ArchivedCallList")(version.asInstanceOf[js.Any]).asInstanceOf[ArchivedCallListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/archivedCall", "ArchivedCallPage")
  @js.native
  open class ArchivedCallPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.voiceV1Mod.^, 
          ArchivedCallPayload, 
          ArchivedCallResource, 
          ArchivedCallInstance
        ] {
    /**
      * Initialize the ArchivedCallPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ArchivedCallSolution
    ) = this()
    
    /**
      * Build an instance of ArchivedCallInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ArchivedCallPayload): ArchivedCallInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ArchivedCallListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ArchivedCallContext = js.native
    
    /**
      * Constructs a archived_call
      *
      * @param date - The date of the Call in UTC.
      * @param sid - The unique string that identifies this resource
      */
    def get(date: String, sid: String): ArchivedCallContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait ArchivedCallPayload
    extends StObject
       with ArchivedCallResource
       with TwilioResponsePayload
  object ArchivedCallPayload {
    
    inline def apply(
      date: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): ArchivedCallPayload = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArchivedCallPayload]
    }
  }
  
  trait ArchivedCallResource extends StObject {
    
    var date: js.Date
    
    var sid: String
    
    var url: String
  }
  object ArchivedCallResource {
    
    inline def apply(date: js.Date, sid: String, url: String): ArchivedCallResource = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArchivedCallResource]
    }
    
    extension [Self <: ArchivedCallResource](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArchivedCallSolution extends StObject
}
