package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.browser.cloudFile.CloudFileTemplateInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateInfo extends StObject {
  
  /**
    * Set this to `true` if the file upload was aborted by the user and an
    * {@link cloudFile.onFileUploadAbort} event has been received. No error
    * message will be shown to the user.
    */
  var aborted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Report an error to the user. Set this to `true` for showing a generic
    * error message, or set a specific error message.
    */
  var error: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * Additional file information used in the cloud file entry added to the
    * message.
    */
  var templateInfo: js.UndefOr[CloudFileTemplateInfo] = js.undefined
  
  /** The URL where the uploaded file can be accessed. */
  var url: js.UndefOr[String] = js.undefined
}
object TemplateInfo {
  
  inline def apply(): TemplateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateInfo] (val x: Self) extends AnyVal {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setAbortedUndefined: Self = StObject.set(x, "aborted", js.undefined)
    
    inline def setError(value: Boolean | String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setTemplateInfo(value: CloudFileTemplateInfo): Self = StObject.set(x, "templateInfo", value.asInstanceOf[js.Any])
    
    inline def setTemplateInfoUndefined: Self = StObject.set(x, "templateInfo", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
