package typings.winrtDashUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the Completed event of the 3D print request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletedEventArgs")
@js.native
abstract class Print3DTaskCompletedEventArgs () extends js.Object {
  /** Gets the status of the 3D print request. */
  var completion: Print3DTaskCompletion = js.native
  /** Gets the type of error encountered during the 3D print request. */
  var extendedStatus: Print3DTaskDetail = js.native
}

