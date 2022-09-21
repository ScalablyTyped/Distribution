package typings.vfile

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minurlBrowserMod {
  
  @JSImport("vfile/lib/minurl.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUrl(fileURLOrPath: Any): /* is vfile.vfile/lib/minurl.shared.URL */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(fileURLOrPath.asInstanceOf[js.Any]).asInstanceOf[/* is vfile.vfile/lib/minurl.shared.URL */ Boolean]
  
  inline def urlToPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def urlToPath(path: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
