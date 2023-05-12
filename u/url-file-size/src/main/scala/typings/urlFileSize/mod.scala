package typings.urlFileSize

import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get file size from URL (in bytes) without downloading it.
    * @param url URL to get file size from
    * @param timeout [timeout=10000] Timeout in milliseconds
    * @param maxRedirects [maxRedirects=5] Maximum number of redirects to follow
    * @returns File size in bytes
    */
  inline def apply(url: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def apply(url: String, timeout: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def apply(url: String, timeout: Double, maxRedirects: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], maxRedirects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def apply(url: String, timeout: Unit, maxRedirects: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], maxRedirects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def apply(url: URL_): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def apply(url: URL_, timeout: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def apply(url: URL_, timeout: Double, maxRedirects: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], maxRedirects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def apply(url: URL_, timeout: Unit, maxRedirects: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], maxRedirects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @JSImport("url-file-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
