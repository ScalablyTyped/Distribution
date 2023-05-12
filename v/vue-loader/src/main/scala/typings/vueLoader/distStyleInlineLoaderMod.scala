package typings.vueLoader

import org.scalablytyped.runtime.Shortcut
import typings.webpack.mod.LoaderDefinitionFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStyleInlineLoaderMod extends Shortcut {
  
  @JSImport("vue-loader/dist/styleInlineLoader", JSImport.Default)
  @js.native
  val default: LoaderDefinitionFunction[js.Object, js.Object] = js.native
  
  type _To = LoaderDefinitionFunction[js.Object, js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distStyleInlineLoaderMod.foo` */
  override def _to: LoaderDefinitionFunction[js.Object, js.Object] = default
}
