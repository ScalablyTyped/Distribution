package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bulkCountryUpdateMod {
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/bulkCountryUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/bulkCountryUpdate", "BulkCountryUpdateInstance")
  @js.native
  open class BulkCountryUpdateInstance protected () extends SerializableClass {
    /**
      * Initialize the BulkCountryUpdateContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.voiceV1Mod.^, payload: BulkCountryUpdatePayload) = this()
    
    var updateCount: Double = js.native
    
    var updateRequest: String = js.native
  }
  
  /**
    * Initialize the BulkCountryUpdateList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def BulkCountryUpdateList(version: typings.twilio.voiceV1Mod.^): BulkCountryUpdateListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("BulkCountryUpdateList")(version.asInstanceOf[js.Any]).asInstanceOf[BulkCountryUpdateListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/bulkCountryUpdate", "BulkCountryUpdatePage")
  @js.native
  open class BulkCountryUpdatePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.voiceV1Mod.^, 
          BulkCountryUpdatePayload, 
          BulkCountryUpdateResource, 
          BulkCountryUpdateInstance
        ] {
    /**
      * Initialize the BulkCountryUpdatePage
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
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: BulkCountryUpdateSolution
    ) = this()
    
    /**
      * Build an instance of BulkCountryUpdateInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BulkCountryUpdatePayload): BulkCountryUpdateInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait BulkCountryUpdateListInstance extends StObject {
    
    /**
      * create a BulkCountryUpdateInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: BulkCountryUpdateListInstanceCreateOptions): js.Promise[BulkCountryUpdateInstance] = js.native
    def create(
      opts: BulkCountryUpdateListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ BulkCountryUpdateInstance, Any]
    ): js.Promise[BulkCountryUpdateInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property updateRequest - URL encoded JSON array of update objects
    */
  trait BulkCountryUpdateListInstanceCreateOptions extends StObject {
    
    var updateRequest: String
  }
  object BulkCountryUpdateListInstanceCreateOptions {
    
    inline def apply(updateRequest: String): BulkCountryUpdateListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(updateRequest = updateRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulkCountryUpdateListInstanceCreateOptions]
    }
    
    extension [Self <: BulkCountryUpdateListInstanceCreateOptions](x: Self) {
      
      inline def setUpdateRequest(value: String): Self = StObject.set(x, "updateRequest", value.asInstanceOf[js.Any])
    }
  }
  
  trait BulkCountryUpdatePayload
    extends StObject
       with BulkCountryUpdateResource
       with TwilioResponsePayload
  object BulkCountryUpdatePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      update_count: Double,
      update_request: String,
      uri: String
    ): BulkCountryUpdatePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], update_count = update_count.asInstanceOf[js.Any], update_request = update_request.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulkCountryUpdatePayload]
    }
  }
  
  trait BulkCountryUpdateResource extends StObject {
    
    var update_count: Double
    
    var update_request: String
  }
  object BulkCountryUpdateResource {
    
    inline def apply(update_count: Double, update_request: String): BulkCountryUpdateResource = {
      val __obj = js.Dynamic.literal(update_count = update_count.asInstanceOf[js.Any], update_request = update_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulkCountryUpdateResource]
    }
    
    extension [Self <: BulkCountryUpdateResource](x: Self) {
      
      inline def setUpdate_count(value: Double): Self = StObject.set(x, "update_count", value.asInstanceOf[js.Any])
      
      inline def setUpdate_request(value: String): Self = StObject.set(x, "update_request", value.asInstanceOf[js.Any])
    }
  }
  
  trait BulkCountryUpdateSolution extends StObject
}
