package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferred process that will halt a thread until the deferral is complete. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangedDeferral")
@js.native
abstract class EmailMailboxChangedDeferral () extends js.Object {
  /** Indicates to waiting processes that the deferral is complete. */
  def complete(): Unit = js.native
}

