package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesFilterUrlForDisplayMod {
  
  @JSImport("@wordpress/url/build-types/filter-url-for-display", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterURLForDisplay(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filterURLForDisplay")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def filterURLForDisplay(url: String, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("filterURLForDisplay")(url.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
}
