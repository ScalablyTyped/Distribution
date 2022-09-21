package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementsPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/ImplementsPlugin", "ImplementsPlugin")
  @js.native
  open class ImplementsPlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    /**
      * Mark all members of the given class to be the implementation of the matching interface member.
      *
      * @param context  The context object describing the current state the converter is in.
      * @param classReflection  The reflection of the classReflection class.
      * @param interfaceReflection  The reflection of the interfaceReflection interface.
      */
    /* private */ var analyzeImplements: Any = js.native
    
    /* private */ var analyzeInheritance: Any = js.native
    
    /* private */ var doResolve: Any = js.native
    
    /* private */ var getExtensionInfo: Any = js.native
    
    /**
      * Responsible for setting the {@link DeclarationReflection.inheritedFrom},
      * {@link DeclarationReflection.overwrites}, and {@link DeclarationReflection.implementationOf}
      * properties on the provided reflection temporarily, these links will be replaced
      * during the resolve step with links which actually point to the right place.
      */
    /* private */ var onDeclaration: Any = js.native
    
    /* private */ var onResolveEnd: Any = js.native
    
    /* private */ var onSignature: Any = js.native
    
    /* private */ var postponed: Any = js.native
    
    /* private */ var resolved: Any = js.native
    
    /* private */ var tryResolve: Any = js.native
  }
}
