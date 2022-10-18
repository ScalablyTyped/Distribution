package typings.twilioMcsClient

import org.scalablytyped.runtime.StringDictionary
import typings.loglevel.mod.LogLevelDesc
import typings.node.bufferMod.global.Buffer
import typings.std.Blob
import typings.std.FormData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @classdesc A Client provides an interface for Media Content Service
    */
  @JSImport("@twilio/mcs-client", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Client {
    /**
      * Base URLs must be full URLs with host. If host is not provided it will be generated from a default configuration
      * template using options.region.
      *
      * @param {String} token - Access token
      * @param {String} baseUrl - Base URL for Media Content Service Media resource, i.e. /v1/Services/{serviceSid}/Media
      * @param {String} baseSetUrl - Base URL for Media Content Service MediaSet resource, i.e. /v1/Services/{serviceSid}/MediaSet
      * @param {Client#ClientOptions} [options] - Options to customize the Client
      */
    def this(token: String, baseUrl: String) = this()
    def this(token: String, baseUrl: String, baseSetUrl: String) = this()
    def this(token: String, baseUrl: String, baseSetUrl: String, options: Options0) = this()
    def this(token: String, baseUrl: String, baseSetUrl: Null, options: Options0) = this()
  }
  object default {
    
    /* static member */
    @JSImport("@twilio/mcs-client", "default.version")
    @js.native
    val version: String = js.native
  }
  
  /**
    * @classdesc A Client provides an interface for Media Content Service
    */
  @JSImport("@twilio/mcs-client", "McsClient")
  @js.native
  open class McsClient protected ()
    extends StObject
       with Client {
    /**
      * Base URLs must be full URLs with host. If host is not provided it will be generated from a default configuration
      * template using options.region.
      *
      * @param {String} token - Access token
      * @param {String} baseUrl - Base URL for Media Content Service Media resource, i.e. /v1/Services/{serviceSid}/Media
      * @param {String} baseSetUrl - Base URL for Media Content Service MediaSet resource, i.e. /v1/Services/{serviceSid}/MediaSet
      * @param {Client#ClientOptions} [options] - Options to customize the Client
      */
    def this(token: String, baseUrl: String) = this()
    def this(token: String, baseUrl: String, baseSetUrl: String) = this()
    def this(token: String, baseUrl: String, baseSetUrl: String, options: Options0) = this()
    def this(token: String, baseUrl: String, baseSetUrl: Null, options: Options0) = this()
  }
  object McsClient {
    
    /* static member */
    @JSImport("@twilio/mcs-client", "McsClient.version")
    @js.native
    val version: String = js.native
  }
  
  /**
    * @classdesc A Media represents a metadata information for the media upload
    * @property {String} sid - The server-assigned unique identifier for Media
    * @property {String} serviceSid - Service instance id which Media belongs/uploaded to
    * @property {Date} dateCreated - When the Media was created
    * @property {Date} dateUpdated - When the Media was updated
    * @property {Number} size - Size of media, bytes
    * @property {String} contentType - content type of media
    * @property {String} fileName - file name, if present, null otherwise
    * @property {MediaCategory} category - attachment category
    */
  @JSImport("@twilio/mcs-client", "McsMedia")
  @js.native
  open class McsMedia protected () extends Media {
    def this(config: Configuration, network: Network, data: MediaResponse) = this()
  }
  
  /**
    * @classdesc A Media represents a metadata information for the media upload
    * @property {String} sid - The server-assigned unique identifier for Media
    * @property {String} serviceSid - Service instance id which Media belongs/uploaded to
    * @property {Date} dateCreated - When the Media was created
    * @property {Date} dateUpdated - When the Media was updated
    * @property {Number} size - Size of media, bytes
    * @property {String} contentType - content type of media
    * @property {String} fileName - file name, if present, null otherwise
    * @property {MediaCategory} category - attachment category
    */
  @JSImport("@twilio/mcs-client", "Media")
  @js.native
  open class Media protected () extends StObject {
    def this(config: Configuration, network: Network, data: MediaResponse) = this()
    
    /* private */ var _update: Any = js.native
    
    def category: MediaCategory = js.native
    
    /* private */ var config: Any = js.native
    
    def contentType: String = js.native
    
    def dateCreated: js.Date | Null = js.native
    
    def dateUpdated: js.Date | Null = js.native
    
    /** @deprecated Use filename instead */
    def fileName: String | Null = js.native
    
    def filename: String | Null = js.native
    
    /**
      * Returns direct content URL to uploaded binary. This URL will expire after some time.
      * This function does not support getting a new URL however. Once set it will remain the same.
      * Use getContentUrl() to query a new one.
      *
      * It is reasonable to build your own refresh logic upon these two functions: as soon as URL returned
      * by getCachedContentUrl() returns 40x status you should call getContentUrl() to refresh it.
      *
      * @returns {Promise<string>}
      */
    def getCachedContentUrl(): js.Promise[String | Null] = js.native
    
    /**
      * Returns direct content URL to uploaded binary. This URL will expire after some time.
      * This function gets a new URL every time, preventing it from expiring but putting additional load on backend.
      * See getCachedContentUrl() for a function that reduces the amount of network requests.
      *
      * It is reasonable to build your own refresh logic upon these two functions: as soon as URL returned
      * by getCachedContentUrl() returns 40x status you should call getContentUrl() to refresh it.
      *
      * @returns {Promise<string>}
      */
    def getContentUrl(): js.Promise[String | Null] = js.native
    
    /* private */ var network: Any = js.native
    
    def serviceSid: String = js.native
    
    def sid: String = js.native
    
    def size: Double = js.native
    
    /* private */ var state: Any = js.native
  }
  
  trait BackoffOverride extends StObject {
    
    var max: Double
    
    var maxAttemptsCount: js.UndefOr[Double] = js.undefined
    
    var min: Double
  }
  object BackoffOverride {
    
    inline def apply(max: Double, min: Double): BackoffOverride = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackoffOverride]
    }
    
    extension [Self <: BackoffOverride](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCount(value: Double): Self = StObject.set(x, "maxAttemptsCount", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCountUndefined: Self = StObject.set(x, "maxAttemptsCount", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @classdesc A Client provides an interface for Media Content Service
    */
  @js.native
  trait Client extends StObject {
    
    /* private */ var config: Any = js.native
    
    /**
      * Gets media from media service
      * @param {String} sid - Media's SID
      * @returns {Promise<Media>}
      */
    def get(sid: String): js.Promise[Media] = js.native
    
    /**
      * Retrieve information about multiple media SIDs at the same time.
      * @param mediaSids Array of Media SIDs to get information from.
      */
    def mediaSetGet(mediaSids: js.Array[String]): js.Promise[js.Array[Media]] = js.native
    
    /* private */ var network: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * Posts raw content to media service
      * @param {String} contentType - content type of media
      * @param {String|Buffer|Blob} media - content to post
      * @param {MediaCategory|null} category - category for the media
      * @returns {Promise<Media>}
      */
    def post(contentType: String, media: String): js.Promise[Media] = js.native
    def post(contentType: String, media: String, category: Null, filename: String): js.Promise[Media] = js.native
    def post(contentType: String, media: String, category: MediaCategory): js.Promise[Media] = js.native
    def post(contentType: String, media: String, category: MediaCategory, filename: String): js.Promise[Media] = js.native
    def post(contentType: String, media: Buffer): js.Promise[Media] = js.native
    def post(contentType: String, media: Buffer, category: Null, filename: String): js.Promise[Media] = js.native
    def post(contentType: String, media: Buffer, category: MediaCategory): js.Promise[Media] = js.native
    def post(contentType: String, media: Buffer, category: MediaCategory, filename: String): js.Promise[Media] = js.native
    def post(contentType: String, media: Blob): js.Promise[Media] = js.native
    def post(contentType: String, media: Blob, category: Null, filename: String): js.Promise[Media] = js.native
    def post(contentType: String, media: Blob, category: MediaCategory): js.Promise[Media] = js.native
    def post(contentType: String, media: Blob, category: MediaCategory, filename: String): js.Promise[Media] = js.native
    
    /**
      * Posts FormData to media service. Can be used only with browser engine's FormData.
      * In non-browser FormData case the method will do promise reject with
      * new TypeError("Posting FormData supported only with browser engine's FormData")
      * @param {FormData} formData - form data to post
      * @param {MediaCategory|null} category - category for the media
      * @returns {Promise<Media>}
      */
    def postFormData(formData: FormData): js.Promise[Media] = js.native
    def postFormData(formData: FormData, category: MediaCategory): js.Promise[Media] = js.native
    
    // eslint-disable-next-line
    /* private */ val transport: Any = js.native
    
    /**
      * These options can be passed to Client constructor
      * @typedef {Object} Client#ClientOptions
      * @property {String} [logLevel='silent'] - The level of logging to enable. Valid options
      *   (from strictest to broadest): ['silent', 'error', 'warn', 'info', 'debug', 'trace']
      */
    /**
      * Update the token used for Client operations
      * @param {String} token - The JWT string of the new token
      * @returns {void}
      */
    def updateToken(token: String): Unit = js.native
  }
  
  trait Configuration extends StObject {
    
    val backoffConfigOverride: BackoffOverride
    
    val mediaSetUrl: String
    
    val mediaUrl: String
    
    /* private */ val region: Any
    
    val retryWhenThrottledOverride: Boolean
    
    var token: String
    
    def updateToken(token: String): Unit
  }
  object Configuration {
    
    inline def apply(
      backoffConfigOverride: BackoffOverride,
      mediaSetUrl: String,
      mediaUrl: String,
      region: Any,
      retryWhenThrottledOverride: Boolean,
      token: String,
      updateToken: String => Unit
    ): Configuration = {
      val __obj = js.Dynamic.literal(backoffConfigOverride = backoffConfigOverride.asInstanceOf[js.Any], mediaSetUrl = mediaSetUrl.asInstanceOf[js.Any], mediaUrl = mediaUrl.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], retryWhenThrottledOverride = retryWhenThrottledOverride.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], updateToken = js.Any.fromFunction1(updateToken))
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setBackoffConfigOverride(value: BackoffOverride): Self = StObject.set(x, "backoffConfigOverride", value.asInstanceOf[js.Any])
      
      inline def setMediaSetUrl(value: String): Self = StObject.set(x, "mediaSetUrl", value.asInstanceOf[js.Any])
      
      inline def setMediaUrl(value: String): Self = StObject.set(x, "mediaUrl", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: Any): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRetryWhenThrottledOverride(value: Boolean): Self = StObject.set(x, "retryWhenThrottledOverride", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUpdateToken(value: String => Unit): Self = StObject.set(x, "updateToken", js.Any.fromFunction1(value))
    }
  }
  
  type Headers = StringDictionary[String]
  
  trait Links extends StObject {
    
    var content: String
    
    var content_direct_temporary: js.UndefOr[String] = js.undefined
  }
  object Links {
    
    inline def apply(content: String): Links = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Links]
    }
    
    extension [Self <: Links](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContent_direct_temporary(value: String): Self = StObject.set(x, "content_direct_temporary", value.asInstanceOf[js.Any])
      
      inline def setContent_direct_temporaryUndefined: Self = StObject.set(x, "content_direct_temporary", js.undefined)
    }
  }
  
  trait McsOptions extends StObject {
    
    var backoffConfigOverride: js.UndefOr[BackoffOverride] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var retryWhenThrottledOverride: js.UndefOr[Boolean] = js.undefined
  }
  object McsOptions {
    
    inline def apply(): McsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[McsOptions]
    }
    
    extension [Self <: McsOptions](x: Self) {
      
      inline def setBackoffConfigOverride(value: BackoffOverride): Self = StObject.set(x, "backoffConfigOverride", value.asInstanceOf[js.Any])
      
      inline def setBackoffConfigOverrideUndefined: Self = StObject.set(x, "backoffConfigOverride", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRetryWhenThrottledOverride(value: Boolean): Self = StObject.set(x, "retryWhenThrottledOverride", value.asInstanceOf[js.Any])
      
      inline def setRetryWhenThrottledOverrideUndefined: Self = StObject.set(x, "retryWhenThrottledOverride", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioMcsClient.twilioMcsClientStrings.media
    - typings.twilioMcsClient.twilioMcsClientStrings.body
    - typings.twilioMcsClient.twilioMcsClientStrings.history
  */
  trait MediaCategory extends StObject
  object MediaCategory {
    
    inline def body: typings.twilioMcsClient.twilioMcsClientStrings.body = "body".asInstanceOf[typings.twilioMcsClient.twilioMcsClientStrings.body]
    
    inline def history: typings.twilioMcsClient.twilioMcsClientStrings.history = "history".asInstanceOf[typings.twilioMcsClient.twilioMcsClientStrings.history]
    
    inline def media: typings.twilioMcsClient.twilioMcsClientStrings.media = "media".asInstanceOf[typings.twilioMcsClient.twilioMcsClientStrings.media]
  }
  
  trait MediaResponse extends StObject {
    
    var author: String
    
    var category: js.UndefOr[MediaCategory] = js.undefined
    
    var channel_sid: String | Null
    
    var content_type: String
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var date_upload_updated: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var is_multipart_upstream: js.UndefOr[Boolean] = js.undefined
    
    var links: Links
    
    var message_sid: String | Null
    
    var service_sid: String
    
    var sid: String
    
    var size: Double
    
    var url: String
  }
  object MediaResponse {
    
    inline def apply(
      author: String,
      content_type: String,
      links: Links,
      service_sid: String,
      sid: String,
      size: Double,
      url: String
    ): MediaResponse = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], channel_sid = null, message_sid = null)
      __obj.asInstanceOf[MediaResponse]
    }
    
    extension [Self <: MediaResponse](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: MediaCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setChannel_sid(value: String): Self = StObject.set(x, "channel_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_sidNull: Self = StObject.set(x, "channel_sid", null)
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setDate_upload_updated(value: String): Self = StObject.set(x, "date_upload_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_upload_updatedUndefined: Self = StObject.set(x, "date_upload_updated", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIs_multipart_upstream(value: Boolean): Self = StObject.set(x, "is_multipart_upstream", value.asInstanceOf[js.Any])
      
      inline def setIs_multipart_upstreamUndefined: Self = StObject.set(x, "is_multipart_upstream", js.undefined)
      
      inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMessage_sid(value: String): Self = StObject.set(x, "message_sid", value.asInstanceOf[js.Any])
      
      inline def setMessage_sidNull: Self = StObject.set(x, "message_sid", null)
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Network extends StObject {
    
    /* private */ var backoffConfig: Any = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ var executeWithRetry: Any = js.native
    
    def get(url: String): js.Promise[Any] = js.native
    
    def post(url: String, category: Null, media: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: String, contentType: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: String, contentType: String, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: String, contentType: Unit, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Buffer): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Buffer, contentType: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Buffer, contentType: String, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Buffer, contentType: Unit, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Blob): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Blob, contentType: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Blob, contentType: String, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Blob, contentType: Unit, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: FormData): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: FormData, contentType: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: FormData, contentType: String, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: FormData, contentType: Unit, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Record[String, Any]): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Record[String, Any], contentType: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Record[String, Any], contentType: String, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: Null, media: Record[String, Any], contentType: Unit, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: String, contentType: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: String, contentType: String, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: String, contentType: Unit, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Buffer): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Buffer, contentType: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Buffer, contentType: String, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Buffer, contentType: Unit, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Blob): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Blob, contentType: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Blob, contentType: String, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Blob, contentType: Unit, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: FormData): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: FormData, contentType: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: FormData, contentType: String, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: FormData, contentType: Unit, filename: String): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Record[String, Any]): js.Promise[Any] = js.native
    def post(url: String, category: MediaCategory, media: Record[String, Any], contentType: String): js.Promise[Any] = js.native
    def post(
      url: String,
      category: MediaCategory,
      media: Record[String, Any],
      contentType: String,
      filename: String
    ): js.Promise[Any] = js.native
    def post(
      url: String,
      category: MediaCategory,
      media: Record[String, Any],
      contentType: Unit,
      filename: String
    ): js.Promise[Any] = js.native
    
    /* private */ var retryWhenThrottled: Any = js.native
    
    /* private */ val transport: Any = js.native
  }
  
  trait Options extends StObject {
    
    var MCS: js.UndefOr[McsOptions] = js.undefined
    
    var backoffConfigOverride: js.UndefOr[BackoffOverride] = js.undefined
    
    var logLevel: js.UndefOr[LogLevelDesc] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var retryWhenThrottledOverride: js.UndefOr[Boolean] = js.undefined
    
    var transport: js.UndefOr[Transport] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackoffConfigOverride(value: BackoffOverride): Self = StObject.set(x, "backoffConfigOverride", value.asInstanceOf[js.Any])
      
      inline def setBackoffConfigOverrideUndefined: Self = StObject.set(x, "backoffConfigOverride", js.undefined)
      
      inline def setLogLevel(value: LogLevelDesc): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMCS(value: McsOptions): Self = StObject.set(x, "MCS", value.asInstanceOf[js.Any])
      
      inline def setMCSUndefined: Self = StObject.set(x, "MCS", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRetryWhenThrottledOverride(value: Boolean): Self = StObject.set(x, "retryWhenThrottledOverride", value.asInstanceOf[js.Any])
      
      inline def setRetryWhenThrottledOverrideUndefined: Self = StObject.set(x, "retryWhenThrottledOverride", js.undefined)
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait Options0 extends StObject {
    
    var logLevel: js.UndefOr[LogLevelDesc] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var transport: js.UndefOr[Transport] = js.undefined
  }
  object Options0 {
    
    inline def apply(): Options0 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options0]
    }
    
    extension [Self <: Options0](x: Self) {
      
      inline def setLogLevel(value: LogLevelDesc): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait Response extends StObject {
    
    var body: Any
    
    var headers: Headers
    
    var status: Any
  }
  object Response {
    
    inline def apply(body: Any, headers: Headers, status: Any): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides generic network interface
    */
  @js.native
  trait Transport extends StObject {
    
    /**
      * Make a GET request by given URL
      */
    def get(url: String, headers: Headers): js.Promise[Response] = js.native
    
    /**
      * Make a POST request by given URL
      */
    def post(url: String, headers: Headers): js.Promise[Response] = js.native
    def post(url: String, headers: Headers, body: Any): js.Promise[Response] = js.native
  }
}
