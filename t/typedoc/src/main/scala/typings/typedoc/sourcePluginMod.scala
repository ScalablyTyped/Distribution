package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcePluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/SourcePlugin", "SourcePlugin")
  @js.native
  class SourcePlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var basePath: js.Any = js.native
    
    val disableSources: Boolean = js.native
    
    var fileMappings: js.Any = js.native
    
    var getSourceFile: js.Any = js.native
    
    var onBegin: js.Any = js.native
    
    var onBeginDocument: js.Any = js.native
    
    var onBeginResolve: js.Any = js.native
    
    var onDeclaration: js.Any = js.native
    
    var onEndResolve: js.Any = js.native
    
    var onResolve: js.Any = js.native
  }
}
