package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "flattenDiagnosticMessageText")
@js.native
object flattenDiagnosticMessageText extends js.Object {
  def apply(diag: js.UndefOr[scala.Nothing], newLine: String): String = js.native
  def apply(diag: js.UndefOr[scala.Nothing], newLine: String, indent: Double): String = js.native
  def apply(diag: String, newLine: String): String = js.native
  def apply(diag: String, newLine: String, indent: Double): String = js.native
  def apply(diag: DiagnosticMessageChain, newLine: String): String = js.native
  def apply(diag: DiagnosticMessageChain, newLine: String, indent: Double): String = js.native
}

