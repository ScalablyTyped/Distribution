package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isUrlNativeMod {
  
  @JSImport("@wordpress/url/build-types/is-url.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isURL(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
