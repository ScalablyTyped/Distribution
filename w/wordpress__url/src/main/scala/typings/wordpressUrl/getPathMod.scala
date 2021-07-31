package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPathMod {
  
  @JSImport("@wordpress/url/build-types/get-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPath(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
}
