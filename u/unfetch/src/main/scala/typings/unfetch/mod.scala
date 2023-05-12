package typings.unfetch

import org.scalablytyped.runtime.Shortcut
import typings.std.Blob
import typings.std.Record
import typings.std.URL
import typings.unfetch.unfetchStrings.include
import typings.unfetch.unfetchStrings.omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("unfetch", JSImport.Default)
  @js.native
  val default: Unfetch = js.native
  
  object Unfetch {
    
    type Body = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Body */ Any
    
    type Headers = UnfetchHeaders | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any)
    
    type IsomorphicBody = Body | typings.nodeFetch.mod.Body
    
    type IsomorphicHeaders = Headers | typings.nodeFetch.mod.Headers
    
    type IsomorphicRequest = Request | typings.nodeFetch.mod.Request
    
    type IsomorphicRequestInit = RequestInit | typings.nodeFetch.mod.RequestInit
    
    type IsomorphicResponse = Response | typings.nodeFetch.mod.Response
    
    type Request = UnfetchRequestInit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request */ Any)
    
    type RequestInit = UnfetchRequestInit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.RequestInit */ Any)
    
    type Response = UnfetchResponse | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response */ Any)
  }
  type Unfetch = js.Function2[
    /* url */ String | URL, 
    /* options */ js.UndefOr[UnfetchRequestInit], 
    js.Promise[UnfetchResponse]
  ]
  
  @js.native
  trait UnfetchHeaders extends StObject {
    
    def entries(): js.Array[js.Tuple2[String, String]] = js.native
    
    def get(key: String): String | Null = js.native
    
    def has(key: String): Boolean = js.native
    
    /** @deprecated not supported by unfetch */
    @JSName(js.Symbol.iterator)
    var iterator: scala.Nothing = js.native
    
    def keys(): js.Array[String] = js.native
  }
  
  trait UnfetchRequestInit extends StObject {
    
    var body: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<unfetch.anon.FnCall>[0] */ js.Any
      ] = js.undefined
    
    /** @deprecated not supported by unfetch */
    var cache: js.UndefOr[scala.Nothing] = js.undefined
    
    var credentials: js.UndefOr[include | omit] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /** @deprecated not supported by unfetch */
    var integrity: js.UndefOr[scala.Nothing] = js.undefined
    
    /** @deprecated not supported by unfetch */
    var keepalive: js.UndefOr[scala.Nothing] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    /** @deprecated not supported by unfetch */
    var mode: js.UndefOr[scala.Nothing] = js.undefined
    
    /** @deprecated not supported by unfetch */
    var redirect: js.UndefOr[scala.Nothing] = js.undefined
    
    /** @deprecated not supported by unfetch */
    var referrer: js.UndefOr[scala.Nothing] = js.undefined
    
    /** @deprecated not supported by unfetch */
    var referrerPolicy: js.UndefOr[scala.Nothing] = js.undefined
    
    /** @deprecated not supported by unfetch */
    var signal: js.UndefOr[scala.Nothing] = js.undefined
    
    /** @deprecated not supported by unfetch */
    var window: js.UndefOr[scala.Nothing] = js.undefined
  }
  object UnfetchRequestInit {
    
    inline def apply(): UnfetchRequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnfetchRequestInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnfetchRequestInit] (val x: Self) extends AnyVal {
      
      inline def setBody(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<unfetch.anon.FnCall>[0] */ js.Any
      ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCredentials(value: include | omit): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  trait UnfetchResponse extends StObject {
    
    def blob(): js.Promise[Blob]
    
    var headers: UnfetchHeaders
    
    def json(): js.Promise[Any]
    
    var ok: Boolean
    
    var status: Double
    
    var statusText: String
    
    def text(): js.Promise[String]
    
    var url: String
  }
  object UnfetchResponse {
    
    inline def apply(
      blob: () => js.Promise[Blob],
      headers: UnfetchHeaders,
      json: () => js.Promise[Any],
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
    implicit open class MutableBuilder[Self <: UnfetchResponse] (val x: Self) extends AnyVal {
      
      inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setHeaders(value: UnfetchHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Unfetch
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Unfetch = default
}
