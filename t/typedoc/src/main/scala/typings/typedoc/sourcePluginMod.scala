package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/SourcePlugin", JSImport.Namespace)
@js.native
object sourcePluginMod extends js.Object {
  @js.native
  class SourcePlugin () extends AbstractComponent[Converter] {
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

