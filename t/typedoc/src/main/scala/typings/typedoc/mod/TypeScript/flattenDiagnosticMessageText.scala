package typings.typedoc.mod.TypeScript

import typings.typescript.mod.DiagnosticMessageChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.flattenDiagnosticMessageText")
@js.native
object flattenDiagnosticMessageText extends js.Object {
  def apply(diag: js.UndefOr[DiagnosticMessageChain | String], newLine: String): String = js.native
  def apply(diag: js.UndefOr[DiagnosticMessageChain | String], newLine: String, indent: Double): String = js.native
}

