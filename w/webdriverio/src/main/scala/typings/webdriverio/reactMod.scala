package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("webdriverio/build/commands/browser/react$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(selector: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def default(
    selector: String,
    hasPropsState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ReactSelectorOptions */ js.Any
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], hasPropsState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
