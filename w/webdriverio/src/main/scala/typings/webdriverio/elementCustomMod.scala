package typings.webdriverio

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementCustomMod {
  
  @JSImport("webdriverio/build/commands/element/custom$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(strategyName: String, strategyArguments: Any*): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(strategyName.asInstanceOf[js.Any]).`++`(strategyArguments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[Element]]
}
