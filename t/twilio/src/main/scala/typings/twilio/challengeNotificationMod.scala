package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object challengeNotificationMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/challenge/notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/challenge/notification", "NotificationInstance")
  @js.native
  open class NotificationInstance protected () extends SerializableClass {
    /**
      * Initialize the NotificationContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Service Sid.
      * @param identity - Unique external identifier of the Entity
      * @param challengeSid - Challenge Sid.
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      payload: NotificationPayload,
      serviceSid: String,
      identity: String,
      challengeSid: String
    ) = this()
    
    var accountSid: String = js.native
    
    var challengeSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var entitySid: String = js.native
    
    var identity: String = js.native
    
    var priority: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var ttl: Double = js.native
  }
  
  /**
    * Initialize the NotificationList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - Service Sid.
    * @param identity - Unique external identifier of the Entity
    * @param challengeSid - Challenge Sid.
    */
  inline def NotificationList(version: typings.twilio.verifyV2Mod.^, serviceSid: String, identity: String, challengeSid: String): NotificationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("NotificationList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], identity.asInstanceOf[js.Any], challengeSid.asInstanceOf[js.Any])).asInstanceOf[NotificationListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/challenge/notification", "NotificationPage")
  @js.native
  open class NotificationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.verifyV2Mod.^, 
          NotificationPayload, 
          NotificationResource, 
          NotificationInstance
        ] {
    /**
      * Initialize the NotificationPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: NotificationSolution
    ) = this()
    
    /**
      * Build an instance of NotificationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NotificationPayload): NotificationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait NotificationListInstance extends StObject {
    
    /**
      * create a NotificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[NotificationInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ NotificationInstance, Any]): js.Promise[NotificationInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ NotificationInstance, Any]
    ): js.Promise[NotificationInstance] = js.native
    def create(opts: NotificationListInstanceCreateOptions): js.Promise[NotificationInstance] = js.native
    def create(
      opts: NotificationListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ NotificationInstance, Any]
    ): js.Promise[NotificationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property ttl - How long, in seconds, the notification is valid.
    */
  trait NotificationListInstanceCreateOptions extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object NotificationListInstanceCreateOptions {
    
    inline def apply(): NotificationListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListInstanceCreateOptions]
    }
    
    extension [Self <: NotificationListInstanceCreateOptions](x: Self) {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait NotificationPayload
    extends StObject
       with NotificationResource
       with TwilioResponsePayload
  object NotificationPayload {
    
    inline def apply(
      account_sid: String,
      challenge_sid: String,
      date_created: js.Date,
      entity_sid: String,
      first_page_uri: String,
      identity: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      priority: String,
      service_sid: String,
      sid: String,
      ttl: Double,
      uri: String
    ): NotificationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], challenge_sid = challenge_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], entity_sid = entity_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationPayload]
    }
  }
  
  trait NotificationResource extends StObject {
    
    var account_sid: String
    
    var challenge_sid: String
    
    var date_created: js.Date
    
    var entity_sid: String
    
    var identity: String
    
    var priority: String
    
    var service_sid: String
    
    var sid: String
    
    var ttl: Double
  }
  object NotificationResource {
    
    inline def apply(
      account_sid: String,
      challenge_sid: String,
      date_created: js.Date,
      entity_sid: String,
      identity: String,
      priority: String,
      service_sid: String,
      sid: String,
      ttl: Double
    ): NotificationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], challenge_sid = challenge_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], entity_sid = entity_sid.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationResource]
    }
    
    extension [Self <: NotificationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChallenge_sid(value: String): Self = StObject.set(x, "challenge_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setEntity_sid(value: String): Self = StObject.set(x, "entity_sid", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationSolution extends StObject {
    
    var challengeSid: js.UndefOr[String] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object NotificationSolution {
    
    inline def apply(): NotificationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationSolution]
    }
    
    extension [Self <: NotificationSolution](x: Self) {
      
      inline def setChallengeSid(value: String): Self = StObject.set(x, "challengeSid", value.asInstanceOf[js.Any])
      
      inline def setChallengeSidUndefined: Self = StObject.set(x, "challengeSid", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
