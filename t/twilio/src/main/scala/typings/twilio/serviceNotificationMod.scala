package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceNotificationMod {
  
  @JSImport("twilio/lib/rest/notify/v1/service/notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/notify/v1/service/notification", "NotificationInstance")
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
      * @param serviceSid - The SID of the Service that the resource is associated with
      */
    def this(version: typings.twilio.notifyV1Mod.^, payload: NotificationPayload, serviceSid: String) = this()
    
    var accountSid: String = js.native
    
    var action: String = js.native
    
    var alexa: Any = js.native
    
    var apn: Any = js.native
    
    var body: String = js.native
    
    var data: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var facebookMessenger: Any = js.native
    
    var fcm: Any = js.native
    
    var gcm: Any = js.native
    
    var identities: js.Array[String] = js.native
    
    var priority: NotificationPriority = js.native
    
    var segments: js.Array[String] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var sms: Any = js.native
    
    var sound: String = js.native
    
    var tags: js.Array[String] = js.native
    
    var title: String = js.native
    
    var ttl: Double = js.native
  }
  
  /**
    * Initialize the NotificationList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    */
  inline def NotificationList(version: typings.twilio.notifyV1Mod.^, serviceSid: String): NotificationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("NotificationList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[NotificationListInstance]
  
  @JSImport("twilio/lib/rest/notify/v1/service/notification", "NotificationPage")
  @js.native
  open class NotificationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.notifyV1Mod.^, 
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
      version: typings.twilio.notifyV1Mod.^,
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
    * @property action - The actions to display for the notification
    * @property alexa - Deprecated
    * @property apn - The APNS-specific payload that overrides corresponding attributes in a generic payload for APNS Bindings
    * @property body - The notification body text
    * @property data - The custom key-value pairs of the notification's payload
    * @property deliveryCallbackUrl - URL to send webhooks
    * @property facebookMessenger - Deprecated
    * @property fcm - The FCM-specific payload that overrides corresponding attributes in generic payload for FCM Bindings
    * @property gcm - The GCM-specific payload that overrides corresponding attributes in generic payload for GCM Bindings
    * @property identity - The `identity` value that identifies the new resource's User
    * @property priority - The priority of the notification
    * @property segment - A Segment to notify
    * @property sms - The SMS-specific payload that overrides corresponding attributes in generic payload for SMS Bindings
    * @property sound - The name of the sound to be played for the notification
    * @property tag - A tag that selects the Bindings to notify
    * @property title - The notification title
    * @property toBinding - The destination address specified as a JSON string
    * @property ttl - How long, in seconds, the notification is valid
    */
  trait NotificationListInstanceCreateOptions extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var alexa: js.UndefOr[js.Object] = js.undefined
    
    var apn: js.UndefOr[js.Object] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var deliveryCallbackUrl: js.UndefOr[String] = js.undefined
    
    var facebookMessenger: js.UndefOr[js.Object] = js.undefined
    
    var fcm: js.UndefOr[js.Object] = js.undefined
    
    var gcm: js.UndefOr[js.Object] = js.undefined
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var priority: js.UndefOr[NotificationPriority] = js.undefined
    
    var segment: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var sms: js.UndefOr[js.Object] = js.undefined
    
    var sound: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var toBinding: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object NotificationListInstanceCreateOptions {
    
    inline def apply(): NotificationListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListInstanceCreateOptions]
    }
    
    extension [Self <: NotificationListInstanceCreateOptions](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAlexa(value: js.Object): Self = StObject.set(x, "alexa", value.asInstanceOf[js.Any])
      
      inline def setAlexaUndefined: Self = StObject.set(x, "alexa", js.undefined)
      
      inline def setApn(value: js.Object): Self = StObject.set(x, "apn", value.asInstanceOf[js.Any])
      
      inline def setApnUndefined: Self = StObject.set(x, "apn", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDeliveryCallbackUrl(value: String): Self = StObject.set(x, "deliveryCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setDeliveryCallbackUrlUndefined: Self = StObject.set(x, "deliveryCallbackUrl", js.undefined)
      
      inline def setFacebookMessenger(value: js.Object): Self = StObject.set(x, "facebookMessenger", value.asInstanceOf[js.Any])
      
      inline def setFacebookMessengerUndefined: Self = StObject.set(x, "facebookMessenger", js.undefined)
      
      inline def setFcm(value: js.Object): Self = StObject.set(x, "fcm", value.asInstanceOf[js.Any])
      
      inline def setFcmUndefined: Self = StObject.set(x, "fcm", js.undefined)
      
      inline def setGcm(value: js.Object): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
      
      inline def setGcmUndefined: Self = StObject.set(x, "gcm", js.undefined)
      
      inline def setIdentity(value: String | js.Array[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityVarargs(value: String*): Self = StObject.set(x, "identity", js.Array(value*))
      
      inline def setPriority(value: NotificationPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSegment(value: String | js.Array[String]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
      
      inline def setSegmentVarargs(value: String*): Self = StObject.set(x, "segment", js.Array(value*))
      
      inline def setSms(value: js.Object): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
      
      inline def setSmsUndefined: Self = StObject.set(x, "sms", js.undefined)
      
      inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTag(value: String | js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToBinding(value: String | js.Array[String]): Self = StObject.set(x, "toBinding", value.asInstanceOf[js.Any])
      
      inline def setToBindingUndefined: Self = StObject.set(x, "toBinding", js.undefined)
      
      inline def setToBindingVarargs(value: String*): Self = StObject.set(x, "toBinding", js.Array(value*))
      
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
      action: String,
      alexa: js.Object,
      apn: js.Object,
      body: String,
      data: js.Object,
      date_created: js.Date,
      facebook_messenger: js.Object,
      fcm: js.Object,
      first_page_uri: String,
      gcm: js.Object,
      identities: js.Array[String],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      priority: NotificationPriority,
      segments: js.Array[String],
      service_sid: String,
      sid: String,
      sms: js.Object,
      sound: String,
      tags: js.Array[String],
      title: String,
      ttl: Double,
      uri: String
    ): NotificationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], alexa = alexa.asInstanceOf[js.Any], apn = apn.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], facebook_messenger = facebook_messenger.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms = sms.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationPayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.high
    - typings.twilio.twilioStrings.low
  */
  trait NotificationPriority extends StObject
  object NotificationPriority {
    
    inline def high: typings.twilio.twilioStrings.high = "high".asInstanceOf[typings.twilio.twilioStrings.high]
    
    inline def low: typings.twilio.twilioStrings.low = "low".asInstanceOf[typings.twilio.twilioStrings.low]
  }
  
  trait NotificationResource extends StObject {
    
    var account_sid: String
    
    var action: String
    
    var alexa: js.Object
    
    var apn: js.Object
    
    var body: String
    
    var data: js.Object
    
    var date_created: js.Date
    
    var facebook_messenger: js.Object
    
    var fcm: js.Object
    
    var gcm: js.Object
    
    var identities: js.Array[String]
    
    var priority: NotificationPriority
    
    var segments: js.Array[String]
    
    var service_sid: String
    
    var sid: String
    
    var sms: js.Object
    
    var sound: String
    
    var tags: js.Array[String]
    
    var title: String
    
    var ttl: Double
  }
  object NotificationResource {
    
    inline def apply(
      account_sid: String,
      action: String,
      alexa: js.Object,
      apn: js.Object,
      body: String,
      data: js.Object,
      date_created: js.Date,
      facebook_messenger: js.Object,
      fcm: js.Object,
      gcm: js.Object,
      identities: js.Array[String],
      priority: NotificationPriority,
      segments: js.Array[String],
      service_sid: String,
      sid: String,
      sms: js.Object,
      sound: String,
      tags: js.Array[String],
      title: String,
      ttl: Double
    ): NotificationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], alexa = alexa.asInstanceOf[js.Any], apn = apn.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], facebook_messenger = facebook_messenger.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms = sms.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationResource]
    }
    
    extension [Self <: NotificationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setAlexa(value: js.Object): Self = StObject.set(x, "alexa", value.asInstanceOf[js.Any])
      
      inline def setApn(value: js.Object): Self = StObject.set(x, "apn", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setFacebook_messenger(value: js.Object): Self = StObject.set(x, "facebook_messenger", value.asInstanceOf[js.Any])
      
      inline def setFcm(value: js.Object): Self = StObject.set(x, "fcm", value.asInstanceOf[js.Any])
      
      inline def setGcm(value: js.Object): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
      
      inline def setIdentities(value: js.Array[String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      inline def setIdentitiesVarargs(value: String*): Self = StObject.set(x, "identities", js.Array(value*))
      
      inline def setPriority(value: NotificationPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setSegments(value: js.Array[String]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: String*): Self = StObject.set(x, "segments", js.Array(value*))
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSms(value: js.Object): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
      
      inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object NotificationSolution {
    
    inline def apply(): NotificationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationSolution]
    }
    
    extension [Self <: NotificationSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
