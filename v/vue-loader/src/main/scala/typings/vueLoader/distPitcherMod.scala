package typings.vueLoader

import typings.webpack.mod.LoaderDefinitionFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPitcherMod {
  
  @JSImport("vue-loader/dist/pitcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vue-loader/dist/pitcher", JSImport.Default)
  @js.native
  val default: LoaderDefinitionFunction[js.Object, js.Object] = js.native
  
  inline def pitch(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pitch")().asInstanceOf[js.UndefOr[String]]
}
