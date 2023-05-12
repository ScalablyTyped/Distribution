package typings.tufJs

import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFetcherMod {
  
  /* note: abstract class */ @JSImport("tuf-js/dist/fetcher", "BaseFetcher")
  @js.native
  open class BaseFetcher ()
    extends StObject
       with Fetcher {
    
    /* CompleteClass */
    override def downloadBytes(url: String, maxLength: Double): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def downloadFile[T](url: String, maxLength: Double, handler: DownloadFileHandler[T]): js.Promise[T] = js.native
    
    def fetch(url: String): js.Promise[ReadableStream] = js.native
  }
  
  @JSImport("tuf-js/dist/fetcher", "DefaultFetcher")
  @js.native
  open class DefaultFetcher () extends BaseFetcher {
    def this(options: FetcherOptions) = this()
    
    /* private */ var retries: Any = js.native
    
    /* private */ var timeout: Any = js.native
  }
  
  type DownloadFileHandler[T] = js.Function1[/* file */ String, js.Promise[T]]
  
  trait Fetcher extends StObject {
    
    def downloadBytes(url: String, maxLength: Double): js.Promise[Buffer]
    
    def downloadFile[T](url: String, maxLength: Double, handler: DownloadFileHandler[T]): js.Promise[T]
  }
  object Fetcher {
    
    inline def apply(
      downloadBytes: (String, Double) => js.Promise[Buffer],
      downloadFile: (String, Double, DownloadFileHandler[Any]) => js.Promise[Any]
    ): Fetcher = {
      val __obj = js.Dynamic.literal(downloadBytes = js.Any.fromFunction2(downloadBytes), downloadFile = js.Any.fromFunction3(downloadFile))
      __obj.asInstanceOf[Fetcher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fetcher] (val x: Self) extends AnyVal {
      
      inline def setDownloadBytes(value: (String, Double) => js.Promise[Buffer]): Self = StObject.set(x, "downloadBytes", js.Any.fromFunction2(value))
      
      inline def setDownloadFile(value: (String, Double, DownloadFileHandler[Any]) => js.Promise[Any]): Self = StObject.set(x, "downloadFile", js.Any.fromFunction3(value))
    }
  }
  
  trait FetcherOptions extends StObject {
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FetcherOptions {
    
    inline def apply(): FetcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetcherOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetcherOptions] (val x: Self) extends AnyVal {
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
