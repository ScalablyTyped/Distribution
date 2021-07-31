package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidFragmentMod {
  
  @JSImport("@wordpress/url/build-types/is-valid-fragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isValidFragment(fragment: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFragment")(fragment.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
