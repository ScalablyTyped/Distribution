package typings.typescriptServices.TypeScript.CompilerDiagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiagnosticWriter extends js.Object {
  def Alert(output: String): Unit
}

object IDiagnosticWriter {
  @scala.inline
  def apply(Alert: String => Unit): IDiagnosticWriter = {
    val __obj = js.Dynamic.literal(Alert = js.Any.fromFunction1(Alert))
    __obj.asInstanceOf[IDiagnosticWriter]
  }
}

