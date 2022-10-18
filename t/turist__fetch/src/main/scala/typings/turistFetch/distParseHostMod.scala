package typings.turistFetch

import typings.nodeFetch.mod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseHostMod {
  
  @JSImport("@turist/fetch/dist/parse-host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String, headers: Headers): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
