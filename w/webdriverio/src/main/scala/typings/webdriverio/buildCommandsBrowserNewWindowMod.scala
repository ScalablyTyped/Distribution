package typings.webdriverio

import typings.webdriverio.buildTypesMod.NewWindowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserNewWindowMod {
  
  @JSImport("webdriverio/build/commands/browser/newWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(url: String, hasWindowNameWindowFeatures: NewWindowOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], hasWindowNameWindowFeatures.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
