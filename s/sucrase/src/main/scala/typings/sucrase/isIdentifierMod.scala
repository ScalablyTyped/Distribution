package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIdentifierMod {
  
  @JSImport("sucrase/dist/types/util/isIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
