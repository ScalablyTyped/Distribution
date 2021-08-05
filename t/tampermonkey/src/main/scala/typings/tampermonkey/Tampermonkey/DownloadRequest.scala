package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Download Request
trait DownloadRequest extends StObject {
  
  var headers: js.UndefOr[RequestHeaders] = js.undefined
  
  /**
    * Filename - for security reasons the file extension needs to be
    * whitelisted at Tampermonkey options page
    */
  var name: String
  
  /** Callback to be executed if this download ended up with an error */
  var onerror: js.UndefOr[RequestEventListener[DownloadErrorResponse]] = js.undefined
  
  /** Callback to be executed if this download finished */
  var onload: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Callback to be executed if this download failed due to a timeout */
  var onprogress: js.UndefOr[RequestEventListener[DownloadProgressResponse]] = js.undefined
  
  /** Callback to be executed if this download finished */
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Show 'Save As' dialog */
  var saveAs: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** URL from where the data should be downloaded */
  var url: String
}
object DownloadRequest {
  
  inline def apply(name: String, url: String): DownloadRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadRequest]
  }
  
  extension [Self <: DownloadRequest](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnerror(value: RequestEventListener[DownloadErrorResponse]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnload(value: () => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction0(value))
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    inline def setOnprogress(value: RequestEventListener[DownloadProgressResponse]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    
    inline def setOntimeout(value: () => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction0(value))
    
    inline def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
    
    inline def setSaveAs(value: Boolean): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
    
    inline def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
