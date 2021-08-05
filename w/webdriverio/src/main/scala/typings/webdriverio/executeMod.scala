package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executeMod {
  
  @JSImport("webdriverio/build/commands/browser/execute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(script: String, args: js.Any*): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(script.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def default(script: js.Function, args: js.Any*): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(script.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
