package typings.stylableBuildTools

import typings.stylableBuildTools.anon.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadStylableConfigMod {
  
  @JSImport("@stylable/build-tools/dist/load-stylable-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadStylableConfig[T](context: String, extract: js.Function1[/* config */ Any, T]): js.UndefOr[Config[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadStylableConfig")(context.asInstanceOf[js.Any], extract.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Config[T]]]
}
