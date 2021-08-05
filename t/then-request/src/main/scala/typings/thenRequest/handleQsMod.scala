package typings.thenRequest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handleQsMod {
  
  @JSImport("then-request/lib/handle-qs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String, query: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
}
