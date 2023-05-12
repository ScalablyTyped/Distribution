package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestCloudFile extends StObject {
  
  /**
    * Enable browser styles in the `management_url` page. See the MDN
    * documentation on browser styles for more information.
    */
  var browser_style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property is no longer used. The only supported data format for
    * the `data` argument in {@link cloudFile.onFileUpload} is {@link File}.
    *
    * @deprecated This property is no longer used. The only supported data
    * format for the `data` argument in {@link cloudFile.onFileUpload} is
    * {@link File}.
    */
  var data_format: js.UndefOr[String] = js.undefined
  
  /**
    * A page for configuring accounts, to be displayed in the preferences
    * UI. **Note:** Within this UI only a limited subset of the WebExtension
    * APIs is available: `cloudFile`, `extension`, `i18n`, `runtime`,
    * `storage`, `test`.
    */
  var management_url: String
  
  /** Name of the cloud file service. */
  var name: String
  
  /**
    * This property was never used.
    *
    * @deprecated This property was never used.
    */
  var new_account_url: js.UndefOr[String] = js.undefined
  
  /**
    * If a previously uploaded cloud file attachment is reused at a later
    * time in a different message, Thunderbird may use the already known
    * `url` and `templateInfo` values without triggering the registered
    * {@link cloudFile.onFileUpload} listener again. Setting this option to
    * `false` will always trigger the registered listener, providing the
    * already known values through the `relatedFileInfo` parameter of the
    * {@link cloudFile.onFileUpload} event, to let the provider decide how
    * to handle these cases.
    */
  var reuse_uploads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property is no longer used. The `service_url` property of the
    * {@link cloudFile.CloudFileTemplateInfo} object returned by the {@link cloudFile.onFileUpload}
    * event can be used to add a _Learn more about_
    * link to the footer of the cloud file attachment element.
    *
    * @deprecated This property is no longer used. The `service_url`
    * property of the {@link cloudFile.CloudFileTemplateInfo} object
    * returned by the {@link cloudFile.onFileUpload} event can be used to
    * add a _Learn more about_ link to the footer of the cloud file
    * attachment element.
    */
  var service_url: js.UndefOr[String] = js.undefined
}
object WebExtensionManifestCloudFile {
  
  inline def apply(management_url: String, name: String): WebExtensionManifestCloudFile = {
    val __obj = js.Dynamic.literal(management_url = management_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestCloudFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestCloudFile] (val x: Self) extends AnyVal {
    
    inline def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    inline def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    inline def setData_format(value: String): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
    
    inline def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
    
    inline def setManagement_url(value: String): Self = StObject.set(x, "management_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNew_account_url(value: String): Self = StObject.set(x, "new_account_url", value.asInstanceOf[js.Any])
    
    inline def setNew_account_urlUndefined: Self = StObject.set(x, "new_account_url", js.undefined)
    
    inline def setReuse_uploads(value: Boolean): Self = StObject.set(x, "reuse_uploads", value.asInstanceOf[js.Any])
    
    inline def setReuse_uploadsUndefined: Self = StObject.set(x, "reuse_uploads", js.undefined)
    
    inline def setService_url(value: String): Self = StObject.set(x, "service_url", value.asInstanceOf[js.Any])
    
    inline def setService_urlUndefined: Self = StObject.set(x, "service_url", js.undefined)
  }
}
