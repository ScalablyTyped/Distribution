package typings.wordpressUrl

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesBuildQueryStringMod {
  
  @JSImport("@wordpress/url/build-types/build-query-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildQueryString(data: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
