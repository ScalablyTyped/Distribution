package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.ConverterComponent
import typings.typedoc.distLibConverterConverterMod.Converter
import typings.typedoc.distLibUtilsEntryPointMod.EntryPointStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterPluginsPackagePluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/PackagePlugin", "PackagePlugin")
  @js.native
  open class PackagePlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    var entryPointStrategy: EntryPointStrategy = js.native
    
    var includeVersion: Boolean = js.native
    
    /**
      * Triggered when the converter begins converting a project.
      */
    /* private */ var onBegin: Any = js.native
    
    /**
      * Triggered when the converter begins resolving a project.
      *
      * @param context  The context object describing the current state the converter is in.
      */
    /* private */ var onBeginResolve: Any = js.native
    
    /**
      * The file name of the found package.json file.
      */
    /* private */ var packageFile: Any = js.native
    
    var readme: String = js.native
    
    /**
      * The file name of the found readme.md file.
      */
    /* private */ var readmeFile: Any = js.native
  }
}
