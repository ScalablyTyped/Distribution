package typings.typedoc.mod.TypeScript

import typings.typescript.mod.DiagnosticMessageChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.flattenDiagnosticMessageText")
@js.native
object flattenDiagnosticMessageText extends js.Object {
  
  def apply(diag: js.UndefOr[scala.Nothing], newLine: String): String = js.native
  def apply(diag: js.UndefOr[scala.Nothing], newLine: String, indent: Double): String = js.native
  def apply(diag: String, newLine: String): String = js.native
  def apply(diag: String, newLine: String, indent: Double): String = js.native
  def apply(diag: DiagnosticMessageChain, newLine: String): String = js.native
  def apply(diag: DiagnosticMessageChain, newLine: String, indent: Double): String = js.native
}
