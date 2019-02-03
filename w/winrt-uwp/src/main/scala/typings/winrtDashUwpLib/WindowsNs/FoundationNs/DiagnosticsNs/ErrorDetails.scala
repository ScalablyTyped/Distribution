package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an error that occurred. */
@JSGlobal("Windows.Foundation.Diagnostics.ErrorDetails")
@js.native
abstract class ErrorDetails () extends js.Object {
  /** Gets a short description of the error. */
  var description: java.lang.String = js.native
  /** Gets the address to a help page about the error. */
  var helpUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets a detailed description of the error. */
  var longDescription: java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.Foundation.Diagnostics.ErrorDetails")
@js.native
object ErrorDetails extends js.Object {
  /**
    * Asynchronously creates an ErrorDetails object based on an HRESULT error code.
    * @param errorCode The unique code representing the error.
    * @return The newly created ErrorDetails object representing the error.
    */
  def createFromHResultAsync(errorCode: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorDetails] = js.native
}

