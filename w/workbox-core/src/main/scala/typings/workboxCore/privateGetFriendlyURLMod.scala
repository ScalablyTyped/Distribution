package typings.workboxCore

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateGetFriendlyURLMod {
  
  @JSImport("workbox-core/_private/getFriendlyURL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFriendlyURL(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFriendlyURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getFriendlyURL(url: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFriendlyURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
