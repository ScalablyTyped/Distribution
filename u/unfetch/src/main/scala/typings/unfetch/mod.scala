package typings.unfetch

import org.scalablytyped.runtime.Shortcut
import typings.std.Blob
import typings.std.Headers
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import typings.unfetch.anon.Body
import typings.unfetch.anon.Entries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("unfetch", JSImport.Default)
    @js.native
    val ^ : Unfetch_ = js.native
    
    type _To = Unfetch_
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Unfetch_ = ^
  }
  
  trait UnfetchResponse extends StObject {
    
    def blob(): js.Promise[Blob]
    
    var headers: Entries
    
    def json(): js.Promise[js.Any]
    
    var ok: Boolean
    
    var status: Double
    
    var statusText: String
    
    def text(): js.Promise[String]
    
    var url: String
  }
  object UnfetchResponse {
    
    inline def apply(
      blob: () => js.Promise[Blob],
      headers: Entries,
      json: () => js.Promise[js.Any],
      ok: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      url: String
    ): UnfetchResponse = {
      val __obj = js.Dynamic.literal(blob = js.Any.fromFunction0(blob), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnfetchResponse]
    }
    
    extension [Self <: UnfetchResponse](x: Self) {
      
      inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setHeaders(value: Entries): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: () => js.Promise[js.Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Unfetch_ = js.Function2[/* url */ String, /* options */ js.UndefOr[Body], js.Promise[UnfetchResponse]]
  
  object unfetch {
    
    type IsomorphicBody = typings.std.Body | typings.nodeFetch.mod.Body
    
    type IsomorphicHeaders = Headers | typings.nodeFetch.mod.Headers
    
    type IsomorphicRequest = Request | typings.nodeFetch.mod.Request
    
    type IsomorphicRequestInit = RequestInit | typings.nodeFetch.mod.RequestInit
    
    type IsomorphicResponse = Response | typings.nodeFetch.mod.Response
  }
}
