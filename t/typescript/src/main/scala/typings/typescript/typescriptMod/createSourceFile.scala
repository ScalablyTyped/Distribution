package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createSourceFile")
@js.native
object createSourceFile extends js.Object {
  def apply(fileName: String, sourceText: String, languageVersion: ScriptTarget): SourceFile = js.native
  def apply(fileName: String, sourceText: String, languageVersion: ScriptTarget, setParentNodes: Boolean): SourceFile = js.native
  def apply(
    fileName: String,
    sourceText: String,
    languageVersion: ScriptTarget,
    setParentNodes: Boolean,
    scriptKind: ScriptKind
  ): SourceFile = js.native
}

