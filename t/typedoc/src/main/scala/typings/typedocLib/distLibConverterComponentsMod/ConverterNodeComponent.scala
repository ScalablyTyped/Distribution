package typings
package typedocLib.distLibConverterComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/components", "ConverterNodeComponent")
@js.native
abstract class ConverterNodeComponent[T /* <: typescriptLib.typescriptMod.tsNs.Node */] () extends ConverterComponent {
  var supports: js.Array[typescriptLib.typescriptMod.tsNs.SyntaxKind] = js.native
  def convert(context: typedocLib.distLibConverterContextMod.Context, node: T): js.UndefOr[typedocLib.distLibModelsReflectionsAbstractMod.Reflection] = js.native
}

