package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesGetAuthorityMod {
  
  @JSImport("@wordpress/url/build-types/get-authority", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAuthority(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthority")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
}
