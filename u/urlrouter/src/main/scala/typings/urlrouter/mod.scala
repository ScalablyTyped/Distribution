package typings.urlrouter

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(handler: js.Function1[/* app */ App, Unit]): HttpHandler = ^.asInstanceOf[js.Dynamic].apply(handler.asInstanceOf[js.Any]).asInstanceOf[HttpHandler]
  
  @JSImport("urlrouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UrlRouterfunc(handler: js.Function1[/* app */ App, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_UrlRouterfunc")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def UrlRouterfunc(handler: js.Function1[/* app */ App, Unit], options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_UrlRouterfunc")(handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait App extends StObject {
    
    def all(urlpattern: String, handler: HttpHandler): Unit
    
    def checkout(urlpattern: String, handler: HttpHandler): Unit
    
    def copy(urlpattern: String, handler: HttpHandler): Unit
    
    def delete(urlpattern: String, handler: HttpHandler): Unit
    
    // https://github.com/visionmedia/node-methods/blob/master/index.js
    def get(urlpattern: String, handler: HttpHandler): Unit
    
    def head(urlpattern: String, handler: HttpHandler): Unit
    
    def lock(urlpattern: String, handler: HttpHandler): Unit
    
    def `m-search`(urlpattern: String, handler: HttpHandler): Unit
    
    def merge(urlpattern: String, handler: HttpHandler): Unit
    
    def mkactivity(urlpattern: String, handler: HttpHandler): Unit
    
    def mkcol(urlpattern: String, handler: HttpHandler): Unit
    
    def move(urlpattern: String, handler: HttpHandler): Unit
    
    def notify(urlpattern: String, handler: HttpHandler): Unit
    
    def options(urlpattern: String, handler: HttpHandler): Unit
    
    def patch(urlpattern: String, handler: HttpHandler): Unit
    
    def post(urlpattern: String, handler: HttpHandler): Unit
    
    def propfind(urlpattern: String, handler: HttpHandler): Unit
    
    def proppatch(urlpattern: String, handler: HttpHandler): Unit
    
    def put(urlpattern: String, handler: HttpHandler): Unit
    
    def redirect(urlpattern: String, to: String): Unit
    
    def report(urlpattern: String, handler: HttpHandler): Unit
    
    def search(urlpattern: String, handler: HttpHandler): Unit
    
    def subscribe(urlpattern: String, handler: HttpHandler): Unit
    
    def trace(urlpattern: String, handler: HttpHandler): Unit
    
    def unlock(urlpattern: String, handler: HttpHandler): Unit
    
    def unsubscribe(urlpattern: String, handler: HttpHandler): Unit
  }
  object App {
    
    inline def apply(
      all: (String, HttpHandler) => Unit,
      checkout: (String, HttpHandler) => Unit,
      copy: (String, HttpHandler) => Unit,
      delete: (String, HttpHandler) => Unit,
      get: (String, HttpHandler) => Unit,
      head: (String, HttpHandler) => Unit,
      lock: (String, HttpHandler) => Unit,
      `m-search`: (String, HttpHandler) => Unit,
      merge: (String, HttpHandler) => Unit,
      mkactivity: (String, HttpHandler) => Unit,
      mkcol: (String, HttpHandler) => Unit,
      move: (String, HttpHandler) => Unit,
      notify_ : (String, HttpHandler) => Unit,
      options: (String, HttpHandler) => Unit,
      patch: (String, HttpHandler) => Unit,
      post: (String, HttpHandler) => Unit,
      propfind: (String, HttpHandler) => Unit,
      proppatch: (String, HttpHandler) => Unit,
      put: (String, HttpHandler) => Unit,
      redirect: (String, String) => Unit,
      report: (String, HttpHandler) => Unit,
      search: (String, HttpHandler) => Unit,
      subscribe: (String, HttpHandler) => Unit,
      trace: (String, HttpHandler) => Unit,
      unlock: (String, HttpHandler) => Unit,
      unsubscribe: (String, HttpHandler) => Unit
    ): App = {
      val __obj = js.Dynamic.literal(all = js.Any.fromFunction2(all), checkout = js.Any.fromFunction2(checkout), copy = js.Any.fromFunction2(copy), delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), head = js.Any.fromFunction2(head), lock = js.Any.fromFunction2(lock), merge = js.Any.fromFunction2(merge), mkactivity = js.Any.fromFunction2(mkactivity), mkcol = js.Any.fromFunction2(mkcol), move = js.Any.fromFunction2(move), options = js.Any.fromFunction2(options), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), propfind = js.Any.fromFunction2(propfind), proppatch = js.Any.fromFunction2(proppatch), put = js.Any.fromFunction2(put), redirect = js.Any.fromFunction2(redirect), report = js.Any.fromFunction2(report), search = js.Any.fromFunction2(search), subscribe = js.Any.fromFunction2(subscribe), trace = js.Any.fromFunction2(trace), unlock = js.Any.fromFunction2(unlock), unsubscribe = js.Any.fromFunction2(unsubscribe))
      __obj.updateDynamic("m-search")(js.Any.fromFunction2(`m-search`))
      __obj.updateDynamic("notify")(js.Any.fromFunction2(notify_))
      __obj.asInstanceOf[App]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      inline def setAll(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "all", js.Any.fromFunction2(value))
      
      inline def setCheckout(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "checkout", js.Any.fromFunction2(value))
      
      inline def setCopy(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      inline def setDelete(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      inline def setGet(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setHead(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "head", js.Any.fromFunction2(value))
      
      inline def setLock(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "lock", js.Any.fromFunction2(value))
      
      inline def `setM-search`(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "m-search", js.Any.fromFunction2(value))
      
      inline def setMerge(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
      
      inline def setMkactivity(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "mkactivity", js.Any.fromFunction2(value))
      
      inline def setMkcol(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "mkcol", js.Any.fromFunction2(value))
      
      inline def setMove(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
      
      inline def setNotify_(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "notify", js.Any.fromFunction2(value))
      
      inline def setOptions(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "options", js.Any.fromFunction2(value))
      
      inline def setPatch(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
      
      inline def setPost(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
      
      inline def setPropfind(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "propfind", js.Any.fromFunction2(value))
      
      inline def setProppatch(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "proppatch", js.Any.fromFunction2(value))
      
      inline def setPut(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
      
      inline def setRedirect(value: (String, String) => Unit): Self = StObject.set(x, "redirect", js.Any.fromFunction2(value))
      
      inline def setReport(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "report", js.Any.fromFunction2(value))
      
      inline def setSearch(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
      
      inline def setSubscribe(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      inline def setTrace(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction2(value))
      
      inline def setUnlock(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction2(value))
      
      inline def setUnsubscribe(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    }
  }
  
  type HttpHandler = js.Function3[
    /* req */ ServerRequest, 
    /* res */ ServerResponse, 
    /* next */ js.UndefOr[js.Function0[Unit]], 
    Unit
  ]
  
  trait Options extends StObject {
    
    var errorHandler: js.UndefOr[
        js.Function3[/* err */ js.Error, /* req */ ServerRequest, /* res */ ServerResponse, Unit]
      ] = js.undefined
    
    var pageNotFound: js.UndefOr[js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, Unit]] = js.undefined
    
    var paramsName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setErrorHandler(value: (/* err */ js.Error, /* req */ ServerRequest, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction3(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setPageNotFound(value: (/* req */ ServerRequest, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "pageNotFound", js.Any.fromFunction2(value))
      
      inline def setPageNotFoundUndefined: Self = StObject.set(x, "pageNotFound", js.undefined)
      
      inline def setParamsName(value: String): Self = StObject.set(x, "paramsName", value.asInstanceOf[js.Any])
      
      inline def setParamsNameUndefined: Self = StObject.set(x, "paramsName", js.undefined)
    }
  }
  
  @js.native
  trait ServerRequest extends IncomingMessage {
    
    var params: Any = js.native
  }
  
  type ServerResponse = typings.node.httpMod.ServerResponse[IncomingMessage]
}
