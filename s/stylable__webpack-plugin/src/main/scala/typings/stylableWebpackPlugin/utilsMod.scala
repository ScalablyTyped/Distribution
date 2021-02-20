package typings.stylableWebpackPlugin

import typings.stylableWebpackPlugin.anon.Reasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/utils", "isImportedByNonStylable")
  @js.native
  def isImportedByNonStylable(module: Reasons): Boolean = js.native
  
  @JSImport("@stylable/webpack-plugin/cjs/utils", "isStylableModule")
  @js.native
  def isStylableModule(
    module: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Module */ js.Any
  ): /* is @stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.StylableModule */ Boolean = js.native
  
  @JSImport("@stylable/webpack-plugin/cjs/utils", "rewriteUrl")
  @js.native
  def rewriteUrl(node: js.Any, replacementIndex: Double): Unit = js.native
}
