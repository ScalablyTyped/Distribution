package typings.winrt.Windows.Graphics.Printing

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskRequest extends StObject {
  
  def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): PrintTask
  
  var deadline: Date
  
  def getDeferral(): PrintTaskRequestedDeferral
}
object IPrintTaskRequest {
  
  inline def apply(
    createPrintTask: (String, PrintTaskSourceRequestedHandler) => PrintTask,
    deadline: Date,
    getDeferral: () => PrintTaskRequestedDeferral
  ): IPrintTaskRequest = {
    val __obj = js.Dynamic.literal(createPrintTask = js.Any.fromFunction2(createPrintTask), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IPrintTaskRequest]
  }
  
  extension [Self <: IPrintTaskRequest](x: Self) {
    
    inline def setCreatePrintTask(value: (String, PrintTaskSourceRequestedHandler) => PrintTask): Self = StObject.set(x, "createPrintTask", js.Any.fromFunction2(value))
    
    inline def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => PrintTaskRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
