package typings.webdriverio

import typings.webdriverio.buildTypesMod.TouchActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserTouchActionMod {
  
  @JSImport("webdriverio/build/commands/browser/touchAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(actions: TouchActions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(actions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
