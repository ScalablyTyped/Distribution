package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEmailMod {
  
  @JSImport("@wordpress/url/build-types/is-email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmail(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
