package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.ConverterComponent
import typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/TypePlugin", JSImport.Namespace)
@js.native
object distLibConverterPluginsTypePluginMod extends js.Object {
  @js.native
  class TypePlugin () extends ConverterComponent {
    var onResolve: js.Any = js.native
    var onResolveEnd: js.Any = js.native
    var postpone: js.Any = js.native
    var reflections: js.Array[DeclarationReflection] = js.native
  }
  
}

