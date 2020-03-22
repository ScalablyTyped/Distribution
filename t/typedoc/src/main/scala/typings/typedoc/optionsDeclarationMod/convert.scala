package typings.typedoc.optionsDeclarationMod

import typings.typedoc.resultMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/declaration", "convert")
@js.native
object convert extends js.Object {
  def apply(value: js.Any, option: ArrayDeclarationOption): Result[DeclarationOptionToOptionType[ArrayDeclarationOption], String] = js.native
  def apply(value: js.Any, option: BooleanDeclarationOption): Result[DeclarationOptionToOptionType[BooleanDeclarationOption], String] = js.native
  def apply(value: js.Any, option: MapDeclarationOption[_]): Result[DeclarationOptionToOptionType[MapDeclarationOption[_]], String] = js.native
  def apply(value: js.Any, option: MixedDeclarationOption): Result[DeclarationOptionToOptionType[MixedDeclarationOption], String] = js.native
  def apply(value: js.Any, option: NumberDeclarationOption): Result[DeclarationOptionToOptionType[NumberDeclarationOption], String] = js.native
  def apply(value: js.Any, option: StringDeclarationOption): Result[DeclarationOptionToOptionType[StringDeclarationOption], String] = js.native
}

