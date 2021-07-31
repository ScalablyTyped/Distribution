package typings.stylableWebpackPlugin

import typings.stylableCore.mod.Stylable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableParserMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-parser", "StylableParser")
  @js.native
  class StylableParser protected () extends StObject {
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
