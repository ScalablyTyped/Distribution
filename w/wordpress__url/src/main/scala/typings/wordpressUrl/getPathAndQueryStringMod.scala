package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPathAndQueryStringMod {
  
  @JSImport("@wordpress/url/build-types/get-path-and-query-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPathAndQueryString(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathAndQueryString")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
