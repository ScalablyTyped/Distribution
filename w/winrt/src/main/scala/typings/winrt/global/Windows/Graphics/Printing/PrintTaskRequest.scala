package typings.winrt.global.Windows.Graphics.Printing

import typings.std.Date
import typings.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintTaskRequest")
@js.native
class PrintTaskRequest ()
  extends StObject
     with typings.winrt.Windows.Graphics.Printing.PrintTaskRequest {
  
  /* CompleteClass */
  override def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): typings.winrt.Windows.Graphics.Printing.PrintTask = js.native
  
  /* CompleteClass */
  var deadline: Date = js.native
  
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.Graphics.Printing.PrintTaskRequestedDeferral = js.native
}
