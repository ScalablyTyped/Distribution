package typings
package typescriptDashServicesLib.TypeScriptNs.CompilerDiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiagnosticWriter extends js.Object {
  def Alert(output: java.lang.String): scala.Unit
}

object IDiagnosticWriter {
  @scala.inline
  def apply(Alert: java.lang.String => scala.Unit): IDiagnosticWriter = {
    val __obj = js.Dynamic.literal(Alert = js.Any.fromFunction1(Alert))
  
    __obj.asInstanceOf[IDiagnosticWriter]
  }
}

