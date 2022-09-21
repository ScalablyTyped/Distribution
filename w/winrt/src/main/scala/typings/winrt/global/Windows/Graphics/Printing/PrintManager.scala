package typings.winrt.global.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
open class PrintManager ()
  extends StObject
     with typings.winrt.Windows.Graphics.Printing.PrintManager {
  
  /* CompleteClass */
  var onprinttaskrequested: Any = js.native
}
/* static members */
object PrintManager {
  
  @JSGlobal("Windows.Graphics.Printing.PrintManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getForCurrentView(): typings.winrt.Windows.Graphics.Printing.PrintManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.Graphics.Printing.PrintManager]
  
  inline def showPrintUIAsync(): IAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("showPrintUIAsync")().asInstanceOf[IAsyncOperation[Boolean]]
}
