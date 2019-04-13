package typings
package typedocLib.distLibConverterComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeNodeConverter[T /* <: typescriptLib.typescriptMod.Type */, N /* <: typescriptLib.typescriptMod.Node */] extends ConverterTypeComponent {
  def convertNode(context: typedocLib.distLibConverterContextMod.Context, node: N): js.UndefOr[typedocLib.distLibModelsTypesAbstractMod.Type] = js.native
  def convertNode(context: typedocLib.distLibConverterContextMod.Context, node: N, `type`: T): js.UndefOr[typedocLib.distLibModelsTypesAbstractMod.Type] = js.native
  def supportsNode(context: typedocLib.distLibConverterContextMod.Context, node: N): scala.Boolean = js.native
  def supportsNode(context: typedocLib.distLibConverterContextMod.Context, node: N, `type`: T): scala.Boolean = js.native
}

