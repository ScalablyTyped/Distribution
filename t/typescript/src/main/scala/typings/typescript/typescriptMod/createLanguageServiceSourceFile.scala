package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createLanguageServiceSourceFile")
@js.native
object createLanguageServiceSourceFile extends js.Object {
  def apply(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: ScriptTarget,
    version: String,
    setNodeParents: Boolean
  ): SourceFile = js.native
  def apply(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: ScriptTarget,
    version: String,
    setNodeParents: Boolean,
    scriptKind: ScriptKind
  ): SourceFile = js.native
}

