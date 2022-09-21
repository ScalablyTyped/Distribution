package typings.urlMatchPatterns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-match-patterns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pattern: String): js.Function1[/* url */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* url */ String, Boolean]]
  inline def default(pattern: String, url: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
