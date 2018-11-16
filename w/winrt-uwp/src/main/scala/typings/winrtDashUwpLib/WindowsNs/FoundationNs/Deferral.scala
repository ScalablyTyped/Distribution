package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores a DeferralCompletedHandler to be invoked upon completion of the deferral and manipulates the state of the deferral. */
@JSGlobal("Windows.Foundation.Deferral")
@js.native
class Deferral protected () extends js.Object {
  /**
               * Initializes a new Deferral object and specifies a DeferralCompletedHandler to be called upon completion of the deferral.
               * @param handler A DeferralCompletedHandler to be called upon completion of the deferral.
               */
  def this(handler: DeferralCompletedHandler) = this()
  /** If the DeferralCompletedHandler has not yet been invoked, this will call it and drop the reference to the delegate. */
  def close(): scala.Unit = js.native
  /** If the DeferralCompletedHandler has not yet been invoked, this will call it and drop the reference to the delegate. */
  def complete(): scala.Unit = js.native
}

