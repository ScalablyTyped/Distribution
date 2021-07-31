package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/DecoratorPlugin", "DecoratorPlugin")
  @js.native
  class DecoratorPlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var extractArguments: js.Any = js.native
    
    var onBegin: js.Any = js.native
    
    var onBeginResolve: js.Any = js.native
    
    var onDeclaration: js.Any = js.native
    
    var usages: js.Any = js.native
  }
}
