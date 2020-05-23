package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to exchange content with a target app asynchronously. */
trait DataRequestDeferral extends js.Object {
  /** Indicates that the content for an asynchronous share is ready for a target app, or that an error in the sharing operation occurred. */
  def complete(): Unit
}

object DataRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): DataRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[DataRequestDeferral]
  }
}

