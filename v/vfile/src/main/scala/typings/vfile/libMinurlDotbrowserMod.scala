package typings.vfile

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMinurlDotbrowserMod {
  
  @JSImport("vfile/lib/minurl.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUrl(fileUrlOrPath: Any): /* is std.URL */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(fileUrlOrPath.asInstanceOf[js.Any]).asInstanceOf[/* is std.URL */ Boolean]
  
  inline def urlToPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def urlToPath(path: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
