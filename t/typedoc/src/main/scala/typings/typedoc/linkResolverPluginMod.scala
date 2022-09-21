package typings.typedoc

import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.converterMod.Context
import typings.typedoc.optionsDeclarationMod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkResolverPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/LinkResolverPlugin", "LinkResolverPlugin")
  @js.native
  open class LinkResolverPlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    def onResolve(context: Context): Unit = js.native
    
    var validation: ValidationOptions = js.native
  }
}
