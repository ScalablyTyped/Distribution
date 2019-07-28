package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.printtaskrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Informs Windows that an application wishes to participate in printing. The PrintManager class is also used for programmatically initiating printing. */
@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
abstract class PrintManager () extends js.Object {
  /** Raised when a request to print has occurred. This event may be triggered by user action or via programmatic invocation of printing via the ShowPrintUIAsync method. */
  @JSName("onprinttaskrequested")
  var onprinttaskrequested_Original: TypedEventHandler[PrintManager, PrintTaskRequestedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_printtaskrequested(`type`: printtaskrequested, listener: TypedEventHandler[PrintManager, PrintTaskRequestedEventArgs]): Unit = js.native
  /** Raised when a request to print has occurred. This event may be triggered by user action or via programmatic invocation of printing via the ShowPrintUIAsync method. */
  def onprinttaskrequested(ev: PrintTaskRequestedEventArgs with WinRTEvent[PrintManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_printtaskrequested(`type`: printtaskrequested, listener: TypedEventHandler[PrintManager, PrintTaskRequestedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
object PrintManager extends js.Object {
  /**
    * Retrieves the PrintManager object associated with the current window.
    * @return The PrintManager object.
    */
  def getForCurrentView(): PrintManager = js.native
  /**
    * Programmatically initiates the user interface for printing content.
    * @return A Boolean value to indicate a TRUE for success or a FALSE for a failure.
    */
  def showPrintUIAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}

