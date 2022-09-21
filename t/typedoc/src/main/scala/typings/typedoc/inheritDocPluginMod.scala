package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inheritDocPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/InheritDocPlugin", "InheritDocPlugin")
  @js.native
  open class InheritDocPlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    /* private */ var copyComment: Any = js.native
    
    /* private */ var createCircularDependencyWarnings: Any = js.native
    
    /* private */ var dependencies: Any = js.native
    
    /**
      * Traverse through reflection descendant to check for `inheritDoc` tag.
      * If encountered, the parameter of the tag is used to determine a source reflection
      * that will provide actual comment.
      *
      * @param context  The context object describing the current state the converter is in.
      * @param reflection  The reflection that is currently resolved.
      */
    /* private */ var processInheritDoc: Any = js.native
  }
}
