package typings.webdriverio

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveScreenshotMod {
  
  @JSImport("webdriverio/build/commands/browser/saveScreenshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(filepath: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
}
