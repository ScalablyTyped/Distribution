package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateLanguageServiceSourceFile")
@js.native
object updateLanguageServiceSourceFile extends js.Object {
  def apply(sourceFile: SourceFile, scriptSnapshot: IScriptSnapshot, version: java.lang.String): SourceFile = js.native
  def apply(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: js.UndefOr[scala.Nothing],
    aggressiveChecks: Boolean
  ): SourceFile = js.native
  def apply(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: TextChangeRange
  ): SourceFile = js.native
  def apply(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: TextChangeRange,
    aggressiveChecks: Boolean
  ): SourceFile = js.native
}

