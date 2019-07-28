package typings.typedoc.distLibConverterComponentsMod

import typings.typedoc.distLibConverterContextMod.Context
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeNodeConverter[T /* <: Type */, N /* <: Node */] extends ConverterTypeComponent {
  def convertNode(context: Context, node: N): js.UndefOr[typings.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
  def convertNode(context: Context, node: N, `type`: T): js.UndefOr[typings.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
  def supportsNode(context: Context, node: N): Boolean = js.native
  def supportsNode(context: Context, node: N, `type`: T): Boolean = js.native
}

