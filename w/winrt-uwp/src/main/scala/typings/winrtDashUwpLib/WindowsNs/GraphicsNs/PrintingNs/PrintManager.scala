package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Informs Windows that an application wishes to participate in printing. The PrintManager class is also used for programmatically initiating printing. */
@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
abstract class PrintManager () extends js.Object {
  /** Raised when a request to print has occurred. This event may be triggered by user action or via programmatic invocation of printing via the ShowPrintUIAsync method. */
  @JSName("onprinttaskrequested")
  var onprinttaskrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintManager, PrintTaskRequestedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_printtaskrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.printtaskrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintManager, PrintTaskRequestedEventArgs]
  ): scala.Unit = js.native
  /** Raised when a request to print has occurred. This event may be triggered by user action or via programmatic invocation of printing via the ShowPrintUIAsync method. */
  def onprinttaskrequested(ev: PrintTaskRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PrintManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_printtaskrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.printtaskrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintManager, PrintTaskRequestedEventArgs]
  ): scala.Unit = js.native
}

/** Informs Windows that an application wishes to participate in printing. The PrintManager class is also used for programmatically initiating printing. */
@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
object PrintManager extends js.Object {
  /**
                   * Retrieves the PrintManager object associated with the current window.
                   * @return The PrintManager object.
                   */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintManager = js.native
  /**
                   * Programmatically initiates the user interface for printing content.
                   * @return A Boolean value to indicate a TRUE for success or a FALSE for a failure.
                   */
  def showPrintUIAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

