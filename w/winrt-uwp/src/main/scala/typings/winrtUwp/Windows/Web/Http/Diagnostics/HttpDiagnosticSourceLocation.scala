package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the source location of the HTTP activity. */
@js.native
trait HttpDiagnosticSourceLocation extends js.Object {
  /** Gets the column number. */
  var columnNumber: Double = js.native
  /** Gets the line number. */
  var lineNumber: Double = js.native
  /** Gets the source URI. */
  var sourceUri: Uri = js.native
}

object HttpDiagnosticSourceLocation {
  @scala.inline
  def apply(columnNumber: Double, lineNumber: Double, sourceUri: Uri): HttpDiagnosticSourceLocation = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], sourceUri = sourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticSourceLocation]
  }
  @scala.inline
  implicit class HttpDiagnosticSourceLocationOps[Self <: HttpDiagnosticSourceLocation] (val x: Self) extends AnyVal {
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
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceUri(value: Uri): Self = this.set("sourceUri", value.asInstanceOf[js.Any])
  }
  
}

