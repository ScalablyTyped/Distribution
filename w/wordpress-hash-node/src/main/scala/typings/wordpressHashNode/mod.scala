package typings.wordpressHashNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wordpress-hash-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CheckPassword(password: String, hash: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("CheckPassword")(password.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def HashPassword(password: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("HashPassword")(password.asInstanceOf[js.Any]).asInstanceOf[String]
}
