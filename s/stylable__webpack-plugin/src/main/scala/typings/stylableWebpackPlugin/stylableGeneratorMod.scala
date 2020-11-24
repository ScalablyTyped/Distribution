package typings.stylableWebpackPlugin

import typings.stylableCore.mod.Stylable
import typings.stylableWebpackPlugin.anon.PartialStylableGeneratorO
import typings.stylableWebpackPlugin.typesMod.StylableModule
import typings.stylableWebpackPlugin.typesMod.WebpackAssetModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/webpack-plugin/cjs/stylable-generator", JSImport.Namespace)
@js.native
object stylableGeneratorMod extends js.Object {
  
  @js.native
  class StylableGenerator protected () extends js.Object {
    def this(
      stylable: Stylable,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any,
      normalModuleFactory: js.Any,
      options: PartialStylableGeneratorO
    ) = this()
    
    var afterTransform: js.Any = js.native
    
    var compilation: js.Any = js.native
    
    var createModuleSource: js.Any = js.native
    
    def generate(module: StylableModule, _dependencyTemplates: js.Any, runtimeTemplate: js.Any): js.Any = js.native
    
    var normalModuleFactory: js.Any = js.native
    
    var options: js.Any = js.native
    
    var reportDiagnostics: js.Any = js.native
    
    var stringifyCSS: js.Any = js.native
    
    var stylable: js.Any = js.native
    
    def toCSS(module: StylableModule, onAsset: js.Function1[/* module */ WebpackAssetModule, String]): String = js.native
  }
}
