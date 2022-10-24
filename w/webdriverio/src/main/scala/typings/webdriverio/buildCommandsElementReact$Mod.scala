package typings.webdriverio

import typings.std.Element
import typings.webdriverio.buildTypesMod.ReactSelectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementReact$Mod {
  
  @JSImport("webdriverio/build/commands/element/react$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(selector: String): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element]]
  inline def default(selector: String, param2: ReactSelectorOptions): js.Promise[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Element]]
}
