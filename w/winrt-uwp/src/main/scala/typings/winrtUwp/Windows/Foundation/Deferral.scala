package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores a DeferralCompletedHandler to be invoked upon completion of the deferral and manipulates the state of the deferral. */
trait Deferral extends js.Object {
  /** If the DeferralCompletedHandler has not yet been invoked, this will call it and drop the reference to the delegate. */
  def close(): Unit
  /** If the DeferralCompletedHandler has not yet been invoked, this will call it and drop the reference to the delegate. */
  def complete(): Unit
}

object Deferral {
  @scala.inline
  def apply(close: () => Unit, complete: () => Unit): Deferral = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[Deferral]
  }
}

