package typings.tinyJsonHttp

import org.scalablytyped.runtime.Shortcut
import typings.tinyJsonHttp.mod.TinyJsonHttp.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tiny-json-http", JSImport.Namespace)
  @js.native
  val ^ : Api = js.native
  
  object TinyJsonHttp {
    
    @js.native
    trait Api extends StObject {
      
      def del(options: Options): js.Promise[Result] = js.native
      def del(options: Options, callback: Callback): Unit = js.native
      
      def get(options: Options): js.Promise[Result] = js.native
      def get(options: Options, callback: Callback): Unit = js.native
      
      def head(options: Options): js.Promise[Result] = js.native
      def head(options: Options, callback: Callback): Unit = js.native
      
      def options(options: Options): js.Promise[Result] = js.native
      def options(options: Options, callback: Callback): Unit = js.native
      
      def patch(options: Options): js.Promise[Result] = js.native
      def patch(options: Options, callback: Callback): Unit = js.native
      
      def post(options: Options): js.Promise[Result] = js.native
      def post(options: Options, callback: Callback): Unit = js.native
      
      def put(options: Options): js.Promise[Result] = js.native
      def put(options: Options, callback: Callback): Unit = js.native
    }
    
    type Callback = js.Function2[/* err */ js.Error | Null, /* res */ js.UndefOr[Result], Unit]
    
    trait Options extends StObject {
      
      /**
        * Set to true the response body is returned as a buffer
        */
      var buffer: js.UndefOr[Boolean] = js.undefined
      
      var data: js.UndefOr[Any] = js.undefined
      
      var headers: js.UndefOr[Any] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
      
      var url: String
    }
    object Options {
      
      inline def apply(url: String): Options = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
        
        inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait Result extends StObject {
      
      var body: Any
      
      var headers: Any
    }
    object Result {
      
      inline def apply(body: Any, headers: Any): Result = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
        __obj.asInstanceOf[Result]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
        
        inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type _To = Api
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Api = ^
}
