package typings.stylableWebpackPlugin

import typings.stylableCore.mod.Stylable
import typings.stylableWebpackPlugin.anon.PartialStylableGeneratorO
import typings.stylableWebpackPlugin.typesMod.StylableModule
import typings.stylableWebpackPlugin.typesMod.WebpackAssetModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableGeneratorMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-generator", "StylableGenerator")
  @js.native
  class StylableGenerator protected () extends StObject {
    def this(
      stylable: Stylable,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any,
      normalModuleFactory: js.Any,
      options: PartialStylableGeneratorO
    ) = this()
    
    /* private */ var afterTransform: js.Any = js.native
    
    /* private */ var compilation: js.Any = js.native
    
    /* private */ var createModuleSource: js.Any = js.native
    
    def generate(module: StylableModule, _dependencyTemplates: js.Any, runtimeTemplate: js.Any): js.Any = js.native
    
    /* private */ var normalModuleFactory: js.Any = js.native
    
    /* private */ var options: js.Any = js.native
    
    /* private */ var reportDiagnostics: js.Any = js.native
    
    /* private */ var stringifyCSS: js.Any = js.native
    
    /* private */ var stylable: js.Any = js.native
    
    def toCSS(module: StylableModule, onAsset: js.Function1[/* module */ WebpackAssetModule, String]): String = js.native
  }
}
