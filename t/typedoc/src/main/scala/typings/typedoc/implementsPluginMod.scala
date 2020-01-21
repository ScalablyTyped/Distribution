package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/ImplementsPlugin", JSImport.Namespace)
@js.native
object implementsPluginMod extends js.Object {
  @js.native
  class ImplementsPlugin () extends AbstractComponent[Converter] {
    var analyzeClass: js.Any = js.native
    var copyComment: js.Any = js.native
    var onResolve: js.Any = js.native
  }
  
}

