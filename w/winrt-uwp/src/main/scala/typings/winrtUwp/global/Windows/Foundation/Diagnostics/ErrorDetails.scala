package typings.winrtUwp.global.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an error that occurred. */
@JSGlobal("Windows.Foundation.Diagnostics.ErrorDetails")
@js.native
abstract class ErrorDetails ()
  extends typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorDetails

/* static members */
@JSGlobal("Windows.Foundation.Diagnostics.ErrorDetails")
@js.native
object ErrorDetails extends js.Object {
  /**
    * Asynchronously creates an ErrorDetails object based on an HRESULT error code.
    * @param errorCode The unique code representing the error.
    * @return The newly created ErrorDetails object representing the error.
    */
  def createFromHResultAsync(errorCode: Double): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorDetails] = js.native
}

