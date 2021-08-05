package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.reflectionsMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typePluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/TypePlugin", "TypePlugin")
  @js.native
  class TypePlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    /* private */ var onResolve: js.Any = js.native
    
    /* private */ var onResolveEnd: js.Any = js.native
    
    /* private */ var postpone: js.Any = js.native
    
    var reflections: js.Array[DeclarationReflection] = js.native
  }
}
