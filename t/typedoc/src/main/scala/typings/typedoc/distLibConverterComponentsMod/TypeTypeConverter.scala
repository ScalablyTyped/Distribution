package typings.typedoc.distLibConverterComponentsMod

import typings.typedoc.distLibConverterContextMod.Context
import typings.typescript.typescriptMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeTypeConverter[T /* <: Type */] extends ConverterTypeComponent {
  def convertType(context: Context, `type`: T): js.UndefOr[typings.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
  def supportsType(context: Context, `type`: T): Boolean = js.native
}

