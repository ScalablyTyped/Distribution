package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFragmentMod {
  
  @JSImport("@wordpress/url/build-types/get-fragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFragment(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragment")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
}
