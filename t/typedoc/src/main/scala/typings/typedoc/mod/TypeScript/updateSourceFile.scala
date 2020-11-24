package typings.typedoc.mod.TypeScript

import typings.typescript.mod.SourceFile
import typings.typescript.mod.TextChangeRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateSourceFile")
@js.native
object updateSourceFile extends js.Object {
  
  def apply(sourceFile: SourceFile, newText: String, textChangeRange: TextChangeRange): SourceFile = js.native
  def apply(
    sourceFile: SourceFile,
    newText: String,
    textChangeRange: TextChangeRange,
    aggressiveChecks: Boolean
  ): SourceFile = js.native
}
