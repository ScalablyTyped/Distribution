package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the request from the system to create a print task. This object is available from the PrintTaskRequestedEventArgs object passed to the PrintTaskRequested event. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskRequest")
@js.native
abstract class PrintTaskRequest () extends js.Object {
  /** Gets a DateTime value that indicates how long an app has to respond to the PrintTaskRequested event. If the system has not received a response from the PrintTaskRequested event handler by the time the deadline is reached, then the print task is ignored. */
  var deadline: stdLib.Date = js.native
  /**
    * Creates a new PrintTask which indicates that the app has content to be printed.
    * @param title Title for the print task.
    * @param handler Pointer to a PrintTaskSourceRequestedHandler delegate for the print task.
    * @return Pointer to the print task that was created.
    */
  def createPrintTask(title: java.lang.String, handler: PrintTaskSourceRequestedHandler): PrintTask = js.native
  /**
    * Retrieves the deferral object associated with the PrintTaskRequest . The deferral object is used to handle asynchronous calls in the PrintTaskRequested event handler.
    * @return The PrintTaskRequestedDeferral for a print task.
    */
  def getDeferral(): PrintTaskRequestedDeferral = js.native
}

