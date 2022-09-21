package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceItemsMod {
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/replaceItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/replaceItems", "ReplaceItemsInstance")
  @js.native
  open class ReplaceItemsInstance protected () extends SerializableClass {
    /**
      * Initialize the ReplaceItemsContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param bundleSid - The unique string that identifies the resource.
      */
    def this(version: typings.twilio.numbersV2Mod.^, payload: ReplaceItemsPayload, bundleSid: String) = this()
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var email: String = js.native
    
    var friendlyName: String = js.native
    
    var regulationSid: String = js.native
    
    var sid: String = js.native
    
    var status: ReplaceItemsStatus = js.native
    
    var statusCallback: String = js.native
    
    var validUntil: js.Date = js.native
  }
  
  /**
    * Initialize the ReplaceItemsList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param bundleSid - The unique string that identifies the resource.
    */
  inline def ReplaceItemsList(version: typings.twilio.numbersV2Mod.^, bundleSid: String): ReplaceItemsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ReplaceItemsList")(version.asInstanceOf[js.Any], bundleSid.asInstanceOf[js.Any])).asInstanceOf[ReplaceItemsListInstance]
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/replaceItems", "ReplaceItemsPage")
  @js.native
  open class ReplaceItemsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.numbersV2Mod.^, 
          ReplaceItemsPayload, 
          ReplaceItemsResource, 
          ReplaceItemsInstance
        ] {
    /**
      * Initialize the ReplaceItemsPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.numbersV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ReplaceItemsSolution
    ) = this()
    
    /**
      * Build an instance of ReplaceItemsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ReplaceItemsPayload): ReplaceItemsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.individual
    - typings.twilio.twilioStrings.business
  */
  trait ReplaceItemsEndUserType extends StObject
  object ReplaceItemsEndUserType {
    
    inline def business: typings.twilio.twilioStrings.business = "business".asInstanceOf[typings.twilio.twilioStrings.business]
    
    inline def individual: typings.twilio.twilioStrings.individual = "individual".asInstanceOf[typings.twilio.twilioStrings.individual]
  }
  
  @js.native
  trait ReplaceItemsListInstance extends StObject {
    
    /**
      * create a ReplaceItemsInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ReplaceItemsListInstanceCreateOptions): js.Promise[ReplaceItemsInstance] = js.native
    def create(
      opts: ReplaceItemsListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ReplaceItemsInstance, Any]
    ): js.Promise[ReplaceItemsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property fromBundleSid - The source bundle sid to copy the item assignments from
    */
  trait ReplaceItemsListInstanceCreateOptions extends StObject {
    
    var fromBundleSid: String
  }
  object ReplaceItemsListInstanceCreateOptions {
    
    inline def apply(fromBundleSid: String): ReplaceItemsListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(fromBundleSid = fromBundleSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceItemsListInstanceCreateOptions]
    }
    
    extension [Self <: ReplaceItemsListInstanceCreateOptions](x: Self) {
      
      inline def setFromBundleSid(value: String): Self = StObject.set(x, "fromBundleSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplaceItemsPayload
    extends StObject
       with ReplaceItemsResource
       with TwilioResponsePayload
  object ReplaceItemsPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      regulation_sid: String,
      sid: String,
      status: ReplaceItemsStatus,
      status_callback: String,
      uri: String,
      valid_until: js.Date
    ): ReplaceItemsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], regulation_sid = regulation_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceItemsPayload]
    }
  }
  
  trait ReplaceItemsResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var friendly_name: String
    
    var regulation_sid: String
    
    var sid: String
    
    var status: ReplaceItemsStatus
    
    var status_callback: String
    
    var valid_until: js.Date
  }
  object ReplaceItemsResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      friendly_name: String,
      regulation_sid: String,
      sid: String,
      status: ReplaceItemsStatus,
      status_callback: String,
      valid_until: js.Date
    ): ReplaceItemsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], regulation_sid = regulation_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceItemsResource]
    }
    
    extension [Self <: ReplaceItemsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setRegulation_sid(value: String): Self = StObject.set(x, "regulation_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ReplaceItemsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setValid_until(value: js.Date): Self = StObject.set(x, "valid_until", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplaceItemsSolution extends StObject {
    
    var bundleSid: js.UndefOr[String] = js.undefined
  }
  object ReplaceItemsSolution {
    
    inline def apply(): ReplaceItemsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceItemsSolution]
    }
    
    extension [Self <: ReplaceItemsSolution](x: Self) {
      
      inline def setBundleSid(value: String): Self = StObject.set(x, "bundleSid", value.asInstanceOf[js.Any])
      
      inline def setBundleSidUndefined: Self = StObject.set(x, "bundleSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.draft
    - typings.twilio.twilioStrings.`pending-review`
    - typings.twilio.twilioStrings.`in-review`
    - typings.twilio.twilioStrings.`twilio-rejected`
    - typings.twilio.twilioStrings.`twilio-approved`
    - typings.twilio.twilioStrings.`provisionally-approved`
  */
  trait ReplaceItemsStatus extends StObject
  object ReplaceItemsStatus {
    
    inline def draft: typings.twilio.twilioStrings.draft = "draft".asInstanceOf[typings.twilio.twilioStrings.draft]
    
    inline def `in-review`: typings.twilio.twilioStrings.`in-review` = "in-review".asInstanceOf[typings.twilio.twilioStrings.`in-review`]
    
    inline def `pending-review`: typings.twilio.twilioStrings.`pending-review` = "pending-review".asInstanceOf[typings.twilio.twilioStrings.`pending-review`]
    
    inline def `provisionally-approved`: typings.twilio.twilioStrings.`provisionally-approved` = "provisionally-approved".asInstanceOf[typings.twilio.twilioStrings.`provisionally-approved`]
    
    inline def `twilio-approved`: typings.twilio.twilioStrings.`twilio-approved` = "twilio-approved".asInstanceOf[typings.twilio.twilioStrings.`twilio-approved`]
    
    inline def `twilio-rejected`: typings.twilio.twilioStrings.`twilio-rejected` = "twilio-rejected".asInstanceOf[typings.twilio.twilioStrings.`twilio-rejected`]
  }
}
