package typings.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information for the DialRequested event. */
@JSGlobal("Windows.Media.Devices.DialRequestedEventArgs")
@js.native
abstract class DialRequestedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Devices.DialRequestedEventArgs {
  /** Returns the contact that was dialed. */
  /* CompleteClass */
  override var contact: js.Any = js.native
  /** Indicates that the DialRequested event has been handled. */
  /* CompleteClass */
  override def handled(): Unit = js.native
}

