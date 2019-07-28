package typings.tsDashNode

import typings.typescript.typescriptMod.CancellationToken
import typings.typescript.typescriptMod.Diagnostic
import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CancellationToken extends js.Object {
  def apply(program: Program): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
}

