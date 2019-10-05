package typings.winrtDashUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TaskRequested event. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskRequestedEventArgs")
@js.native
abstract class Print3DTaskRequestedEventArgs () extends js.Object {
  /** Gets the 3D print job request associated with the Print3DManager . */
  var request: Print3DTaskRequest = js.native
}

