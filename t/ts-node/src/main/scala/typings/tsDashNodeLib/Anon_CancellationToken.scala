package typings
package tsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CancellationToken extends js.Object {
  def apply(program: typescriptLib.typescriptMod.Program): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
  def apply(program: typescriptLib.typescriptMod.Program, sourceFile: typescriptLib.typescriptMod.SourceFile): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
  def apply(
    program: typescriptLib.typescriptMod.Program,
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    cancellationToken: typescriptLib.typescriptMod.CancellationToken
  ): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
}

