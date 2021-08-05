package typings.stylableWebpackPlugin

import typings.stylableWebpackPlugin.anon.ShallowPartialStylableWeb
import typings.stylableWebpackPlugin.typesMod.StylableWebpackPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginOptionsMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/plugin-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeOptions_mode(
    options: ShallowPartialStylableWeb,
    mode: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['mode'] */ js.Any
  ): StylableWebpackPluginOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptions")(options.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[StylableWebpackPluginOptions]
}
