package typings.webdriverio

import typings.webdriverio.buildTypesMod.ElementArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserCustomDollarDollarMod {
  
  @JSImport("webdriverio/build/commands/browser/custom$$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(strategyName: String, strategyArguments: Any*): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(strategyName.asInstanceOf[js.Any]).`++`(strategyArguments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[ElementArray]]
}
