package typings.stylableWebpackPlugin

import typings.stylableWebpackPlugin.anon.Reasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isImportedByNonStylable(module: Reasons): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportedByNonStylable")(module.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStylableModule(
    module: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Module */ js.Any
  ): /* is @stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.StylableModule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStylableModule")(module.asInstanceOf[js.Any]).asInstanceOf[/* is @stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.StylableModule */ Boolean]
  
  inline def rewriteUrl(node: js.Any, replacementIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rewriteUrl")(node.asInstanceOf[js.Any], replacementIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
