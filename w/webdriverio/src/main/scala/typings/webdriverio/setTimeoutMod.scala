package typings.webdriverio

import typings.webdriverio.anon.PartialTimeouts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setTimeoutMod {
  
  @JSImport("webdriverio/build/commands/browser/setTimeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(timeouts: PartialTimeouts): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(timeouts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
