package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StringDictionary
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudFile {
  
  trait CloudFile extends StObject {
    
    /** Contents of the file to be transferred. */
    var data: File
    
    /** An identifier for this file. */
    var id: Double
    
    /** Filename of the file to be transferred. */
    var name: String
  }
  object CloudFile {
    
    inline def apply(data: File, id: Double, name: String): CloudFile = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFile] (val x: Self) extends AnyVal {
      
      inline def setData(value: File): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudFileAccount extends StObject {
    
    /**
      * If true, the account is configured and ready to use. Only configured
      * accounts are offered to the user.
      */
    var configured: Boolean
    
    /** Unique identifier of the account. */
    var id: String
    
    /**
      * A page for configuring accounts, to be displayed in the preferences
      * UI.
      */
    var managementUrl: String
    
    /** A user-friendly name for this account. */
    var name: String
    
    /**
      * The amount of remaining space on the cloud provider, in bytes. Set to
      * `-1` if unsupported.
      */
    var spaceRemaining: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of space already used on the cloud provider, in bytes. Set
      * to `-1` if unsupported.
      */
    var spaceUsed: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum size in bytes for a single file to upload. Set to `-1` if
      * unlimited.
      */
    var uploadSizeLimit: js.UndefOr[Double] = js.undefined
  }
  object CloudFileAccount {
    
    inline def apply(configured: Boolean, id: String, managementUrl: String, name: String): CloudFileAccount = {
      val __obj = js.Dynamic.literal(configured = configured.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managementUrl = managementUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFileAccount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFileAccount] (val x: Self) extends AnyVal {
      
      inline def setConfigured(value: Boolean): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setManagementUrl(value: String): Self = StObject.set(x, "managementUrl", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpaceRemaining(value: Double): Self = StObject.set(x, "spaceRemaining", value.asInstanceOf[js.Any])
      
      inline def setSpaceRemainingUndefined: Self = StObject.set(x, "spaceRemaining", js.undefined)
      
      inline def setSpaceUsed(value: Double): Self = StObject.set(x, "spaceUsed", value.asInstanceOf[js.Any])
      
      inline def setSpaceUsedUndefined: Self = StObject.set(x, "spaceUsed", js.undefined)
      
      inline def setUploadSizeLimit(value: Double): Self = StObject.set(x, "uploadSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setUploadSizeLimitUndefined: Self = StObject.set(x, "uploadSizeLimit", js.undefined)
    }
  }
  
  trait CloudFileTemplateInfo extends StObject {
    
    /**
      * If set, the cloud file entry for this upload will include a hint, that
      * the link will only be available for a limited time.
      */
    var download_expiry_date: js.UndefOr[CloudFileTemplateInfoDownloadExpiryDate] = js.undefined
    
    /**
      * If set, the cloud file entry for this upload will include a hint, that
      * the file has a download limit.
      */
    var download_limit: js.UndefOr[Double] = js.undefined
    
    /**
      * If set to true, the cloud file entry for this upload will include a
      * hint, that the download link is password protected.
      */
    var download_password_protected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A URL pointing to an icon to represent the used cloud file service.
      * Defaults to the icon of the provider add-on.
      */
    var service_icon: js.UndefOr[String] = js.undefined
    
    /**
      * A name to represent the used cloud file service. Defaults to the
      * associated cloud file account name.
      */
    var service_name: js.UndefOr[String] = js.undefined
    
    /**
      * A URL pointing to a web page of the used cloud file service. Will be
      * used in a _Learn more about_ link in the footer of the cloud file
      * attachment element.
      */
    var service_url: js.UndefOr[String] = js.undefined
  }
  object CloudFileTemplateInfo {
    
    inline def apply(): CloudFileTemplateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloudFileTemplateInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFileTemplateInfo] (val x: Self) extends AnyVal {
      
      inline def setDownload_expiry_date(value: CloudFileTemplateInfoDownloadExpiryDate): Self = StObject.set(x, "download_expiry_date", value.asInstanceOf[js.Any])
      
      inline def setDownload_expiry_dateUndefined: Self = StObject.set(x, "download_expiry_date", js.undefined)
      
      inline def setDownload_limit(value: Double): Self = StObject.set(x, "download_limit", value.asInstanceOf[js.Any])
      
      inline def setDownload_limitUndefined: Self = StObject.set(x, "download_limit", js.undefined)
      
      inline def setDownload_password_protected(value: Boolean): Self = StObject.set(x, "download_password_protected", value.asInstanceOf[js.Any])
      
      inline def setDownload_password_protectedUndefined: Self = StObject.set(x, "download_password_protected", js.undefined)
      
      inline def setService_icon(value: String): Self = StObject.set(x, "service_icon", value.asInstanceOf[js.Any])
      
      inline def setService_iconUndefined: Self = StObject.set(x, "service_icon", js.undefined)
      
      inline def setService_name(value: String): Self = StObject.set(x, "service_name", value.asInstanceOf[js.Any])
      
      inline def setService_nameUndefined: Self = StObject.set(x, "service_name", js.undefined)
      
      inline def setService_url(value: String): Self = StObject.set(x, "service_url", value.asInstanceOf[js.Any])
      
      inline def setService_urlUndefined: Self = StObject.set(x, "service_url", js.undefined)
    }
  }
  
  trait CloudFileTemplateInfoDownloadExpiryDate extends StObject {
    
    /**
      * A format options object as used by {@link DateTimeFormat}. Defaults
      * to:
      * [defaultDateFormat.js](https://raw.githubusercontent.com/thundernest/webext-docs/latest-mv2/includes/cloudFile/defaultDateFormat.js)
      */
    var format: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    /**
      * The expiry date of the link as the number of milliseconds since the
      * UNIX epoch.
      */
    var timestamp: Double
  }
  object CloudFileTemplateInfoDownloadExpiryDate {
    
    inline def apply(timestamp: Double): CloudFileTemplateInfoDownloadExpiryDate = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFileTemplateInfoDownloadExpiryDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFileTemplateInfoDownloadExpiryDate] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: StringDictionary[Boolean]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait RelatedCloudFile extends StObject {
    
    /** The content of the new upload differs from the related file. */
    var dataChanged: Boolean
    
    /**
      * The identifier for the related file. In some circumstances, the id is
      * unavailable.
      */
    var id: js.UndefOr[Double] = js.undefined
    
    /** Filename of the related file. */
    var name: String
    
    /**
      * Additional information of the related file, used in the cloud file
      * entry added to the message.
      */
    var templateInfo: js.UndefOr[CloudFileTemplateInfo] = js.undefined
    
    /** The URL where the upload of the related file can be accessed. */
    var url: js.UndefOr[String] = js.undefined
  }
  object RelatedCloudFile {
    
    inline def apply(dataChanged: Boolean, name: String): RelatedCloudFile = {
      val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelatedCloudFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelatedCloudFile] (val x: Self) extends AnyVal {
      
      inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTemplateInfo(value: CloudFileTemplateInfo): Self = StObject.set(x, "templateInfo", value.asInstanceOf[js.Any])
      
      inline def setTemplateInfoUndefined: Self = StObject.set(x, "templateInfo", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait UpdateAccountUpdateProperties extends StObject {
    
    /**
      * If true, the account is configured and ready to use. Only configured
      * accounts are offered to the user.
      */
    var configured: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A page for configuring accounts, to be displayed in the preferences
      * UI.
      */
    var managementUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The amount of remaining space on the cloud provider, in bytes. Set to
      * `-1` if unsupported.
      */
    var spaceRemaining: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of space already used on the cloud provider, in bytes. Set
      * to `-1` if unsupported.
      */
    var spaceUsed: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum size in bytes for a single file to upload. Set to `-1` if
      * unlimited.
      */
    var uploadSizeLimit: js.UndefOr[Double] = js.undefined
  }
  object UpdateAccountUpdateProperties {
    
    inline def apply(): UpdateAccountUpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAccountUpdateProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateAccountUpdateProperties] (val x: Self) extends AnyVal {
      
      inline def setConfigured(value: Boolean): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
      
      inline def setConfiguredUndefined: Self = StObject.set(x, "configured", js.undefined)
      
      inline def setManagementUrl(value: String): Self = StObject.set(x, "managementUrl", value.asInstanceOf[js.Any])
      
      inline def setManagementUrlUndefined: Self = StObject.set(x, "managementUrl", js.undefined)
      
      inline def setSpaceRemaining(value: Double): Self = StObject.set(x, "spaceRemaining", value.asInstanceOf[js.Any])
      
      inline def setSpaceRemainingUndefined: Self = StObject.set(x, "spaceRemaining", js.undefined)
      
      inline def setSpaceUsed(value: Double): Self = StObject.set(x, "spaceUsed", value.asInstanceOf[js.Any])
      
      inline def setSpaceUsedUndefined: Self = StObject.set(x, "spaceUsed", js.undefined)
      
      inline def setUploadSizeLimit(value: Double): Self = StObject.set(x, "uploadSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setUploadSizeLimitUndefined: Self = StObject.set(x, "uploadSizeLimit", js.undefined)
    }
  }
}
