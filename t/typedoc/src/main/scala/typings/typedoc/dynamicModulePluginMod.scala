package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicModulePluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/DynamicModulePlugin", "DynamicModulePlugin")
  @js.native
  class DynamicModulePlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var basePath: js.Any = js.native
    
    var onBegin: js.Any = js.native
    
    var onBeginResolve: js.Any = js.native
    
    var onDeclaration: js.Any = js.native
    
    var reflections: js.Any = js.native
  }
}
