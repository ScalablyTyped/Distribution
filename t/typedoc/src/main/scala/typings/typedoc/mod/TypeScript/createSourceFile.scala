package typings.typedoc.mod.TypeScript

import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createSourceFile")
@js.native
object createSourceFile extends js.Object {
  def apply(fileName: String, sourceText: String, languageVersion: typings.typescript.mod.ScriptTarget): SourceFile = js.native
  def apply(
    fileName: String,
    sourceText: String,
    languageVersion: typings.typescript.mod.ScriptTarget,
    setParentNodes: js.UndefOr[scala.Nothing],
    scriptKind: typings.typescript.mod.ScriptKind
  ): SourceFile = js.native
  def apply(
    fileName: String,
    sourceText: String,
    languageVersion: typings.typescript.mod.ScriptTarget,
    setParentNodes: Boolean
  ): SourceFile = js.native
  def apply(
    fileName: String,
    sourceText: String,
    languageVersion: typings.typescript.mod.ScriptTarget,
    setParentNodes: Boolean,
    scriptKind: typings.typescript.mod.ScriptKind
  ): SourceFile = js.native
}

