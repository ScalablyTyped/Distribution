package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the request from the system to create a print task. This object is available from the PrintTaskRequestedEventArgs object passed to the PrintTaskRequested event. */
trait PrintTaskRequest extends StObject {
  
  /**
    * Creates a new PrintTask which indicates that the app has content to be printed.
    * @param title Title for the print task.
    * @param handler Pointer to a PrintTaskSourceRequestedHandler delegate for the print task.
    * @return Pointer to the print task that was created.
    */
  def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): PrintTask
  
  /** Gets a DateTime value that indicates how long an app has to respond to the PrintTaskRequested event. If the system has not received a response from the PrintTaskRequested event handler by the time the deadline is reached, then the print task is ignored. */
  var deadline: js.Date
  
  /**
    * Retrieves the deferral object associated with the PrintTaskRequest . The deferral object is used to handle asynchronous calls in the PrintTaskRequested event handler.
    * @return The PrintTaskRequestedDeferral for a print task.
    */
  def getDeferral(): PrintTaskRequestedDeferral
}
object PrintTaskRequest {
  
  inline def apply(
    createPrintTask: (String, PrintTaskSourceRequestedHandler) => PrintTask,
    deadline: js.Date,
    getDeferral: () => PrintTaskRequestedDeferral
  ): PrintTaskRequest = {
    val __obj = js.Dynamic.literal(createPrintTask = js.Any.fromFunction2(createPrintTask), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[PrintTaskRequest]
  }
  
  extension [Self <: PrintTaskRequest](x: Self) {
    
    inline def setCreatePrintTask(value: (String, PrintTaskSourceRequestedHandler) => PrintTask): Self = StObject.set(x, "createPrintTask", js.Any.fromFunction2(value))
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => PrintTaskRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
