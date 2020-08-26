package typings.typescriptServices.TypeScript.CompilerDiagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiagnosticWriter extends js.Object {
  def Alert(output: String): Unit = js.native
}

object IDiagnosticWriter {
  @scala.inline
  def apply(Alert: String => Unit): IDiagnosticWriter = {
    val __obj = js.Dynamic.literal(Alert = js.Any.fromFunction1(Alert))
    __obj.asInstanceOf[IDiagnosticWriter]
  }
  @scala.inline
  implicit class IDiagnosticWriterOps[Self <: IDiagnosticWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlert(value: String => Unit): Self = this.set("Alert", js.Any.fromFunction1(value))
  }
  
}

