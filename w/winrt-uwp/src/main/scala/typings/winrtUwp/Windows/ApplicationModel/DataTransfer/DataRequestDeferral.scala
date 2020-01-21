package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to exchange content with a target app asynchronously. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestDeferral")
@js.native
abstract class DataRequestDeferral () extends js.Object {
  /** Indicates that the content for an asynchronous share is ready for a target app, or that an error in the sharing operation occurred. */
  def complete(): Unit = js.native
}

