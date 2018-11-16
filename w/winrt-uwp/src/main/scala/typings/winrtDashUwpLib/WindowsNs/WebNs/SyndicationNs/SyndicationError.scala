package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error encountered during a Syndication operation. */
@JSGlobal("Windows.Web.Syndication.SyndicationError")
@js.native
abstract class SyndicationError () extends js.Object

/** Represents an error encountered during a Syndication operation. */
@JSGlobal("Windows.Web.Syndication.SyndicationError")
@js.native
object SyndicationError extends js.Object {
  /**
                   * Gets the specific error using the returned HRESULT value. Possible values are defined by SyndicationErrorStatus .
                   * @param hresult An HRESULT returned during the operation.
                   * @return The error encountered.
                   */
  def getStatus(hresult: scala.Double): winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus = js.native
}

