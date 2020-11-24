package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createLanguageServiceSourceFile")
@js.native
object createLanguageServiceSourceFile extends js.Object {
  
  def apply(
    fileName: java.lang.String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: ScriptTarget,
    version: java.lang.String,
    setNodeParents: Boolean
  ): SourceFile = js.native
  def apply(
    fileName: java.lang.String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: ScriptTarget,
    version: java.lang.String,
    setNodeParents: Boolean,
    scriptKind: ScriptKind
  ): SourceFile = js.native
}
