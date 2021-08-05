package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidPathMod {
  
  @JSImport("@wordpress/url/build-types/is-valid-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidPath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
