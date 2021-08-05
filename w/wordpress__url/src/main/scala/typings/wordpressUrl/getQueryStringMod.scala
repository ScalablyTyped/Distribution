package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueryStringMod {
  
  @JSImport("@wordpress/url/build-types/get-query-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQueryString(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryString")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
}
