package typings.typedoc

import typings.std.Set
import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.modelsReflectionsMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typePluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/TypePlugin", "TypePlugin")
  @js.native
  open class TypePlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    /**
      * Triggered when the converter resolves a reflection.
      *
      * @param context  The context object describing the current state the converter is in.
      * @param reflection  The reflection that is currently resolved.
      */
    /* private */ var onResolve: Any = js.native
    
    /**
      * Triggered when the converter has finished resolving a project.
      */
    /* private */ var onResolveEnd: Any = js.native
    
    /* private */ var postpone: Any = js.native
    
    var reflections: Set[DeclarationReflection] = js.native
  }
}
