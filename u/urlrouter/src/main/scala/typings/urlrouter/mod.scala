package typings.urlrouter

import typings.node.httpMod.IncomingMessage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urlrouter", JSImport.Namespace)
  @js.native
  def apply(handler: js.Function1[/* app */ App, Unit]): HttpHandler = js.native
  
  @JSImport("urlrouter", "_UrlRouterfunc")
  @js.native
  def UrlRouterfunc(handler: js.Function1[/* app */ App, Unit]): Unit = js.native
  @JSImport("urlrouter", "_UrlRouterfunc")
  @js.native
  def UrlRouterfunc(handler: js.Function1[/* app */ App, Unit], options: js.Any): Unit = js.native
  
  @js.native
  trait App extends StObject {
    
    def all(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def checkout(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def copy(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def delete(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    // https://github.com/visionmedia/node-methods/blob/master/index.js
    def get(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def head(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def lock(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def `m-search`(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def merge(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def mkactivity(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def mkcol(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def move(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def notify(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def options(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def patch(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def post(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def propfind(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def proppatch(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def put(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def redirect(urlpattern: String, to: String): Unit = js.native
    
    def report(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def search(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def subscribe(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def trace(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def unlock(urlpattern: String, handler: HttpHandler): Unit = js.native
    
    def unsubscribe(urlpattern: String, handler: HttpHandler): Unit = js.native
  }
  object App {
    
    @scala.inline
    def apply(
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
    implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "all", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCheckout(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "checkout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCopy(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDelete(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGet(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHead(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "head", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLock(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "lock", js.Any.fromFunction2(value))
      
      @scala.inline
      def `setM-search`(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "m-search", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMerge(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMkactivity(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "mkactivity", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMkcol(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "mkcol", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMove(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotify_(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "notify", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptions(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "options", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPatch(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPost(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropfind(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "propfind", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProppatch(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "proppatch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPut(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRedirect(value: (String, String) => Unit): Self = StObject.set(x, "redirect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReport(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "report", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSearch(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubscribe(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTrace(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnlock(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnsubscribe(value: (String, HttpHandler) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    }
  }
  
  type HttpHandler = js.Function3[
    /* req */ ServerRequest, 
    /* res */ ServerResponse, 
    /* next */ js.UndefOr[js.Function0[Unit]], 
    Unit
  ]
  
  @js.native
  trait Options extends StObject {
    
    var errorHandler: js.UndefOr[
        js.Function3[/* err */ Error, /* req */ ServerRequest, /* res */ ServerResponse, Unit]
      ] = js.native
    
    var pageNotFound: js.UndefOr[js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, Unit]] = js.native
    
    var paramsName: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorHandler(value: (/* err */ Error, /* req */ ServerRequest, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setPageNotFound(value: (/* req */ ServerRequest, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "pageNotFound", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPageNotFoundUndefined: Self = StObject.set(x, "pageNotFound", js.undefined)
      
      @scala.inline
      def setParamsName(value: String): Self = StObject.set(x, "paramsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsNameUndefined: Self = StObject.set(x, "paramsName", js.undefined)
    }
  }
  
  @js.native
  trait ServerRequest extends IncomingMessage {
    
    var params: js.Any = js.native
  }
  
  type ServerResponse = typings.node.httpMod.ServerResponse
}
