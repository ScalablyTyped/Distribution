package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagePluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/PackagePlugin", "PackagePlugin")
  @js.native
  class PackagePlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var includeVersion: Boolean = js.native
    
    /* private */ var noReadmeFile: js.Any = js.native
    
    /* private */ var onBegin: js.Any = js.native
    
    /* private */ var onBeginDocument: js.Any = js.native
    
    /* private */ var onBeginResolve: js.Any = js.native
    
    /* private */ var packageFile: js.Any = js.native
    
    var readme: String = js.native
    
    /* private */ var readmeFile: js.Any = js.native
    
    /* private */ var visited: js.Any = js.native
  }
}
