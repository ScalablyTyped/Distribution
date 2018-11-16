package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the source location of the HTTP activity. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation")
@js.native
abstract class HttpDiagnosticSourceLocation () extends js.Object {
  /** Gets the column number. */
  var columnNumber: scala.Double = js.native
  /** Gets the line number. */
  var lineNumber: scala.Double = js.native
  /** Gets the source URI. */
  var sourceUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
}

