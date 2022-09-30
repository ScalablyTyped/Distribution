package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin")
  @js.native
  open class CommentPlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    /**
      * Apply all comment tag modifiers to the given reflection.
      *
      * @param reflection  The reflection the modifiers should be applied to.
      * @param comment  The comment that should be searched for modifiers.
      */
    /* private */ var applyModifiers: Any = js.native
    
    var excludeInternal: Boolean = js.native
    
    var excludeNotDocumented: Boolean = js.native
    
    var excludePrivate: Boolean = js.native
    
    var excludeProtected: Boolean = js.native
    
    var excludeTags: js.Array[/* template literal string: @${string} */ String] = js.native
    
    /**
      * Determines whether or not a reflection has been hidden
      *
      * @param reflection Reflection to check if hidden
      */
    /* private */ var isHidden: Any = js.native
    
    /* private */ var moveCommentToSignatures: Any = js.native
    
    /**
      * Triggered when the converter begins resolving a project.
      *
      * @param context  The context object describing the current state the converter is in.
      */
    /* private */ var onBeginResolve: Any = js.native
    
    /**
      * Triggered when the converter has created a type parameter reflection.
      *
      * @param context  The context object describing the current state the converter is in.
      * @param reflection  The reflection that is currently processed.
      */
    /* private */ var onCreateTypeParameter: Any = js.native
    
    /**
      * Triggered when the converter has created a declaration or signature reflection.
      *
      * Invokes the comment parser.
      *
      * @param context  The context object describing the current state the converter is in.
      * @param reflection  The reflection that is currently processed.
      * @param node  The node that is currently processed if available.
      */
    /* private */ var onDeclaration: Any = js.native
    
    /**
      * Triggered when the converter resolves a reflection.
      *
      * Cleans up comment tags related to signatures like `@param` or `@returns`
      * and moves their data to the corresponding parameter reflections.
      *
      * This hook also copies over the comment of function implementations to their
      * signatures.
      *
      * @param context  The context object describing the current state the converter is in.
      * @param reflection  The reflection that is currently resolved.
      */
    /* private */ var onResolve: Any = js.native
    
    /* private */ var removeExcludedTags: Any = js.native
  }
}
