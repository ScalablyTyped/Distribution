package typings.superagentPrefix

import typings.superagent.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(prefix: String): Plugin = ^.asInstanceOf[js.Dynamic].apply(prefix.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("superagent-prefix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
