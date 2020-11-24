package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins/DeepCommentPlugin", JSImport.Namespace)
@js.native
object deepCommentPluginMod extends js.Object {
  
  @js.native
  class DeepCommentPlugin () extends AbstractComponent[Converter] {
    
    var onBeginResolve: js.Any = js.native
  }
}
