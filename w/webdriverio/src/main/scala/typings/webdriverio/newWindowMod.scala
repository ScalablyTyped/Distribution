package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newWindowMod {
  
  @JSImport("webdriverio/build/commands/browser/newWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(
    url: String,
    hasWindowNameWindowFeatures: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.NewWindowOptions */ js.Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], hasWindowNameWindowFeatures.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
