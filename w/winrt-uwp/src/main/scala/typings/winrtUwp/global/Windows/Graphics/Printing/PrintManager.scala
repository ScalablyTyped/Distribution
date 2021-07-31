package typings.winrtUwp.global.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Informs Windows that an application wishes to participate in printing. The PrintManager class is also used for programmatically initiating printing. */
@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
abstract class PrintManager ()
  extends StObject
     with typings.winrtUwp.Windows.Graphics.Printing.PrintManager
object PrintManager {
  
  @JSGlobal("Windows.Graphics.Printing.PrintManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Retrieves the PrintManager object associated with the current window.
    * @return The PrintManager object.
    */
  /* static member */
  @scala.inline
  def getForCurrentView(): typings.winrtUwp.Windows.Graphics.Printing.PrintManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.Graphics.Printing.PrintManager]
  
  /**
    * Programmatically initiates the user interface for printing content.
    * @return A Boolean value to indicate a TRUE for success or a FALSE for a failure.
    */
  /* static member */
  @scala.inline
  def showPrintUIAsync(): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("showPrintUIAsync")().asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
}
