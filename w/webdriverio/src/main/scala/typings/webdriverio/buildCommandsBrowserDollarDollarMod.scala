package typings.webdriverio

import typings.std.Element
import typings.wdioProtocols.buildTypesMod.ElementReference
import typings.webdriverio.buildTypesMod.ElementArray
import typings.webdriverio.buildTypesMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserDollarDollarMod {
  
  @JSImport("webdriverio/build/commands/browser/$$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(selector: js.Array[Element | ElementReference]): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
  inline def default(selector: Selector): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
}
