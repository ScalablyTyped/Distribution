package typings.stylableWebpackPlugin

import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isLoadedByLoadersMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/is-loaded-by-loaders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isLoadedByLoaders(module: StylableModule, warn: js.Function1[/* m */ StylableModule, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLoadedByLoaders")(module.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
