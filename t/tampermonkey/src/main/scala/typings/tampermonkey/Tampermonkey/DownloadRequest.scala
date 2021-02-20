package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Download Request
@js.native
trait DownloadRequest extends StObject {
  
  var headers: js.UndefOr[RequestHeaders] = js.native
  
  /**
    * Filename - for security reasons the file extension needs to be
    * whitelisted at Tampermonkey options page
    */
  var name: String = js.native
  
  /** Callback to be executed if this download ended up with an error */
  var onerror: js.UndefOr[RequestEventListener[DownloadErrorResponse]] = js.native
  
  /** Callback to be executed if this download finished */
  var onload: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Callback to be executed if this download failed due to a timeout */
  var onprogress: js.UndefOr[RequestEventListener[DownloadProgressResponse]] = js.native
  
  /** Callback to be executed if this download finished */
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Show 'Save As' dialog */
  var saveAs: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  /** URL from where the data should be downloaded */
  var url: String = js.native
}
object DownloadRequest {
  
  @scala.inline
  def apply(name: String, url: String): DownloadRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadRequest]
  }
  
  @scala.inline
  implicit class DownloadRequestMutableBuilder[Self <: DownloadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: RequestEventListener[DownloadErrorResponse]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setOnload(value: () => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    @scala.inline
    def setOnprogress(value: RequestEventListener[DownloadProgressResponse]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    
    @scala.inline
    def setOntimeout(value: () => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
    
    @scala.inline
    def setSaveAs(value: Boolean): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
