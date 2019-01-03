package typings
package typedocLib.distLibConverterComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeTypeConverter[T /* <: typescriptLib.typescriptMod.tsNs.Type */] extends ConverterTypeComponent {
  def convertType(context: typedocLib.distLibConverterContextMod.Context, `type`: T): js.UndefOr[typedocLib.distLibModelsTypesAbstractMod.Type] = js.native
  def supportsType(context: typedocLib.distLibConverterContextMod.Context, `type`: T): scala.Boolean = js.native
}

