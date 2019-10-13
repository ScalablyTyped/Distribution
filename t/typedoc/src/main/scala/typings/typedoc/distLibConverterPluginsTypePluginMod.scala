package typings.typedoc

import typings.typedoc.distLibConverterConverterMod.Converter
import typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/TypePlugin", JSImport.Namespace)
@js.native
object distLibConverterPluginsTypePluginMod extends js.Object {
  @js.native
  class TypePlugin () extends AbstractComponent[Converter] {
    var onResolve: js.Any = js.native
    var onResolveEnd: js.Any = js.native
    var postpone: js.Any = js.native
    var reflections: js.Array[DeclarationReflection] = js.native
  }
  
}

