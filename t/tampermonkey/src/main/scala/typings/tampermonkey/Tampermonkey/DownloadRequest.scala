package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Download Request
@js.native
trait DownloadRequest extends js.Object {
  
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
  implicit class DownloadRequestOps[Self <: DownloadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setOnerror(value: RequestEventListener[DownloadErrorResponse]): Self = this.set("onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnload(value: () => Unit): Self = this.set("onload", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    
    @scala.inline
    def setOnprogress(value: RequestEventListener[DownloadProgressResponse]): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    
    @scala.inline
    def setOntimeout(value: () => Unit): Self = this.set("ontimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOntimeout: Self = this.set("ontimeout", js.undefined)
    
    @scala.inline
    def setSaveAs(value: Boolean): Self = this.set("saveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveAs: Self = this.set("saveAs", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
