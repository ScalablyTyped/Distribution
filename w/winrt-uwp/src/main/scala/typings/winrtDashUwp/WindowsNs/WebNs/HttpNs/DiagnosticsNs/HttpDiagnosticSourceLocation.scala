package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the source location of the HTTP activity. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation")
@js.native
abstract class HttpDiagnosticSourceLocation () extends js.Object {
  /** Gets the column number. */
  var columnNumber: Double = js.native
  /** Gets the line number. */
  var lineNumber: Double = js.native
  /** Gets the source URI. */
  var sourceUri: Uri = js.native
}

