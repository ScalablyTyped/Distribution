package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeDecodeUriMod {
  
  @JSImport("@wordpress/url/build-types/safe-decode-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def safeDecodeURI(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeDecodeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
}
