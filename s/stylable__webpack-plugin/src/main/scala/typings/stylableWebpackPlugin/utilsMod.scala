package typings.stylableWebpackPlugin

import typings.stylableWebpackPlugin.anon.Reasons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/webpack-plugin/cjs/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def isImportedByNonStylable(module: Reasons): Boolean = js.native
  
  def isStylableModule(
    module: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Module */ js.Any
  ): /* is @stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.StylableModule */ Boolean = js.native
  
  def rewriteUrl(node: js.Any, replacementIndex: Double): Unit = js.native
}
