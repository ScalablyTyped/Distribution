package typings.unfetch.mod

import typings.std.Blob
import typings.unfetch.anon.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnfetchResponse extends js.Object {
  
  def blob(): js.Promise[Blob] = js.native
  
  var headers: Entries = js.native
  
  def json(): js.Promise[_] = js.native
  
  var ok: Boolean = js.native
  
  var status: Double = js.native
  
  var statusText: String = js.native
  
  def text(): js.Promise[String] = js.native
  
  var url: String = js.native
}
object UnfetchResponse {
  
  @scala.inline
  def apply(
    blob: () => js.Promise[Blob],
    headers: Entries,
    json: () => js.Promise[_],
    ok: Boolean,
    status: Double,
    statusText: String,
    text: () => js.Promise[String],
    url: String
  ): UnfetchResponse = {
    val __obj = js.Dynamic.literal(blob = js.Any.fromFunction0(blob), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnfetchResponse]
  }
  
  @scala.inline
  implicit class UnfetchResponseOps[Self <: UnfetchResponse] (val x: Self) extends AnyVal {
    
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
    def setBlob(value: () => js.Promise[Blob]): Self = this.set("blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaders(value: Entries): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: () => js.Promise[_]): Self = this.set("json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = this.set("text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
