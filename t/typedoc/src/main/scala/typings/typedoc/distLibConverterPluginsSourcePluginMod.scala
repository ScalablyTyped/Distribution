package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.ConverterComponent
import typings.typedoc.distLibConverterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterPluginsSourcePluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/SourcePlugin", "SourcePlugin")
  @js.native
  open class SourcePlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    val basePath: String = js.native
    
    val disableSources: Boolean = js.native
    
    /**
      * All file names to find the base path from.
      */
    /* private */ var fileNames: Any = js.native
    
    /**
      * Check whether the given file is placed inside a repository.
      *
      * @param fileName  The name of the file a repository should be looked for.
      * @returns The found repository info or undefined.
      */
    /* private */ var getRepository: Any = js.native
    
    val gitRemote: String = js.native
    
    val gitRevision: String = js.native
    
    /**
      * List of paths known to be not under git control.
      */
    /* private */ var ignoredPaths: Any = js.native
    
    /**
      * Triggered when the converter begins resolving a project.
      *
      * @param context  The context object describing the current state the converter is in.
      */
    /* private */ var onBeginResolve: Any = js.native
    
    /**
      * Triggered when the converter has created a declaration reflection.
      *
      * Attach the current source file to the {@link DeclarationReflection.sources} array.
      *
      * @param _context  The context object describing the current state the converter is in.
      * @param reflection  The reflection that is currently processed.
      */
    /* private */ var onDeclaration: Any = js.native
    
    /* private */ var onEnd: Any = js.native
    
    /* private */ var onSignature: Any = js.native
    
    /**
      * List of known repositories.
      */
    /* private */ var repositories: Any = js.native
    
    val sourceLinkTemplate: String = js.native
  }
}
