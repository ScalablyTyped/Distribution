package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeDecodeUriComponentMod {
  
  @JSImport("@wordpress/url/build-types/safe-decode-uri-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def safeDecodeURIComponent(uriComponent: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeDecodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[String]
}
