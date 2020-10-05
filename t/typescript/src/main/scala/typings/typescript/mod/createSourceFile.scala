package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createSourceFile")
@js.native
object createSourceFile extends js.Object {
  def apply(fileName: java.lang.String, sourceText: java.lang.String, languageVersion: ScriptTarget): SourceFile = js.native
  def apply(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: ScriptTarget,
    setParentNodes: js.UndefOr[scala.Nothing],
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def apply(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: ScriptTarget,
    setParentNodes: Boolean
  ): SourceFile = js.native
  def apply(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: ScriptTarget,
    setParentNodes: Boolean,
    scriptKind: ScriptKind
  ): SourceFile = js.native
}

