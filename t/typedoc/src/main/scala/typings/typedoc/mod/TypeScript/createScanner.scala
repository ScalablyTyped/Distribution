package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ErrorCallback
import typings.typescript.mod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createScanner")
@js.native
object createScanner extends js.Object {
  def apply(languageVersion: typings.typescript.mod.ScriptTarget, skipTrivia: Boolean): Scanner = js.native
  def apply(
    languageVersion: typings.typescript.mod.ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: typings.typescript.mod.LanguageVariant
  ): Scanner = js.native
  def apply(
    languageVersion: typings.typescript.mod.ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: typings.typescript.mod.LanguageVariant,
    textInitial: String
  ): Scanner = js.native
  def apply(
    languageVersion: typings.typescript.mod.ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: typings.typescript.mod.LanguageVariant,
    textInitial: String,
    onError: ErrorCallback
  ): Scanner = js.native
  def apply(
    languageVersion: typings.typescript.mod.ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: typings.typescript.mod.LanguageVariant,
    textInitial: String,
    onError: ErrorCallback,
    start: Double
  ): Scanner = js.native
  def apply(
    languageVersion: typings.typescript.mod.ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: typings.typescript.mod.LanguageVariant,
    textInitial: String,
    onError: ErrorCallback,
    start: Double,
    length: Double
  ): Scanner = js.native
}

