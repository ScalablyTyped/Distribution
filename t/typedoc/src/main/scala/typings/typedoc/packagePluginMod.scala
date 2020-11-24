package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins/PackagePlugin", JSImport.Namespace)
@js.native
object packagePluginMod extends js.Object {
  
  @js.native
  class PackagePlugin () extends AbstractComponent[Converter] {
    
    var includeVersion: Boolean = js.native
    
    var noReadmeFile: js.Any = js.native
    
    var onBegin: js.Any = js.native
    
    var onBeginDocument: js.Any = js.native
    
    var onBeginResolve: js.Any = js.native
    
    var packageFile: js.Any = js.native
    
    var readme: String = js.native
    
    var readmeFile: js.Any = js.native
    
    var visited: js.Any = js.native
  }
}
