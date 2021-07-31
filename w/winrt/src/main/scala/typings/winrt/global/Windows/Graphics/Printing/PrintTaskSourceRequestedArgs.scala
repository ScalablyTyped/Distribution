package typings.winrt.global.Windows.Graphics.Printing

import typings.std.Date
import typings.winrt.Windows.Graphics.Printing.IPrintDocumentSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintTaskSourceRequestedArgs")
@js.native
class PrintTaskSourceRequestedArgs ()
  extends StObject
     with typings.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedArgs {
  
  /* CompleteClass */
  var deadline: Date = js.native
  
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedDeferral = js.native
  
  /* CompleteClass */
  override def setSource(source: IPrintDocumentSource): Unit = js.native
}
