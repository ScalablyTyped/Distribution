package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.ConverterComponent
import typings.typedoc.distLibConverterConverterMod.Converter
import typings.typedoc.distLibConverterMod.Context
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterPluginsLinkResolverPluginMod {
  
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
