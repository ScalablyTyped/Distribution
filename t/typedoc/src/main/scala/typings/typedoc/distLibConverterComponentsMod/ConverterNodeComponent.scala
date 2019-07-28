package typings.typedoc.distLibConverterComponentsMod

import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/components", "ConverterNodeComponent")
@js.native
abstract class ConverterNodeComponent[T /* <: Node */] () extends ConverterComponent {
  var supports: js.Array[SyntaxKind] = js.native
  def convert(context: Context, node: T): js.UndefOr[Reflection] = js.native
}

