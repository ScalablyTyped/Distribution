package typings.winrtUwp.Windows.Graphics.Printing

import typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.completed
import typings.winrtUwp.winrtUwpStrings.previewing
import typings.winrtUwp.winrtUwpStrings.progressing
import typings.winrtUwp.winrtUwpStrings.submitting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a printing operation including the content to be printed, as well as providing access to information describing how the content is to be printed. */
@js.native
trait PrintTask extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(`type`: completed, listener: TypedEventHandler[PrintTask, PrintTaskCompletedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_previewing(`type`: previewing, listener: TypedEventHandler[PrintTask, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progressing(`type`: progressing, listener: TypedEventHandler[PrintTask, PrintTaskProgressingEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submitting(`type`: submitting, listener: TypedEventHandler[PrintTask, _]): Unit = js.native
  
  /** Gets or sets a value that indicates whether the PrintTask supports 3D manufacturing devices, like a 3D printer. */
  var is3DManufacturingTargetEnabled: Boolean = js.native
  
  /** Gets or sets a value indicating whether the PrintTask supports printer targets. */
  var isPrinterTargetEnabled: Boolean = js.native
  
  /** Raised when the print task is completed. */
  def oncompleted(ev: PrintTaskCompletedEventArgs with WinRTEvent[PrintTask]): Unit = js.native
  /** Raised when the print task is completed. */
  @JSName("oncompleted")
  var oncompleted_Original: TypedEventHandler[PrintTask, PrintTaskCompletedEventArgs] = js.native
  
  /** Raised when the print system initializes print preview mode. */
  def onpreviewing(ev: js.Any with WinRTEvent[PrintTask]): Unit = js.native
  /** Raised when the print system initializes print preview mode. */
  @JSName("onpreviewing")
  var onpreviewing_Original: TypedEventHandler[PrintTask, _] = js.native
  
  /** Raised to provide progress information about how much of the printed content has been submitted to the print subsystem for printing. */
  def onprogressing(ev: PrintTaskProgressingEventArgs with WinRTEvent[PrintTask]): Unit = js.native
  /** Raised to provide progress information about how much of the printed content has been submitted to the print subsystem for printing. */
  @JSName("onprogressing")
  var onprogressing_Original: TypedEventHandler[PrintTask, PrintTaskProgressingEventArgs] = js.native
  
  /** Raised when a print task begins submitting content to the print subsystem to be printed. */
  def onsubmitting(ev: js.Any with WinRTEvent[PrintTask]): Unit = js.native
  /** Raised when a print task begins submitting content to the print subsystem to be printed. */
  @JSName("onsubmitting")
  var onsubmitting_Original: TypedEventHandler[PrintTask, _] = js.native
  
  /** Retrieves the PrintTaskOptions for the print task that defines how the content is to be formatted for printing. */
  var options: PrintTaskOptions = js.native
  
  /** Retrieves a set of properties associated with the PrintTask . */
  var properties: DataPackagePropertySet = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(`type`: completed, listener: TypedEventHandler[PrintTask, PrintTaskCompletedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_previewing(`type`: previewing, listener: TypedEventHandler[PrintTask, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progressing(`type`: progressing, listener: TypedEventHandler[PrintTask, PrintTaskProgressingEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submitting(`type`: submitting, listener: TypedEventHandler[PrintTask, _]): Unit = js.native
  
  /** Returns a pointer to the app-provided object that represents the content to be printed. This object must support the IPrintDocumentSource interface. */
  var source: IPrintDocumentSource = js.native
}
