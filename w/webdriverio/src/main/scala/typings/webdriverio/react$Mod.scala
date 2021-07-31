package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object react$Mod {
  
  @JSImport("webdriverio/build/commands/browser/react$$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(selector: String): js.Promise[js.Array[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Object]]]
  @scala.inline
  def default(
    selector: String,
    hasPropsState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ReactSelectorOptions */ js.Any
  ): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], hasPropsState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
}
