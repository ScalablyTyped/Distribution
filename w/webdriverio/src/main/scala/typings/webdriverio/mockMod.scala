package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockMod {
  
  @JSImport("webdriverio/build/commands/browser/mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    url: String,
    filterOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockFilterOptions */ js.Any
  ): js.Promise[
    typings.webdriverio.devtoolsMod.default | typings.webdriverio.webdriverMod.default
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], filterOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.webdriverio.devtoolsMod.default | typings.webdriverio.webdriverMod.default
  ]]
}
