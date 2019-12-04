package typings.tslint.tslintMod

import typings.tslint.libLanguageFormatterFormatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "findFormatter")
@js.native
object findFormatter extends js.Object {
  def apply(name: String): js.UndefOr[FormatterConstructor] = js.native
  def apply(name: String, formattersDirectory: String): js.UndefOr[FormatterConstructor] = js.native
  def apply(name: FormatterConstructor): js.UndefOr[FormatterConstructor] = js.native
  def apply(name: FormatterConstructor, formattersDirectory: String): js.UndefOr[FormatterConstructor] = js.native
}

