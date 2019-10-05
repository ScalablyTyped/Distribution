package typings.winrtDashUwp.Windows.Foundation.Diagnostics

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an error that occurred. */
@JSGlobal("Windows.Foundation.Diagnostics.ErrorDetails")
@js.native
abstract class ErrorDetails () extends js.Object {
  /** Gets a short description of the error. */
  var description: String = js.native
  /** Gets the address to a help page about the error. */
  var helpUri: Uri = js.native
  /** Gets a detailed description of the error. */
  var longDescription: String = js.native
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
  def createFromHResultAsync(errorCode: Double): IPromiseWithIAsyncOperation[ErrorDetails] = js.native
}

