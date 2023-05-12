package typings.tufJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUrlMod {
  
  @JSImport("tuf-js/dist/utils/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def join(base: String, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(base.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
}
