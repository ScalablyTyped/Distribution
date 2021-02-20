package typings.winrt.Windows.Graphics.Printing

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskRequest extends StObject {
  
  def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): PrintTask = js.native
  
  var deadline: Date = js.native
  
  def getDeferral(): PrintTaskRequestedDeferral = js.native
}
object IPrintTaskRequest {
  
  @scala.inline
  def apply(
    createPrintTask: (String, PrintTaskSourceRequestedHandler) => PrintTask,
    deadline: Date,
    getDeferral: () => PrintTaskRequestedDeferral
  ): IPrintTaskRequest = {
    val __obj = js.Dynamic.literal(createPrintTask = js.Any.fromFunction2(createPrintTask), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IPrintTaskRequest]
  }
  
  @scala.inline
  implicit class IPrintTaskRequestMutableBuilder[Self <: IPrintTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatePrintTask(value: (String, PrintTaskSourceRequestedHandler) => PrintTask): Self = StObject.set(x, "createPrintTask", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => PrintTaskRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
