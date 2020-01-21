package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D print job request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskRequest")
@js.native
abstract class Print3DTaskRequest () extends js.Object {
  /**
    * Creates a 3D print job.
    * @param title The name of the print job.
    * @param printerId The identifier of the 3D printer.
    * @param handler The callback for the source of the print job request.
    * @return The 3D print job.
    */
  def createTask(title: String, printerId: String, handler: Print3DTaskSourceRequestedHandler): Print3DTask = js.native
}

