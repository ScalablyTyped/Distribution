package typings.winrtUwp.global.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the DataRequested event. The system fires this event when the user invokes the Share UI. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs")
@js.native
abstract class DataRequestedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs {
  /** Enables you to get the DataRequest object and either give it data or a failure message. */
  /* CompleteClass */
  override var request: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequest = js.native
}

