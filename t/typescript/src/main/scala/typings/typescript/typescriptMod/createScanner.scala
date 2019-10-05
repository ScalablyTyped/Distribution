package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createScanner")
@js.native
object createScanner extends js.Object {
  def apply(languageVersion: ScriptTarget, skipTrivia: Boolean): Scanner = js.native
  def apply(languageVersion: ScriptTarget, skipTrivia: Boolean, languageVariant: LanguageVariant): Scanner = js.native
  def apply(
    languageVersion: ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: LanguageVariant,
    textInitial: String
  ): Scanner = js.native
  def apply(
    languageVersion: ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: LanguageVariant,
    textInitial: String,
    onError: ErrorCallback
  ): Scanner = js.native
  def apply(
    languageVersion: ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: LanguageVariant,
    textInitial: String,
    onError: ErrorCallback,
    start: Double
  ): Scanner = js.native
  def apply(
    languageVersion: ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: LanguageVariant,
    textInitial: String,
    onError: ErrorCallback,
    start: Double,
    length: Double
  ): Scanner = js.native
}

