package typings
package typedocLib.distLibConverterComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeNodeConverter[T /* <: typescriptLib.typescriptMod.tsNs.Type */, N /* <: typescriptLib.typescriptMod.tsNs.Node */] extends ConverterTypeComponent {
  def convertNode(context: typedocLib.distLibConverterContextMod.Context, node: N, `type`: T): typedocLib.distLibModelsTypesAbstractMod.Type = js.native
  def supportsNode(context: typedocLib.distLibConverterContextMod.Context, node: N, `type`: T): scala.Boolean = js.native
}

