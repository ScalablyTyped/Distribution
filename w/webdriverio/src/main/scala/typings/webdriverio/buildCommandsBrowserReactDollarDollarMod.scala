package typings.webdriverio

import typings.webdriverio.buildTypesMod.ElementArray
import typings.webdriverio.buildTypesMod.ReactSelectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserReactDollarDollarMod {
  
  @JSImport("webdriverio/build/commands/browser/react$$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(selector: String): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
  inline def default(selector: String, hasPropsState: ReactSelectorOptions): js.Promise[ElementArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], hasPropsState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ElementArray]]
}
