package typings.stylableWebpackPlugin

import typings.stylableCore.mod.Stylable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/webpack-plugin/cjs/stylable-parser", JSImport.Namespace)
@js.native
object stylableParserMod extends js.Object {
  
  @js.native
  class StylableParser protected () extends js.Object {
    def this(
      stylable: Stylable,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any,
      normalModuleFactory: js.Any,
      useWeakDeps: Boolean
    ) = this()
    
    var compilation: js.Any = js.native
    
    var normalModuleFactory: js.Any = js.native
    
    def parse(_source: String, state: js.Any): js.Any = js.native
    
    var stylable: js.Any = js.native
    
    var useWeakDeps: js.Any = js.native
  }
}
