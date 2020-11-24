package typings.videoJs.mod.videojs

import typings.std.XMLHttpRequest
import typings.videoJs.videoJsStrings.DELETE
import typings.videoJs.videoJsStrings.GET
import typings.videoJs.videoJsStrings.HEAD
import typings.videoJs.videoJsStrings.OPTIONS
import typings.videoJs.videoJsStrings.POST
import typings.videoJs.videoJsStrings.PUT
import typings.videoJs.videoJsStrings._empty
import typings.videoJs.videoJsStrings.arraybuffer
import typings.videoJs.videoJsStrings.blob
import typings.videoJs.videoJsStrings.document
import typings.videoJs.videoJsStrings.json
import typings.videoJs.videoJsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XhrOptions extends js.Object {
  
  var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ XMLHttpRequest, Unit]] = js.native
  
  var body: js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
  
  var method: js.UndefOr[DELETE | GET | HEAD | OPTIONS | POST | PUT] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[_empty | arraybuffer | blob | document | json | text] = js.native
  
  var sync: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var uri: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var useXDR: js.UndefOr[Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
  
  var xhr: js.UndefOr[XMLHttpRequest] = js.native
}
object XhrOptions {
  
  @scala.inline
  def apply(): XhrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XhrOptions]
  }
  
  @scala.inline
  implicit class XhrOptionsOps[Self <: XhrOptions] (val x: Self) extends AnyVal {
    
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
    def setBeforeSend(value: /* xhrObject */ XMLHttpRequest => Unit): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setMethod(value: DELETE | GET | HEAD | OPTIONS | POST | PUT): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setResponseType(value: _empty | arraybuffer | blob | document | json | text): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseXDR(value: Boolean): Self = this.set("useXDR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseXDR: Self = this.set("useXDR", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
    
    @scala.inline
    def setXhr(value: XMLHttpRequest): Self = this.set("xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
}
