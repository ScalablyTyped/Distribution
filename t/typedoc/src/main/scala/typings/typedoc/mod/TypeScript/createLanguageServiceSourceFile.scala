package typings.typedoc.mod.TypeScript

import typings.typescript.mod.IScriptSnapshot
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createLanguageServiceSourceFile")
@js.native
object createLanguageServiceSourceFile extends js.Object {
  
  def apply(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: typings.typescript.mod.ScriptTarget,
    version: String,
    setNodeParents: Boolean
  ): SourceFile = js.native
  def apply(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: typings.typescript.mod.ScriptTarget,
    version: String,
    setNodeParents: Boolean,
    scriptKind: typings.typescript.mod.ScriptKind
  ): SourceFile = js.native
}
