package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateSourceFile")
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

