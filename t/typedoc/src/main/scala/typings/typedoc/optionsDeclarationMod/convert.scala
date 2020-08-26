package typings.typedoc.optionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/declaration", "convert")
@js.native
object convert extends js.Object {
  def apply(value: js.Any, option: ArrayDeclarationOption): DeclarationOptionToOptionType[ArrayDeclarationOption] = js.native
  def apply(value: js.Any, option: BooleanDeclarationOption): DeclarationOptionToOptionType[BooleanDeclarationOption] = js.native
  def apply(value: js.Any, option: MapDeclarationOption[_]): DeclarationOptionToOptionType[MapDeclarationOption[_]] = js.native
  def apply(value: js.Any, option: MixedDeclarationOption): DeclarationOptionToOptionType[MixedDeclarationOption] = js.native
  def apply(value: js.Any, option: NumberDeclarationOption): DeclarationOptionToOptionType[NumberDeclarationOption] = js.native
  def apply(value: js.Any, option: StringDeclarationOption): DeclarationOptionToOptionType[StringDeclarationOption] = js.native
}

