package typings.typedoc.mod.TypeScript

import typings.typescript.mod.IScriptSnapshot
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TextChangeRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateLanguageServiceSourceFile")
@js.native
object updateLanguageServiceSourceFile extends js.Object {
  
  def apply(sourceFile: SourceFile, scriptSnapshot: IScriptSnapshot, version: String): SourceFile = js.native
  def apply(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: String,
    textChangeRange: js.UndefOr[scala.Nothing],
    aggressiveChecks: Boolean
  ): SourceFile = js.native
  def apply(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: String,
    textChangeRange: TextChangeRange
  ): SourceFile = js.native
  def apply(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: String,
    textChangeRange: TextChangeRange,
    aggressiveChecks: Boolean
  ): SourceFile = js.native
}
