package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/DecoratorPlugin", JSImport.Namespace)
@js.native
object decoratorPluginMod extends js.Object {
  @js.native
  class DecoratorPlugin () extends AbstractComponent[Converter] {
    var extractArguments: js.Any = js.native
    var onBegin: js.Any = js.native
    var onBeginResolve: js.Any = js.native
    var onDeclaration: js.Any = js.native
    var usages: js.Any = js.native
  }
  
}

