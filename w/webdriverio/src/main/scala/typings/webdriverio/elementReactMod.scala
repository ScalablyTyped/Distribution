package typings.webdriverio

import typings.webdriverio.anon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementReactMod {
  
  @JSImport("webdriverio/build/commands/element/react$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(selector: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def default(selector: js.Any, hasPropsState: Props): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], hasPropsState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
