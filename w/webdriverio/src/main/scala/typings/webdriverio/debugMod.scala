package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugMod {
  
  @JSImport("webdriverio/build/commands/browser/debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Any]]
  inline def default(commandTimeout: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(commandTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
