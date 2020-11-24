package typings.stylableCore.diagnosticsMod

import typings.postcss.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/diagnostics", "Diagnostics")
@js.native
class Diagnostics () extends js.Object {
  def this(reports: js.Array[Diagnostic]) = this()
  
  def add(`type`: DiagnosticType, node: Node, message: String): Unit = js.native
  def add(`type`: DiagnosticType, node: Node, message: String, options: DiagnosticOptions): Unit = js.native
  
  def error(node: Node, message: String): Unit = js.native
  def error(node: Node, message: String, options: DiagnosticOptions): Unit = js.native
  
  var reports: js.Array[Diagnostic] = js.native
  
  def warn(node: Node, message: String): Unit = js.native
  def warn(node: Node, message: String, options: DiagnosticOptions): Unit = js.native
}
