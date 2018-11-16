package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a printing operation including the content to be printed, as well as providing access to information describing how the content is to be printed. */
@JSGlobal("Windows.Graphics.Printing.PrintTask")
@js.native
abstract class PrintTask () extends js.Object {
  /** Gets or sets a value that indicates whether the PrintTask supports 3D manufacturing devices, like a 3D printer. */
  var is3DManufacturingTargetEnabled: scala.Boolean = js.native
  /** Gets or sets a value indicating whether the PrintTask supports printer targets. */
  var isPrinterTargetEnabled: scala.Boolean = js.native
  /** Raised when the print task is completed. */
  @JSName("oncompleted")
  var oncompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, PrintTaskCompletedEventArgs] = js.native
  /** Raised when the print system initializes print preview mode. */
  @JSName("onpreviewing")
  var onpreviewing_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, _] = js.native
  /** Raised to provide progress information about how much of the printed content has been submitted to the print subsystem for printing. */
  @JSName("onprogressing")
  var onprogressing_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, PrintTaskProgressingEventArgs] = js.native
  /** Raised when a print task begins submitting content to the print subsystem to be printed. */
  @JSName("onsubmitting")
  var onsubmitting_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, _] = js.native
  /** Retrieves the PrintTaskOptions for the print task that defines how the content is to be formatted for printing. */
  var options: PrintTaskOptions = js.native
  /** Retrieves a set of properties associated with the PrintTask . */
  var properties: winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackagePropertySet = js.native
  /** Returns a pointer to the app-provided object that represents the content to be printed. This object must support the IPrintDocumentSource interface. */
  var source: IPrintDocumentSource = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, PrintTaskCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_previewing(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.previewing,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progressing(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.progressing,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, PrintTaskProgressingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submitting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.submitting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, _]
  ): scala.Unit = js.native
  /** Raised when the print task is completed. */
  def oncompleted(ev: PrintTaskCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PrintTask]): scala.Unit = js.native
  /** Raised when the print system initializes print preview mode. */
  def onpreviewing(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PrintTask]): scala.Unit = js.native
  /** Raised to provide progress information about how much of the printed content has been submitted to the print subsystem for printing. */
  def onprogressing(ev: PrintTaskProgressingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PrintTask]): scala.Unit = js.native
  /** Raised when a print task begins submitting content to the print subsystem to be printed. */
  def onsubmitting(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PrintTask]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, PrintTaskCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_previewing(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.previewing,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progressing(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.progressing,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, PrintTaskProgressingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submitting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.submitting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTask, _]
  ): scala.Unit = js.native
}

