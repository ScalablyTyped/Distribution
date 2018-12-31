package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the deferral process. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangedEventArgs")
@js.native
abstract class EmailMailboxChangedEventArgs () extends js.Object {
  /**
    * Gets the deferral object.
    * @return The deferral object.
    */
  def getDeferral(): EmailMailboxChangedDeferral = js.native
}

