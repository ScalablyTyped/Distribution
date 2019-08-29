package typings.tsDashNode

import typings.typescript.typescriptMod.DiagnosticMessageChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Diag extends js.Object {
  def apply(diag: js.UndefOr[scala.Nothing], newLine: String): String = js.native
  def apply(diag: js.UndefOr[scala.Nothing], newLine: String, indent: Double): String = js.native
  def apply(diag: String, newLine: String): String = js.native
  def apply(diag: String, newLine: String, indent: Double): String = js.native
  def apply(diag: DiagnosticMessageChain, newLine: String): String = js.native
  def apply(diag: DiagnosticMessageChain, newLine: String, indent: Double): String = js.native
}

