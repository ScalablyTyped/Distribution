package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidAuthorityMod {
  
  @JSImport("@wordpress/url/build-types/is-valid-authority", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidAuthority(authority: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAuthority")(authority.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
