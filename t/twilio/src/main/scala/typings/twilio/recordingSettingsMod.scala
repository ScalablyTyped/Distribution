package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordingSettingsMod {
  
  @JSImport("twilio/lib/rest/video/v1/recordingSettings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/recordingSettings", "RecordingSettingsContext")
  @js.native
  open class RecordingSettingsContext protected () extends StObject {
    /**
      * Initialize the RecordingSettingsContext
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.videoV1Mod.^) = this()
    
    /**
      * create a RecordingSettingsInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: RecordingSettingsInstanceCreateOptions): js.Promise[RecordingSettingsInstance] = js.native
    def create(
      opts: RecordingSettingsInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ RecordingSettingsInstance, Any]
    ): js.Promise[RecordingSettingsInstance] = js.native
    
    /**
      * fetch a RecordingSettingsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RecordingSettingsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingSettingsInstance, Any]): js.Promise[RecordingSettingsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/recordingSettings", "RecordingSettingsInstance")
  @js.native
  open class RecordingSettingsInstance protected () extends SerializableClass {
    /**
      * Initialize the RecordingSettingsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.videoV1Mod.^, payload: RecordingSettingsPayload) = this()
    
    /* private */ var _proxy: RecordingSettingsContext = js.native
    
    var accountSid: String = js.native
    
    var awsCredentialsSid: String = js.native
    
    var awsS3Url: String = js.native
    
    var awsStorageEnabled: Boolean = js.native
    
    /**
      * create a RecordingSettingsInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: RecordingSettingsInstanceCreateOptions): js.Promise[RecordingSettingsInstance] = js.native
    def create(
      opts: RecordingSettingsInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[RecordingSettingsInstance] = js.native
    
    var encryptionEnabled: Boolean = js.native
    
    var encryptionKeySid: String = js.native
    
    /**
      * fetch a RecordingSettingsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RecordingSettingsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RecordingSettingsInstance] = js.native
    
    var friendlyName: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the RecordingSettingsList
    *
    * @param version - Version of the resource
    */
  inline def RecordingSettingsList(version: typings.twilio.videoV1Mod.^): RecordingSettingsListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("RecordingSettingsList")(version.asInstanceOf[js.Any]).asInstanceOf[RecordingSettingsListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/recordingSettings", "RecordingSettingsPage")
  @js.native
  open class RecordingSettingsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.videoV1Mod.^, 
          RecordingSettingsPayload, 
          RecordingSettingsResource, 
          RecordingSettingsInstance
        ] {
    /**
      * Initialize the RecordingSettingsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RecordingSettingsSolution
    ) = this()
    
    /**
      * Build an instance of RecordingSettingsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RecordingSettingsPayload): RecordingSettingsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property awsCredentialsSid - The SID of the stored Credential resource
    * @property awsS3Url - The URL of the AWS S3 bucket where the recordings should be stored
    * @property awsStorageEnabled - Whether all recordings should be written to the aws_s3_url
    * @property encryptionEnabled - Whether all recordings should be stored in an encrypted form
    * @property encryptionKeySid - The SID of the Public Key resource to use for encryption
    * @property friendlyName - A string to describe the resource
    */
  trait RecordingSettingsInstanceCreateOptions extends StObject {
    
    var awsCredentialsSid: js.UndefOr[String] = js.undefined
    
    var awsS3Url: js.UndefOr[String] = js.undefined
    
    var awsStorageEnabled: js.UndefOr[Boolean] = js.undefined
    
    var encryptionEnabled: js.UndefOr[Boolean] = js.undefined
    
    var encryptionKeySid: js.UndefOr[String] = js.undefined
    
    var friendlyName: String
  }
  object RecordingSettingsInstanceCreateOptions {
    
    inline def apply(friendlyName: String): RecordingSettingsInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingSettingsInstanceCreateOptions]
    }
    
    extension [Self <: RecordingSettingsInstanceCreateOptions](x: Self) {
      
      inline def setAwsCredentialsSid(value: String): Self = StObject.set(x, "awsCredentialsSid", value.asInstanceOf[js.Any])
      
      inline def setAwsCredentialsSidUndefined: Self = StObject.set(x, "awsCredentialsSid", js.undefined)
      
      inline def setAwsS3Url(value: String): Self = StObject.set(x, "awsS3Url", value.asInstanceOf[js.Any])
      
      inline def setAwsS3UrlUndefined: Self = StObject.set(x, "awsS3Url", js.undefined)
      
      inline def setAwsStorageEnabled(value: Boolean): Self = StObject.set(x, "awsStorageEnabled", value.asInstanceOf[js.Any])
      
      inline def setAwsStorageEnabledUndefined: Self = StObject.set(x, "awsStorageEnabled", js.undefined)
      
      inline def setEncryptionEnabled(value: Boolean): Self = StObject.set(x, "encryptionEnabled", value.asInstanceOf[js.Any])
      
      inline def setEncryptionEnabledUndefined: Self = StObject.set(x, "encryptionEnabled", js.undefined)
      
      inline def setEncryptionKeySid(value: String): Self = StObject.set(x, "encryptionKeySid", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeySidUndefined: Self = StObject.set(x, "encryptionKeySid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecordingSettingsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RecordingSettingsContext = js.native
    
    /**
      * Constructs a recording_settings
      */
    def get(): RecordingSettingsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait RecordingSettingsPayload
    extends StObject
       with RecordingSettingsResource
       with TwilioResponsePayload
  object RecordingSettingsPayload {
    
    inline def apply(
      account_sid: String,
      aws_credentials_sid: String,
      aws_s3_url: String,
      aws_storage_enabled: Boolean,
      encryption_enabled: Boolean,
      encryption_key_sid: String,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): RecordingSettingsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], aws_credentials_sid = aws_credentials_sid.asInstanceOf[js.Any], aws_s3_url = aws_s3_url.asInstanceOf[js.Any], aws_storage_enabled = aws_storage_enabled.asInstanceOf[js.Any], encryption_enabled = encryption_enabled.asInstanceOf[js.Any], encryption_key_sid = encryption_key_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingSettingsPayload]
    }
  }
  
  trait RecordingSettingsResource extends StObject {
    
    var account_sid: String
    
    var aws_credentials_sid: String
    
    var aws_s3_url: String
    
    var aws_storage_enabled: Boolean
    
    var encryption_enabled: Boolean
    
    var encryption_key_sid: String
    
    var friendly_name: String
    
    var url: String
  }
  object RecordingSettingsResource {
    
    inline def apply(
      account_sid: String,
      aws_credentials_sid: String,
      aws_s3_url: String,
      aws_storage_enabled: Boolean,
      encryption_enabled: Boolean,
      encryption_key_sid: String,
      friendly_name: String,
      url: String
    ): RecordingSettingsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], aws_credentials_sid = aws_credentials_sid.asInstanceOf[js.Any], aws_s3_url = aws_s3_url.asInstanceOf[js.Any], aws_storage_enabled = aws_storage_enabled.asInstanceOf[js.Any], encryption_enabled = encryption_enabled.asInstanceOf[js.Any], encryption_key_sid = encryption_key_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingSettingsResource]
    }
    
    extension [Self <: RecordingSettingsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAws_credentials_sid(value: String): Self = StObject.set(x, "aws_credentials_sid", value.asInstanceOf[js.Any])
      
      inline def setAws_s3_url(value: String): Self = StObject.set(x, "aws_s3_url", value.asInstanceOf[js.Any])
      
      inline def setAws_storage_enabled(value: Boolean): Self = StObject.set(x, "aws_storage_enabled", value.asInstanceOf[js.Any])
      
      inline def setEncryption_enabled(value: Boolean): Self = StObject.set(x, "encryption_enabled", value.asInstanceOf[js.Any])
      
      inline def setEncryption_key_sid(value: String): Self = StObject.set(x, "encryption_key_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordingSettingsSolution extends StObject
}
