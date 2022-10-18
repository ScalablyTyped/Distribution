package typings.winrtUwp.global.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Graphics.Printing.PrintTaskSourceRequestedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the request from the system to create a print task. This object is available from the PrintTaskRequestedEventArgs object passed to the PrintTaskRequested event. */
/* note: abstract class */ @JSGlobal("Windows.Graphics.Printing.PrintTaskRequest")
@js.native
open class PrintTaskRequest ()
  extends StObject
     with typings.winrtUwp.Windows.Graphics.Printing.PrintTaskRequest {
  
  /**
    * Creates a new PrintTask which indicates that the app has content to be printed.
    * @param title Title for the print task.
    * @param handler Pointer to a PrintTaskSourceRequestedHandler delegate for the print task.
    * @return Pointer to the print task that was created.
    */
  /* CompleteClass */
  override def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): typings.winrtUwp.Windows.Graphics.Printing.PrintTask = js.native
  
  /** Gets a DateTime value that indicates how long an app has to respond to the PrintTaskRequested event. If the system has not received a response from the PrintTaskRequested event handler by the time the deadline is reached, then the print task is ignored. */
  /* CompleteClass */
  var deadline: js.Date = js.native
  
  /**
    * Retrieves the deferral object associated with the PrintTaskRequest . The deferral object is used to handle asynchronous calls in the PrintTaskRequested event handler.
    * @return The PrintTaskRequestedDeferral for a print task.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.Graphics.Printing.PrintTaskRequestedDeferral = js.native
}
