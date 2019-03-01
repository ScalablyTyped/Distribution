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
  def apply(Alert: js.Function1[java.lang.String, scala.Unit]): IDiagnosticWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Alert")(Alert)
    __obj.asInstanceOf[IDiagnosticWriter]
  }
}

