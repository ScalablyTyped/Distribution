package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the source location of the HTTP activity. */
trait HttpDiagnosticSourceLocation extends js.Object {
  /** Gets the column number. */
  var columnNumber: Double
  /** Gets the line number. */
  var lineNumber: Double
  /** Gets the source URI. */
  var sourceUri: Uri
}

object HttpDiagnosticSourceLocation {
  @scala.inline
  def apply(columnNumber: Double, lineNumber: Double, sourceUri: Uri): HttpDiagnosticSourceLocation = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], sourceUri = sourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticSourceLocation]
  }
}

