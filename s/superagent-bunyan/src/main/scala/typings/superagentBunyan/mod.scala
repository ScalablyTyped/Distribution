package typings.superagentBunyan

import typings.superagent.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(logger: typings.bunyan.mod.^): Plugin = ^.asInstanceOf[js.Dynamic].apply(logger.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  inline def apply(logger: typings.bunyan.mod.^, requestId: String): Plugin = (^.asInstanceOf[js.Dynamic].apply(logger.asInstanceOf[js.Any], requestId.asInstanceOf[js.Any])).asInstanceOf[Plugin]
  inline def apply(logger: typings.bunyan.mod.^, requestId: String, extra: js.Object): Plugin = (^.asInstanceOf[js.Dynamic].apply(logger.asInstanceOf[js.Any], requestId.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Plugin]
  inline def apply(logger: typings.bunyan.mod.^, requestId: Unit, extra: js.Object): Plugin = (^.asInstanceOf[js.Dynamic].apply(logger.asInstanceOf[js.Any], requestId.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Plugin]
  
  @JSImport("superagent-bunyan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
