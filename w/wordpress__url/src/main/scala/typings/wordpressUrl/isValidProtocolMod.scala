package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidProtocolMod {
  
  @JSImport("@wordpress/url/build-types/is-valid-protocol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidProtocol(protocol: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidProtocol")(protocol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
